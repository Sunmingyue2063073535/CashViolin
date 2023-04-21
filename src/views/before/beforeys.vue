<template>
    <div class="quanxian">
        <TopDesc desc="permissions" info="Please read the following agreement carefully"></TopDesc>
        <div class="box">
            <iframe
                src="https://app.cashviolin.xyz/cossack-graver-underdogger/ruminative-heartbreaking-messy/boozy-helianthus/zgmrdl.html"
                frameborder="0"></iframe>
        </div>
        <div class="desc">
            <van-checkbox class="checkbox" checked-color="#e1a08b" @click="doChange" v-model="beforeys" shape="square">
                By continuing, you have
                read and agreed to the
                above
            </van-checkbox>
        </div>
        <div class="bottom">
            <div class="disagree" @click="$router.back()">I Disagree</div>
            <div class="agree" @click="doAgree">I Agree</div>
        </div>
    </div>
</template>
<script>
import { Toast } from "vant";
export default {
    data() {
        return {
            beforeys: true
        }
    },
    methods: {
        doChange() {
            console.log('123')
            this.$store.commit('changeyinsi')
        },
        doAgree() {
            if (this.beforeys) {
                this.$router.push('/beforeqx')
            } else {
                Toast('Please check the agreement first')
            }
        }
    }
}
</script>

<style lang="less" scoped>
.quanxian {
    padding-top: (100/@a);
    width: 100vw;
    height: (667/@a);
    background-color: #f5f5f5;

    .bottom {
        position: fixed;
        bottom: (20/@a);
        left: (20/@a);
        display: flex;
        justify-content: space-around;
        margin-top: (10/@a);

        .disagree {
            width: (152/@a);
            height: (47/@a);
            background: #E5E5E5;
            border-radius: (10/@a);
            font-size: (16/@a);
            text-align: center;
            line-height: (47/@a);
            font-family: Alibaba PuHuiTi;
            font-weight: bold;
            color: #FFFFFF;
        }

        .agree {
            margin-left: (30/@a);
            width: (152/@a);
            height: (47/@a);
            background: #E1A08B;
            border-radius: (10/@a);
            font-size: (16/@a);
            text-align: center;
            line-height: (47/@a);
            font-family: Alibaba PuHuiTi;
            font-weight: bold;
            color: #fff;
        }
    }

    .box {
        width: (336/@a);
        height: (425/@a);
        background: #FFFFFF;
        border-radius: (10/@a);
        margin-left: (19/@a);
        overflow: hidden;

        iframe {
            width: 103vw;
            height: (425/@a);
        }
    }

    .desc {
        .checkbox {
            margin-top: (20/@a);
            margin-left: (19/@a);
        }
    }
}
</style>