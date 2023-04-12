<template>
    <div class="askquestions">
        <TopDesc desc="ASK QUESTIONS"></TopDesc>
        <!-- <noQuestions></noQuestions> -->
        <div class="list" v-for="item in 10">
            <div class="q">
                <div class="q-title">Question:</div>
                <div class="q-content">safdddddddddddddddddddddddddddd</div>
            </div>
            <div class="a">
                <div class="a-title">Reply:</div>
                <div class="a-content"></div>
            </div>
            <div class="createtime">
                <div class="c-k">Creation time:</div>
                <div class="c-v">2023/03/25</div>
            </div>
        </div>
        <div class="btn">Submit Questions</div>
    </div>
</template>
<script>
import noQuestions from './noQuestions.vue'
export default {
    components: { noQuestions }
}
</script>
<style lang="less" scoped>
.askquestions {
    width: 100vw;
    background-color: #f5f5f5;
    padding-top: (100/@a);
    padding-bottom: (30/@a);

    .list {
        margin: (20/@a);
        margin-top: (30/@a);
        border: #3E3E3E 1px solid;

        .q-title,
        .a-title {
            margin-top: (13/@a);
            font-size: (16/@a);
            font-family: Alibaba PuHuiTi;
            font-weight: bold;
            color: #3E3E3E;
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

.btn {
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
</style>