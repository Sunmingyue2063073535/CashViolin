<template>
    <div class="topay">
        <TopDesc desc="GOLD MONEY" info="Get more amount after instant payment"></TopDesc>
        <!-- kefu -->
        <div class="kefu" @click="$router.push('/askQuestions')">
            <img src="../../assets/kefu.png" alt="">
        </div>
        <div class="gm-top">
            <div class="gm-title">Already Repaid</div>
            <div class="gm-amount">₹ {{ orderInfo.loanAmount }}</div>
        </div>
        <div class="gm-bottom">
            <ul class="gm-l">
                <li>Loan Note Number</li>
                <li>Phone Number</li>
                <li>Bank Card Number</li>
                <li>Loan Period (Days) </li>
                <li>End Date</li>
                <li>Interest</li>
                <li>Total Service Charge</li>
            </ul>
            <ul class="gm-r">
                <li>{{ orderInfo.orderId }}</li>
                <li>{{ orderInfo.phone }}</li>
                <li>{{ orderInfo.bankCard }}</li>
                <li>{{ orderInfo.loanTerm }} {{ orderInfo.termUnit }}</li>
                <li>{{ new Date(orderInfo.expiryTime).toLocaleDateString() }}</li>
                <li>{{ orderInfo.interestRate }}</li>
                <li>{{ orderInfo.adminAmount }}</li>
            </ul>
        </div>
        <copy></copy>
        <div class="button">
            <div class="repayment" @click="doRepayment">Repayment</div>
            <div class="rollover" @click="$router.push('/rollover')">Rollover</div>
        </div>
        <van-dialog v-model="show" :showConfirmButton="false" :showCancelButton="false">
            <toPayDialog @doClose="show = false"></toPayDialog>
        </van-dialog>
    </div>
</template>
<script>
import toPayDialog from './toPayDialog.vue'
import { dingdanhuankuanAPI } from "../../api";
import { add, unt } from "../../utils/AESKey.js";
export default {
    components: { toPayDialog },
    data() {
        return {
            show: false,
        }
    },
    methods: {
        //全部还款
        doRepayment() {
            this.show = true
            console.log(this.$store.state.orderInfo, '222')
            console.log(this.orderInfo, '1111')
        },
    },
    computed: {
        orderInfo() {
            return this.$store.state.orderInfo
        }
    }
}
</script>
<style lang="less" scoped>
.topay {
    position: relative;
    width: 100vw;
    height: (667/@a);
    padding-top: (100/@a);
    background-color: #f5f5f5;

    .kefu {
        position: absolute;
        top: (100/@a);
        right: (10/@a);
        width: (80/@a);
        height: (80/@a);

        img {
            width: 100%;
        }
    }

    .gm-top {
        width: (336/@a);
        height: (86/@a);
        background-color: #d8929b;
        border-radius: (10/@a) (10/@a) 0 0;
        padding-top: (15/@a);
        margin-left: (19/@a);
        margin-top: (10/@a);

        .gm-title {
            font-size: (13/@a);
            font-family: Alibaba PuHuiTi;
            font-weight: bold;
            color: #FFFFFF;
            margin-left: (118/@a);
        }

        .gm-amount {
            font-size: (31/@a);
            font-family: Alibaba PuHuiTi;
            font-weight: bold;
            color: #FFFFFF;
            margin-left: (106/@a);
        }
    }

    .gm-bottom {
        width: (336/@a);
        background-color: #fff;
        display: flex;
        justify-content: space-between;
        margin-left: (19/@a);
        border-radius: 0 0 (10/@a) (10/@a);
        padding-bottom: (15/@a);

        .gm-l {
            margin-left: (11/@a);

            li {
                font-size: (13/@a);
                font-family: Alibaba PuHuiTi;
                font-weight: 400;
                color: #767676;
                margin-top: (15/@a);
            }
        }

        .gm-r {
            text-align: right;
            margin-right: (12/@a);

            li {
                font-size: (13/@a);
                font-family: Alibaba PuHuiTi;
                font-weight: 400;
                color: #E1A08B;
                margin-top: (15/@a);
            }
        }
    }

    .button {
        margin-top: (31/@a);
        display: flex;
        justify-content: space-around;

        .repayment {
            width: (143/@a);
            height: (50/@a);
            background: #D8929B;
            border-radius: (10/@a);
            font-size: (16/@a);
            font-family: Alibaba PuHuiTi;
            font-weight: bold;
            color: #FFFFFF;
            text-align: center;
            line-height: (50/@a);
        }

        .rollover {
            width: (143/@a);
            height: (50/@a);
            background: #cdcdcd;
            border-radius: (10/@a);
            font-size: (16/@a);
            text-align: center;
            line-height: (50/@a);
            font-family: Alibaba PuHuiTi;
            font-weight: bold;
            color: #868686;
        }
    }
}
</style>