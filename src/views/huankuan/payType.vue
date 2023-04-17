<template>
    <div class="paytype">
        <TopDesc desc="REPAYMENT MODE"></TopDesc>
        <div class="amount">₹ {{ this.$store.state.orderInfo.actualAmount }}</div>
        <div class="pt-c">
            <div class="pt-title">Choose your payment mode</div>
            <div class="pt-choose">Please Choose</div>
            <div class="pt-type" v-for="item in list " @click="doClick">{{ item.repayMethod }}</div>
        </div>
        <copy></copy>
    </div>
</template>
<script>
import { getOrderPayType, getOrderLinkAPI } from "../../api";
import { add, unt } from "../../utils/AESKey.js";
export default {
    data() {
        return {
            list: []
        }
    },
    methods: {
        //获取还款方式
        async getPayType() {
            const f = {
                model: {
                    orderId: this.$store.state.orderId
                }
            }
            const res = await getOrderPayType(add(f))
            console.log(unt(res.data))
            this.list = unt(res.data).model.methods
        },
        //去还款
        async doClick() {
            const f = {
                model: {
                    orderId: this.$store.state.orderId,
                    repayMethod: '',
                    methodCode: '',
                    repayType: 'IMMEDIATE'
                }
            }
            f.model.repayMethod = this.list[0].repayMethod
            f.model.methodCode = this.list[0].methodCode
            console.log(f)
            const res = await getOrderLinkAPI(add(f))
            try {
                console.log(unt(res.data), '获取还款链接')
                const href = unt(res.data).model.repayCode
                setTimeout(() => {
                    window.location.href = href
                }, 1000);
            } catch (error) {

            }
        }
    },
    created() {
        this.getPayType()
    }
}
</script>
<style lang="less" scoped>
.paytype {
    width: 100vw;
    height: (667/@a);
    background-color: #f5f5f5;
    padding-top: (100/@a);

    .amount {
        margin-left: (19/@a);
        width: (336/@a);
        height: (68/@a);
        border-radius: (10/@a) (10/@a) 0 0;
        background-color: #d8929b;
        text-align: center;
        line-height: (68/@a);
        font-size: (31/@a);
        font-family: Alibaba PuHuiTi;
        font-weight: bold;
        color: #FFFFFF;
    }

    .pt-c {
        width: (336/@a);
        background-color: #fff;
        padding-top: (18/@a);
        padding-bottom: (28/@a);
        margin-left: (19/@a);
        border-radius: 0 0 (10/@a) (10/@a);

        .pt-title {
            font-size: (16/@a);
            font-family: Alibaba PuHuiTi;
            font-weight: bold;
            color: #4F4F4F;
            margin-left: (56/@a);
        }

        .pt-choose {
            margin-left: (125/@a);
            margin-top: (15/@a);
            font-size: (13/@a);
            font-family: Alibaba PuHuiTi;
            font-weight: bold;
            color: #767676;
        }

        .pt-type {
            width: (92/@a);
            height: (35/@a);
            background: #E1A08B;
            border-radius: (10/@a);
            font-size: (15/@a);
            text-align: center;
            line-height: (35/@a);
            margin-top: (20/@a);
            margin-left: (122/@a);
            font-family: Nirmala UI;
            font-weight: bold;
            color: #FFFFFF;
        }
    }
}
</style>