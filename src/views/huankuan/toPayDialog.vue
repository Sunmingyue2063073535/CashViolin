<template>
    <div class="topaydialog">
        <!-- 退出 -->
        <div class="x" @click="doClose">
            <img src="../../assets/x.png" alt="">
        </div>
        <div class="title">
            <div class="t-img">
                <img src="../../assets/laba.png" alt="">
            </div>
            <div class="desc">Announcement</div>
        </div>
        <div class="content">
            <div class="c-title">Warning fraud! Please open the APP or
                through the link confirm personal information
                (e g .: Name, Phone num ber and repayment
                amount.
            </div>
            <div class="c-info">
                1. Do not trust the loan collection who send UPI directly<br>

                2. Do not trust the loan collection who asks to split
                multiple repayments<br>

                3. If the UPI account is invalid and the repayment fails,
                please re obtain the latest UPI account on the loan
                app or the repayment link.<br>

            </div>
        </div>
        <div class="btn" @click="$router.push('/payType')">I already know</div>
    </div>
</template>
<script>
export default {
    methods: {
        doClose() {
            this.$emit('doClose')
        }
    }
}
</script>
<style lang="less" scoped>
.topaydialog {
    position: relative;
    padding-bottom: (20/@a);

    .x {
        width: (35/@a);
        height: (35/@a);
        position: absolute;
        top: (5/@a);
        right: (9/@a);

        img {
            width: 100%;
        }
    }

    .title {
        width: 100%;
        height: (112/@a);
        background-color: #d8929b;
        padding-top: (11/@a);

        .t-img {
            width: (60/@a);
            height: (60/@a);
            margin-left: (130/@a);

            img {
                width: 100%;
            }
        }

        .desc {
            margin-top: (11/@a);
            margin-left: (104/@a);
            font-size: (16/@a);
            font-family: Alibaba PuHuiTi;
            font-weight: bold;
            color: #FFFFFF;
        }
    }

    .content {
        padding: (17/@a) (6/@a);
        width: 100%;
        height: (240/@a);
        background-color: #fff;

        .c-title {
            font-size: (13/@a);
            font-family: Alibaba PuHuiTi;
            font-weight: 400;
            color: #373737;
        }

        .c-info {
            margin-top: (15/@a);
            font-size: (10/@a);
            font-family: Alibaba PuHuiTi;
            font-weight: 400;
            color: #767676;
        }
    }

    .btn {
        margin-left: (47/@a);
        width: (220/@a);
        height: (46/@a);
        background: #E1A08B;
        border-radius: (10/@a);
        font-size: (18/@a);
        font-family: Alibaba PuHuiTi;
        font-weight: bold;
        color: #FFFFFF;
        text-align: center;
        line-height: (46/@a);
    }
}
</style>