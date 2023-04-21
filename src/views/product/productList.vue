<template>
    <div class="productList">
        <FormTopDesc desc="PRODUCT LIST"></FormTopDesc>
        <div class="pl-top">
            <div class="pl-top-title">My Loan History </div>
            <div class="pl-top-btn" @click="$router.push('/loan')">View</div>
        </div>
        <!-- 产品列表 -->
        <div class="productList-list" v-for="(item, index) in list">
            <div class="pl-top">
                <div class="pl-top-img">
                    <img :src="productIcon(item.icon)" alt="">
                </div>
                <div class="pl-top-name">{{ item.name }}</div>
                <div v-if="!isShow" class="pl-top-status" @click="put(item, index)">put away</div>
                <div v-else class="pl-top-status" @click="unfold(item)">unfold</div>
            </div>
            <div class="pl-content" @click="doClick(item, index)">
                <div class="pl-c-show">
                    <ul class="pl-cs-l">
                        <li>Loan amount (₹)</li>
                        <li>Loan Period (Days)</li>
                    </ul>
                    <ul class="pl-cs-r">
                        <li>{{ item.amount }}</li>
                        <li>{{ item.term }}</li>
                    </ul>
                </div>
            </div>
            <!-- 详细信息 -->
            <div class="details" @click="doClick(item, index)" :class="{ hide: isShow }">
                <div class="line"></div>
                <div class="d-info">
                    <ul class="d-l">
                        <li>Loan Amount</li>
                        <li>Loan Period (Days)</li>
                        <li>Loan Date</li>
                    </ul>
                    <ul class="d-r">
                        <li>₹ {{ item.amount }}</li>
                        <li>{{ item.term }} {{ item.termUnit }}</li>
                        <li>{{ new Date(item.created).toLocaleDateString() }}</li>
                    </ul>
                </div>
            </div>
            <!-- 选择框 -->
            <div class="s" @click="doClick(item, index)">
                <div class="select">
                    <img v-if="checked !== index" src="../../assets/goodlist.png" alt="">
                    <img v-else src="../../assets/goodlist-m.png" alt="">
                </div>
            </div>
        </div>
        <!-- 手续费试算 -->
        <van-dialog v-model="show" :showCancelButton="false" :showConfirmButton="false">
            <ProductDialog @closeDialog="show = false"></ProductDialog>
        </van-dialog>
        <!-- 贷款按钮 -->
        <div class="apply" @click="doApply">Apply</div>
    </div>
</template>
<script>
import { add, unt } from "../../utils/AESKey.js";
import { getOrderListAPI, getOrderPayAPI } from "../../api";
import ProductDialog from "./productDialog";
import { Toast } from "vant";
export default {
    components: { ProductDialog },
    data() {
        return {
            count: '',
            isShow: false,
            checked: '',
            list: [],//产品的数据
            show: false,//弹框的布尔值
            item: '',//点击选中的商品
        }
    },
    methods: {
        //去贷款
        async doApply() {
            if (this.checked === '') {
                Toast('请勾选产品')
                return
            }
            this.show = true
        },
        //点击产品时
        doClick(item, index) {
            this.checked = index
            this.item = item
            this.$store.commit('setProductId', this.item.id)
            console.log(this.item, index)
        },
        //收齐按钮
        put(item, index) {
            this.isShow = true
        },
        //展开
        unfold() {
            this.isShow = false
        },
        //获取产品列表
        async getProductList() {
            const res = await getOrderListAPI(add({ query: {} }))
            this.list = unt(res.data).page.content
            console.log(unt(res.data), '获取到的产品数据')
        },
        //图标
        productIcon(icon) {
            return `https://app.cashviolin.xyz/lt-image/resize/0x0/${icon}`
        }
    },
    created() {
        this.getProductList()
    },
}
</script>
<style lang="less" scoped>
.productList {
    width: 100vw;
    background-color: #f5f5f5;
    padding-top: (80/@a);
    padding-bottom: (40/@a);
    min-height: (667/@a);

    .hide {
        display: none;
        transition: all 0.5s;
    }

    .productList-list {
        margin-left: (19/@a);
        margin-top: (20/@a);
        margin-bottom: (60/@a);

        .pl-top {
            width: (336/@a);
            height: (43/@a);
            background-color: #d8929b;
            display: flex;
            justify-content: space-around;
            align-items: center;
            border-radius: (10/@a) (10/@a) 0 0;

            .pl-top-img {
                width: (29/@a);
                height: (29/@a);
                margin-left: (14/@a);

                img {
                    width: 100%;
                }
            }

            .pl-top-name {
                flex: 1;
                margin-left: (8/@a);
                font-size: (13/@a);
                font-family: Alibaba PuHuiTi;
                font-weight: bold;
                color: #FEFEFE;
            }

            .pl-top-status {
                font-size: (13/@a);
                font-family: Alibaba PuHuiTi;
                font-weight: 500;
                text-align: center;
                line-height: (24/@a);
                color: #FFFFFF;
                margin-right: (13/@a);
                width: (57/@a);
                height: (24/@a);
                background: #FFB93E;
                border-radius: (5/@a);
            }
        }

        .pl-content {
            width: (336/@a);
            background-color: #fff;
            padding: (14/@a);
            padding-bottom: 0;

            .pl-c-show {
                display: flex;
                justify-content: space-between;

                .pl-cs-l {
                    li {
                        font-size: (16/@a);
                        font-family: Alibaba PuHuiTi;
                        font-weight: bold;
                        color: #383838;
                        margin-bottom: (10/@a);
                    }
                }

                .pl-cs-r {
                    li {
                        font-size: (16/@a);
                        font-family: Alibaba PuHuiTi;
                        font-weight: bold;
                        color: #D8929B;
                        margin-bottom: (10/@a);
                    }
                }
            }
        }

        .details {
            width: (336/@a);
            background-color: #fff;

            .d-info {
                margin-top: (20/@a);
                display: flex;
                justify-content: space-between;

                .d-l {
                    margin-left: (14/@a);

                    li {
                        font-size: (13/@a);
                        font-family: Alibaba PuHuiTi;
                        font-weight: 400;
                        color: #363636;
                        margin-bottom: (16/@a);
                    }
                }

                .d-r {
                    margin-right: (14/@a);
                    text-align: right;

                    li {
                        font-size: (13/@a);
                        font-family: Alibaba PuHuiTi;
                        font-weight: 400;
                        color: #818181;
                        margin-bottom: (16/@a);
                    }
                }
            }

            .line {
                width: (309/@a);
                height: (1/@a);
                background: #D8929B;
                margin-left: (14/@a);
            }
        }

        .s {
            width: (336/@a);
            background-color: #fff;
            padding-bottom: (10/@a);

            .select {
                width: (33/@a);
                height: (33/@a);
                margin-left: (151/@a);

                img {
                    width: 100%;
                }
            }
        }

    }

    .apply {
        position: fixed;
        bottom: (20/@a);
        left: 0;
        width: (241/@a);
        height: (53/@a);
        background: #E1A08B;
        border-radius: (10/@a);
        margin-left: (68/@a);
        margin-top: (30/@a);
        text-align: center;
        line-height: (52/@a);
        font-size: (19/@a);
        font-family: Alibaba PuHuiTi;
        font-weight: bold;
        color: #FFFFFF;
    }

    .pl-top {
        display: flex;
        justify-content: space-between;

        .pl-top-title {
            font-size: 16px;
            font-family: Nirmala UI;
            font-weight: bold;
            color: #000000;
            margin-left: (19/@a);
        }

        .pl-top-btn {
            width: (58/@a);
            height: (26/@a);
            background: #E1A08B;
            border-radius: (5/@a);
            text-align: center;
            line-height: (26/@a);
            font-size: (13/@a);
            font-family: Nirmala UI;
            font-weight: bold;
            color: #FFFFFF;
            margin-right: (20/@a);
        }
    }
}
</style>