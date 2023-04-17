<template>
    <div class="quanxian">
        <TopDesc desc="permissions" info="Please read the following agreement carefully"></TopDesc>
        <div class="box">
            <iframe
                src="https://app.cashviolin.xyz/cossack-graver-underdogger/ruminative-heartbreaking-messy/boozy-helianthus/zgmrdl.html"
                frameborder="0"></iframe>
        </div>

    </div>
</template>
<script>
import { Toast } from "vant";
export default {
    data() {
        return {
        }
    },
    methods: {
        doChange() {
            this.$store.commit('changeyinsi')
        },
        doAgree() {
            if (this.$store.state.xieyi.yinsiActive) {
                this.$store.commit('xieyi/addxieyi')
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

    .box {
        width: (336/@a);
        height: (425/@a);
        background: #FFFFFF;
        border-radius: (10/@a);
        margin-left: (19/@a);
        margin-top: (40/@a);
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