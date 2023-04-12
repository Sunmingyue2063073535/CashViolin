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
        <div class="goodlist" v-for="item in 10">
            <div class="gl-top">
                <div class="gl-top-img">
                    <img src="../../assets/goodlist.png" alt="">
                </div>
                <div class="gl-top-name">Cash Violin</div>
                <div class="gl-top-status" @click="$router.push('toPay')">success</div>
            </div>
            <div class="gl-content">
                <ul class="gl-l">
                    <li>Loan Amount</li>
                    <li>Loan Period (Days)</li>
                    <li>Loan Date</li>
                    <li>Loan Note Number</li>
                    <li>Ask Questions</li>
                </ul>
                <ul class="gl-r">
                    <li>₹ 15000</li>
                    <li>7 DAY</li>
                    <li>2023-02-07 08:59:22</li>
                    <li>L20230207062922806</li>
                    <li>
                        <img src="../../assets/kefu-logo.png" alt="">
                    </li>
                </ul>
            </div>
        </div>
        <!-- 按钮 -->
        <div class="btn">Submit</div>
    </div>
</template>
<script>
export default {
    data() {
        return {
            titleList: [
                { id: 0, name: 'All' },
                { id: 1, name: 'Success' },
                { id: 2, name: 'Overdue' },
                { id: 3, name: 'Finish' },
            ]
        }
    },
    methods: {
        doClick(item, index) {
            // this.count = item.id
            this.$store.commit('changeCount', index)
        }
    }
}
</script>
<style lang="less" scoped>
.loan {
    padding-top: (80/@a);
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
            }

            .gl-top-status {
                font-size: (13/@a);
                font-family: Alibaba PuHuiTi;
                font-weight: 500;
                text-align: center;
                line-height: (24/@a);
                color: #FFFFFF;
                margin-right: (13/@a);
                width: (57/@a);
                height: (24/@a);
                background: #AF1A2D;
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
                    font-size: (12/@a);
                    font-family: Alibaba PuHuiTi;
                    font-weight: 400;
                    color: #E1A08B;
                    margin-bottom: (13/@a);

                    &:last-child {
                        width: (22/@a);
                        height: (15/@a);
                        margin-left: (100/@a);

                        img {
                            width: 100%;
                        }
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