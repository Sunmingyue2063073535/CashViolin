<template>
    <div class="productList">
        <TopDesc desc="PRODUCT LIST"></TopDesc>
        <div class="pl-top">
            <div class="pl-top-title">My Loan History </div>
            <div class="pl-top-btn">View</div>
        </div>
        <!-- 产品列表 -->
        <div class="productList-list" v-for="(item, index) in list">
            <div class="pl-top">
                <div class="pl-top-img">
                    <img src="../../assets/goodlist.png" alt="">
                </div>
                <div class="pl-top-name">Cash Violin</div>
                <div v-if="!isShow" class="pl-top-status" @click="put(item, index)">put away</div>
                <div v-else class="pl-top-status" @click="unfold(item)">unfold</div>
            </div>
            <div class="pl-content" @click="doClick">
                <div class="pl-c-show">
                    <ul class="pl-cs-l">
                        <li>Loan amount (₹)</li>
                        <li>Loan Period (Days)</li>
                    </ul>
                    <ul class="pl-cs-r">
                        <li>7001</li>
                        <li>7</li>
                    </ul>
                </div>
            </div>
            <!-- 详细信息 -->
            <div class="details" @click="doClick" :class="{ hide: isShow }">
                <div class="line"></div>
                <div class="d-info">
                    <ul class="d-l">
                        <li>Loan Amount</li>
                        <li>Loan Period (Days)</li>
                        <li>Loan Date</li>
                        <li>Loan Note Number</li>
                    </ul>
                    <ul class="d-r">
                        <li>₹ 15000</li>
                        <li>7 DAY</li>
                        <li>2023-02-07 08:59:22</li>
                        <li>L20230207062922806</li>
                    </ul>
                </div>
            </div>
            <!-- 选择框 -->
            <div class="s" @click="doClick">
                <div class="select">
                    <img v-if="!checked" src="../../assets/goodlist.png" alt="">
                    <img v-else src="../../assets/goodlist-m.png" alt="">
                </div>
            </div>
        </div>
    </div>
</template>
<script>
export default {
    data() {
        return {
            count: '',
            isShow: false,
            checked: false,
            list: [
                { id: 0 },
                { id: 1 },
                { id: 2 }
            ]
        }
    },
    methods: {
        //点击产品时
        doClick() {
            this.checked = !this.checked
        },
        //收齐按钮
        put(item, index) {
            this.isShow = true
        },
        //展开
        unfold() {
            this.isShow = false
        }
    }
}
</script>
<style lang="less" scoped>
.productList {
    width: 100vw;
    background-color: #f5f5f5;
    padding-top: (80/@a);
    padding-bottom: (40/@a);

    .hide {
        display: none;
    }

    .productList-list {
        margin-left: (19/@a);
        margin-top: (20/@a);

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
                justify-content: space-around;

                .d-l {
                    li {
                        font-size: (13/@a);
                        font-family: Alibaba PuHuiTi;
                        font-weight: 400;
                        color: #363636;
                        margin-bottom: (16/@a);
                    }
                }

                .d-r {
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