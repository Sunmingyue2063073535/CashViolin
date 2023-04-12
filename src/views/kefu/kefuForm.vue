<template>
    <div class="kefuform">
        <TopDesc desc="RHELP AND FEEDBACK"></TopDesc>
        <van-form class="form">
            <!-- 选择提问类型 -->
            <div class="f-type">
                <div class="van-select">
                    <span class="span">*</span>
                    <span class="title">Question Type</span>
                </div>
                <van-field class="type" readonly clickable name="picker" :value="value"
                    placeholder="Please select the type of question" @click="showPicker = true" />
                <van-popup v-model="showPicker" position="bottom">
                    <van-picker show-toolbar :columns="columns" @confirm="onConfirm" @cancel="showPicker = false" />
                </van-popup>
                <div class="typedesc">Please submit a screenshot of the repayment with a 12-digit Ref.no</div>
            </div>
            <!-- 文本域 -->
            <div class="f-text">
                <div class="text-title">
                    <span class="span">*</span>
                    <span class="title">Guestions and suggestions</span>
                </div>
                <van-field class="texttare" v-model="message" autosize type="textarea"
                    placeholder="Please enter your questions and suggestions,we will continue to optimize the experience." />
            </div>
            <!-- 上传照片 -->
            <div class="f-upload">
                <div class="title">upload problem pictures, onlyJPG and PNG are supported</div>
                <van-uploader class="uploader-photo" v-model="fileList" multiple :max-count="3"
                    default-file-list="['../../assets/upload-photo.png']" />
            </div>
            <van-button class="btn">Submit</van-button>
        </van-form>
    </div>
</template>

<script>
export default {
    data() {
        return {
            value: '',
            columns: ['杭州', '宁波', '温州', '嘉兴', '湖州'],
            showPicker: false,
            message: '',
            //上传的照片
            fileList: [],
        }
    },
    methods: {
        onConfirm(value) {
            this.value = value;
            this.showPicker = false;
        },
    },
}
</script>
<style lang="less" scoped>
.kefuform {
    width: 100vw;
    height: (667/@a);
    background-color: #f5f5f5;
    padding-top: (80/@a);

    .form {
        .f-type {
            .van-select {
                width: (336/@a);
                height: (43/@a);
                background-color: #d8929b;
                margin-left: (19/@a);
                border-radius: (10/@a) (10/@a) 0 0;
                padding-top: (10/@a);

                .span {
                    font-size: (16/@a);
                    font-family: Nirmala UI;
                    font-weight: bold;
                    color: #CF0000;
                    margin-left: (15/@a);
                }

                .title {
                    font-size: 16px;
                    font-family: Alibaba PuHuiTi;
                    font-weight: bold;
                    color: #FFFFFF;
                    margin-left: (5/@a);
                }
            }

            /deep/ .type {
                width: (336/@a);
                margin-left: (19/@a);
                border-radius: 0 0 (10/@a) (10/@a);
            }

            .typedesc {
                font-size: (9/@a);
                font-family: Alibaba PuHuiTi;
                font-weight: 400;
                color: #878787;
                margin-left: (20/@a);
                margin-right: (20/@a);
                margin-top: (10/@a);
            }
        }

        .f-text {
            margin-top: (25/@a);

            .text-title {
                width: (336/@a);
                height: (43/@a);
                background-color: #d8929b;
                border-radius: (10/@a) (10/@a) 0 0;
                padding-top: (10/@a);
                margin-left: (19/@a);

                .span {
                    font-size: (16/@a);
                    font-family: Nirmala UI;
                    font-weight: bold;
                    color: #CF0000;
                    margin-left: (15/@a);
                }

                .title {
                    font-size: 16px;
                    font-family: Alibaba PuHuiTi;
                    font-weight: bold;
                    color: #FFFFFF;
                    margin-left: (5/@a);
                }
            }

            /deep/ .texttare {
                width: (336/@a);
                height: (170/@a);
                border-radius: 0 0 (10/@a) (10/@a);
                margin-left: (19/@a);
            }
        }

        .f-upload {
            .title {
                font-size: (13/@a);
                font-family: Alibaba PuHuiTi;
                font-weight: bold;
                color: #000000;
                margin-top: (14/@a);
                margin-left: (19/@a);
            }

            /deep/ .uploader-photo {
                margin-top: (5/@a);
                margin-left: (19/@a);
            }
        }

        .btn {
            width: (330/@a);
            height: (52/@a);
            background: #E1A08B;
            border-radius: 10px;
            font-size: 19px;
            font-family: Nirmala UI;
            font-weight: bold;
            color: #FEFEFE;
            margin-left: (22/@a);
            text-align: center;
            line-height: (52/@a);
        }
    }
}
</style>