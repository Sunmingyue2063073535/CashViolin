<template>
    <div class="ocr">
        <FormTopDesc desc="identity verification" info="Please take a photo and upload your profile"></FormTopDesc>
        <!-- 上传区域 -->
        <div class="ocr-upload">
            <div class="ocr-one">
                <div class="ocr-img" @click="doClickOne">
                    <img src="../../assets/ocr-one.png" alt="">
                </div>
                <div class="ocr-desc">Please take a front photo of your ID</div>
            </div>
            <div class="ocr-one">
                <div class="ocr-img">
                    <img src="../../assets/ocr-two.png" alt="">
                </div>
                <div class="ocr-desc">Please take a photo of the back of your ID card</div>
            </div>
            <div class="ocr-one">
                <div class="ocr-img">
                    <img src="../../assets/ocr-three.png" alt="">
                </div>
                <div class="ocr-desc">Please take a front photo of your ID</div>
            </div>
        </div>
        <!-- 弹出层 -->
        <van-dialog v-model="show" show-cancel-button class="dialog" :showConfirmButton="false" :showCancelButton="false">
            <div class="dialog-img">
                <img src="../../assets/ocr-dialog.png" alt="">
            </div>
            <div class="dialog-btn" @click="doTake">to take pictures</div>
        </van-dialog>
        <!-- 上传按钮 -->
        <button class="ocr-btn">Next Step</button>
    </div>
</template>
<script>
export default {
    data() {
        return {
            show: false //弹出框的显示与隐藏
        }
    },
    methods: {
        doClickOne() {
            this.show = true
        },
        //去上传
        doTake() {
            this.show = false
        }
    }
}
</script>

<style lang="less" scoped>
.ocr {
    width: 100vw;
    height: 100%;
    background-color: #f3f3f3;
    padding-top: (100/@a);

    .dialog {

        .dialog-img {
            width: (320/@a);
            height: (350/@a);

            img {
                width: (320/@a);
                height: (350/@a);
            }
        }

        .dialog-btn {
            position: absolute;
            left: 0;
            bottom: (19/@a);
            width: (257/@a);
            height: (42/@a);
            background: #D8929B;
            border-radius: (10/@a);
            text-align: center;
            line-height: (42/@a);
            margin-top: (20/@a);
            margin-left: (27/@a);
            font-size: (16/@a);
            font-family: Alibaba PuHuiTi;
            font-weight: bold;
            color: #FFFFFF;
        }
    }

    .ocr-upload {
        width: (336/@a);
        background: #FFFFFF;
        border-radius: (10/@a);
        margin-left: (19/@a);
        padding-top: (26/@a);
        text-align: center;
        padding-bottom: (26/@a);

        .ocr-one {
            margin-top: (17/@a);

            .ocr-img {
                width: (208/@a);
                height: (145/@a);
                background: #FEF3F4;
                border-radius: (5/@a);
                margin-left: (64/@a);

                img {
                    width: 100%;
                }
            }
        }

        .ocr-desc {
            font-size: (13/@a);
            font-family: Alibaba PuHuiTi;
            font-weight: bold;
            color: #626262;
            margin-top: (14/@a);
        }
    }

    .ocr-btn {
        width: (330/@a);
        height: (52/@a);
        background: #E1A08B;
        border-radius: (10/@a);
        font-size: (19/@a);
        font-family: Alibaba PuHuiTi;
        font-weight: bold;
        color: #FFFFFF;
        text-align: center;
        line-height: (52/@a);
        margin-top: (31/@a);
        margin-bottom: (32/@a);
        margin-left: (21/@a);
    }
}
</style>