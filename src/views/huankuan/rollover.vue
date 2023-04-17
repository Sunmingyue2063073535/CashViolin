
<template>
    <div class="rollover">
        <TopDesc desc="ROLLOVER" info="Payment has been completed and repayment isdelayed."></TopDesc>
        <div class="r-content">
            <div class="r-c-top">
                <div class="r-c-t-title">Pay Now</div>
                <div class="r-c-t-amount">₹ {{ o.loanAmount }}</div>
            </div>
            <div class="r-c-bottom">
                <ul class="r-c-b-l">
                    <li>Delayed Date</li>
                    <li>Extend Time</li>
                    <li>Recording Delay </li>
                </ul>
                <ul class="r-c-b-r">
                    <li>{{ new Date(o.endTime).toLocaleDateString() }}</li>
                    <li>{{ o.delayTerm }} {{ o.termUnit }}</li>
                    <li>{{ o.limitTimes }}</li>
                </ul>
            </div>
        </div>
        <copy></copy>
        <div class="btn" @click="$router.push('/payType')">Need to repay loan ₹ {{ o.loanAmount }}</div>
    </div>
</template>
<script>
import { zhanqiAPI } from "../../api";
import { add, unt } from "../../utils/AESKey.js";
export default {
    data() {
        return {
            o: {}
        }
    },
    methods: {
        async getZhanqi() {
            const f = {
                model: {
                    orderId: this.$store.state.orderId
                }
            }
            const res = await zhanqiAPI(add(f))
            console.log(unt(res.data))
            this.o = unt(res.data).model
        }
    },
    created() {
        this.getZhanqi()
    }
}
</script>
<style lang="less" scoped>
.rollover {
    width: 100vw;
    height: (667/@a);
    background-color: #f5f5f5;
    padding-top: (100/@a);

    .r-content {
        width: (336/@a);
        height: (205/@a);
        background-color: #fff;
        margin-left: (19/@a);
        border-radius: (10/@a);
        margin-top: (10/@a);

        .r-c-top {
            width: (336/@a);
            height: (86/@a);
            background-color: #d8929b;
            padding-top: (10/@a);
            border-radius: (10/@a) (10/@a) 0 0;

            .r-c-t-title {
                font-size: (13/@a);
                font-family: Alibaba PuHuiTi;
                font-weight: bold;
                color: #FFFFFF;
                margin-left: (141/@a);
            }

            .r-c-t-amount {
                font-size: (31/@a);
                font-family: Alibaba PuHuiTi;
                font-weight: bold;
                color: #FFFFFF;
                margin-left: (106/@a);
            }
        }

        .r-c-bottom {
            display: flex;
            justify-content: space-between;
            padding-top: (25/@a);
            border-radius: 0 0 (10/@a) (10/@a);

            li {
                margin-bottom: (5/@a);
            }

            .r-c-b-l {
                margin-left: (16/@a);
                text-align: left;


                li {
                    font-size: (13/@a);
                    font-family: Alibaba PuHuiTi;
                    font-weight: 400;
                    color: #767676;
                }

            }

            .r-c-b-r {
                margin-right: (16/@a);
                text-align: right;


                li {
                    font-size: (13/@a);
                    font-family: Alibaba PuHuiTi;
                    font-weight: 400;
                    color: #E1A08B;
                }
            }
        }
    }

    .btn {
        width: (330/@a);
        height: (52/@a);
        background: #E1A08B;
        border-radius: (10/@a);
        font-size: (19/@a);
        text-align: center;
        line-height: (52/@a);
        font-family: Alibaba PuHuiTi;
        font-weight: bold;
        color: #FEFEFE;
        margin-top: (39/@a);
        margin-left: (22/@a);
    }
}
</style>