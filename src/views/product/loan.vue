<template>
    <div class="loan">
        <TopDesc desc="MY LOAN"></TopDesc>
        <!-- 顶部导航栏 -->
        <ul class="title">
            <li v-for="(item, index) in titleList" @click="doClick(item, index)" :key="item.id"
                :class="{ active: item.id === $store.state.count }">{{ item.name }}
            </li>
        </ul>
        <!-- 产品列表 -->
        <div class="goodlist" v-for="item in list">
            <div class="gl-top">
                <div class="gl-top-img">
                    <img :src="toIcon(item.product.icon)" alt="">
                </div>
                <div class="gl-top-name">{{ item.product.name }}</div>
                <div class="gl-top-status" @click="doStatusBtn(item)" :style="{ 'background-color': item.statusColor }">
                    {{ item.status }}</div>
            </div>
            <div class="gl-content">
                <ul class="gl-l">
                    <li>Loan Amount</li>
                    <li>Loan Period (Days)</li>
                    <li>Loan Date</li>
                    <li>Loan Note Number</li>
                    <li v-if="item.status === 'PASS' || item.status === 'LOAN_SUCCESS'">Ask Questions</li>
                </ul>
                <ul class="gl-r">
                    <li>₹ {{ item.amount }}</li>
                    <li>{{ item.term }} {{ item.termUnit }}</li>
                    <li>{{ new Date(item.created).toLocaleDateString() }}</li>
                    <li>{{ item.id }}</li>
                    <li class="li-img" v-if="item.status === 'PASS' || item.status === 'LOAN_SUCCESS'"
                        @click="$router.push('/askQuestions')">
                        <img src="../../assets/kefu-logo.png" alt="">
                    </li>
                </ul>
            </div>
        </div>
        <noQuestions v-if="!list.length" desc="show no pre-order"></noQuestions>
        <!-- 按钮 -->
        <!-- <div class="btn" v-if="list.length">Submit</div> -->
    </div>
</template>
<script>
import { getDingDanListAPI, dingdanhuankuanAPI } from "../../api";
import { add, unt } from "../../utils/AESKey.js";
import noQuestions from '../kefu/noQuestions'
import { Toast } from "vant";
export default {
    components: { noQuestions },
    data() {
        return {
            //标题list
            titleList: [
                { id: 0, name: 'All', msg: null },
                { id: 1, name: 'Success', msg: 'LOAN_SUCCESS' },
                { id: 2, name: 'Overdue', msg: 'DUNNING' },
                { id: 3, name: 'Finish', msg: 'FINISH' },
            ],
            //订单list
            list: []
        }
    },
    methods: {
        //切换顶部导航栏
        doClick(item, index) {
            // this.count = item.id
            this.$store.commit('changeCount', index)
            console.log(item.name)
            this.getOrderList(item.msg)
        },
        //点击去还款
        async doStatusBtn(item) {
            if (!item.loan) {
                Toast(item.statusNote)
                return
            }
            //将id存入vuex
            this.$store.commit('setOrderId', item.id)
            const f = {
                model: {
                    orderId: ''
                }
            }
            f.model.orderId = this.$store.state.orderId
            const res = await dingdanhuankuanAPI(add(f))
            this.$store.commit('setOrderInfo', unt(res.data).model)
            this.$router.push('/topay')
            // console.log(unt(res.data).model)
        },
        //获取订单列表
        async getOrderList(status) {
            const f = {
                query: {
                    status: status,
                    pageNo: 1,
                    pageSize: 99
                }
            }
            const res = await getDingDanListAPI(add(f))
            console.log(unt(res.data), '获取列表')
            this.list = unt(res.data).page.content
        },
        //图片转换
        toIcon(icon) {
            return `https://app.cashviolin.xyz/lt-image/resize/0x0/${icon}`
        }
    },
    created() {
        this.getOrderList()
    }
}
</script>
<style lang="less" scoped>
.loan {
    padding-top: (80/@a);
    min-height: (667/@a);
    width: 100vw;
    background-color: #f5f5f5;
    padding-bottom: (26/@a);

    .title {
        display: flex;
        margin-left: (19/@a);

        li {
            width: (83/@a);
            height: (39/@a);
            background: #D5D5D5;
            border-radius: (5/@a);
            font-size: (16/@a);
            text-align: center;
            line-height: (39/@a);
            font-family: Alibaba PuHuiTi;
            font-weight: bold;
            color: #FEFEFE;
            margin-right: (1/@a);
        }

        .active {
            background: #e1a08b;
        }
    }

    .goodlist {
        margin-left: (19/@a);
        margin-top: (9/@a);

        .gl-top {
            width: (336/@a);
            height: (43/@a);
            background-color: #d8929b;
            display: flex;
            justify-content: space-around;
            align-items: center;
            border-radius: (10/@a) (10/@a) 0 0;

            .gl-top-img {
                width: (29/@a);
                height: (29/@a);
                margin-left: (14/@a);

                img {
                    width: 100%;
                }
            }

            .gl-top-name {
                flex: 1;
                margin-left: (8/@a);
                font-size: (13/@a);
                font-family: Alibaba PuHuiTi;
                font-weight: bold;
                color: #FEFEFE;
            }

            .gl-top-status {
                flex: 1;
                font-size: (13/@a);
                font-family: Alibaba PuHuiTi;
                font-weight: 500;
                text-align: center;
                line-height: (24/@a);
                color: #FFFFFF;
                margin-right: (13/@a);
                width: (57/@a);
                height: (24/@a);
                border-radius: (5/@a);
            }
        }

        .gl-content {
            width: (336/@a);
            background-color: #fff;
            display: flex;
            justify-content: space-around;
            padding-top: (13/@a);
            padding-bottom: (13/@a);

            .gl-l {
                li {
                    font-size: (13/@a);
                    font-family: Alibaba PuHuiTi;
                    font-weight: 400;
                    color: #767676;
                    margin-bottom: (13/@a);
                }
            }

            .gl-r {
                text-align: right;

                li {
                    font-size: (13/@a);
                    font-family: Alibaba PuHuiTi;
                    font-weight: 400;
                    color: #E1A08B;
                    margin-bottom: (13/@a);


                }

                .li-img {
                    width: (22/@a);
                    height: (15/@a);
                    margin-left: (110/@a);

                    img {
                        width: 100%;
                    }
                }
            }
        }
    }

    .btn {
        width: (330/@a);
        height: (52/@a);
        border-radius: (10/@a);
        background-color: #E1A08B;
        font-size: 19px;
        font-family: Nirmala UI;
        font-weight: bold;
        color: #FEFEFE;
        margin-top: (16/@a);
        margin-left: (22/@a);
        text-align: center;
        line-height: (52/@a);
    }
}
</style>