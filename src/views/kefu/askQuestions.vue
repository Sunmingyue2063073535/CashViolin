<template>
    <div class="askquestions">
        <TopDesc desc="ASK QUESTIONS"></TopDesc>
        <!-- <noQuestions desc="no news at the moment"></noQuestions> -->
        <div class="list" v-for="item in list">
            <div class="q">
                <div class="q-title">Question:</div>
                <div class="q-content">
                    <div class="q-text">{{ item.content }}</div>
                    <div class="q-img" v-for="(ele, index) in item.images">
                        <img :src="ele" alt="">
                    </div>
                </div>

            </div>
            <div class="a" v-if="item.reply">
                <div class="a-title">Reply:</div>
                <div class="a-content">{{ item.replycontent }}</div>
            </div>
            <div class="createtime">
                <div class="c-k">Creation time:</div>
                <div class="c-v">{{ new Date(item.created).toLocaleDateString() }}</div>
            </div>
        </div>
        <div class="bottom">
            <div class="btn">Submit Questions</div>
        </div>
    </div>
</template>
<script>
import noQuestions from './noQuestions.vue'
import { add, unt } from "../../utils/AESKey.js";
import { getfankuiLiatAPI } from "../../api";
export default {
    components: { noQuestions },
    data() {
        return {
            list: []
        }
    },
    methods: {
        //获取反馈列表
        async getList() {
            const f = {
                query: {
                    pageNo: 1,
                    pageSize: 200,
                    thirdOrderId: this.$store.state.orderId,

                }
            }
            const res = await getfankuiLiatAPI(add(f))
            this.list = unt(res.data).page.content
            console.log(unt(res.data))
        }
    },
    created() {
        this.getList()
    }
}
</script>
<style lang="less" scoped>
.askquestions {
    width: 100vw;
    background-color: #f5f5f5;
    padding-top: (50/@a);
    padding-bottom: (30/@a);

    .list {
        width: (300/@a);
        margin: (20/@a);
        margin-top: (30/@a);

        // border: #E1A08B (3/@a) solid;
        .q {
            padding: (5/@a);

            .q-text {
                padding: (5/@a);
                word-wrap: break-word; //设置文本自动换行
            }
        }

        .q-title,
        .a-title {
            margin-top: (13/@a);
            font-size: (16/@a);
            font-family: Alibaba PuHuiTi;
            font-weight: bold;
            color: #3E3E3E;
        }

        .q-img {
            margin-top: (20/@a);
            width: (300/@a);
            height: (200/@a);

            img {
                width: (280/@a);
                height: (200/@a);
            }
        }

        .q-content,
        .a-content {
            box-sizing: border-box;
            margin-top: (13/@a);
            padding: (20/@a);
            width: (333/@a);
            background: #FFFFFF;
            border-radius: (10/@a);
        }

        .createtime {
            display: flex;
            justify-content: space-between;
            margin-top: (13/@a);

            .c-k {
                font-size: (16/@a);
                font-family: Alibaba PuHuiTi;
                font-weight: bold;
                color: #3E3E3E;
            }

            .c-v {
                font-size: (13/@a);
                font-family: Alibaba PuHuiTi;
                font-weight: bold;
                color: #737373;
            }
        }
    }
}

.bottom {
    position: fixed;
    bottom: 0;
    width: 100vw;
    height: (70/@a);
    z-index: 99;
    background-color: #f5f5f5;

    .btn {
        position: fixed;
        bottom: (10/@a);
        width: (157/@a);
        height: (42/@a);
        background: #E1A08B;
        border-radius: (6/@a);
        margin-top: (70/@a);
        margin-left: (98/@a);
        text-align: center;
        line-height: (42/@a);
        font-size: (16/@a);
        font-family: Alibaba PuHuiTi;
        font-weight: bold;
        color: #FFFFFF;
    }
}
</style>