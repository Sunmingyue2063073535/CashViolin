<template>
    <div class="goldmoney">
        <TopDesc desc="GOLD MONEY" info="The next loan amount will be credited to the account faster!"></TopDesc>
        <div class="gm-top">
            <div class="gm-title">Already Repaid</div>
            <div class="gm-amount">₹ 50,000</div>
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
                <li>12312313</li>
                <li>12312313</li>
                <li>12312313</li>
                <li>12312313</li>
                <li>12312313</li>
                <li>12312313</li>
                <li>12312313</li>
            </ul>
        </div>
        <copy></copy>
        <div class="btn">Borrow more money instantly</div>
    </div>
</template>
<script>
export default {

}
</script>

<style lang="less" scoped>
.goldmoney {
    width: 100vw;
    height: (667/@a);
    background-color: #f5f5f5;
    padding-top: (100/@a);

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

    .btn {
        width: 330px;
        height: 52px;
        background: #E1A08B;
        border-radius: 10px;
        font-size: 19px;
        font-family: Nirmala UI;
        font-weight: bold;
        color: #FEFEFE;
        margin-top: (38/@a);
        margin-left: (22/@a);
        text-align: center;
        line-height: (52/@a);
    }
}
</style>