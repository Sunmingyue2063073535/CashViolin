<template>
    <div class="paytype">
        <TopDesc desc="REPAYMENT MODE"></TopDesc>
        <div class="amount">₹ 50,000</div>
        <div class="pt-c">
            <div class="pt-title">Choose your payment mode</div>
            <div class="pt-choose">Please Choose</div>
            <div class="pt-type">UPI</div>
        </div>
        <copy></copy>
    </div>
</template>

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