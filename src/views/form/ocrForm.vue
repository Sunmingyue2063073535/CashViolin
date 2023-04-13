<template>
    <div class="ocrForm">
        <!-- 顶部 -->
        <FormTopDesc desc="ocrForm"></FormTopDesc>
        <!-- form表单 -->
        <div class="form">
            <van-form label-width="100px">
                <van-field v-model="f.model.realName" name="realName" label="RealName" placeholder="realName"
                    :rules="[{ required: true, message: 'Please fill in the name' }]" />

                <van-field v-model="f.model.idCard" name="idCard" label="IdCard" placeholder="idCard"
                    :rules="[{ required: true, message: 'Please fill in idCard' }]" />

                <van-field v-model="f.model.taxRegNumber" name="TaxRegNumber" label="TaxRegNumber"
                    placeholder="taxRegNumber" :rules="[{ required: true, message: 'Please fill in taxRegNumber' }]" />


                <van-field readonly clickable name="datetimePicker" :value="value" label="Birthday"
                    placeholder="Please select a birthday" @click="showPicker = true" v-model="birthday" />
                <van-popup v-model="showPicker" position="bottom">
                    <van-datetime-picker v-model="currentDate" :min-date="minDate" :max-date="maxDate" type="date"
                        confirm-button-text="Confirm" cancel-button-text="Cancel" title="Please select a birthday"
                        @confirm="doConfirm" />
                </van-popup>


                <div class="btn" @click="onSubmit">Submit</div>
            </van-form>
        </div>
    </div>
</template>

<script>
import isNext from './isNext.js'
import { uploadUserInfoAPI } from "../../api";
import { add, unt } from "../../utils/AESKey.js";
export default {
    data() {
        return {
            value: '',
            showPicker: false,
            minDate: new Date(1900, 0, 1),
            maxDate: new Date(Date.now()),
            //当前选中的时间
            currentDate: new Date(this.formatDate(this.$store.state.ocrUrl.sfzq.birthDay)),
            birthday: '',
            f: {
                model: {
                    birthDay: '',
                    idCard: this.$store.state.ocrUrl.sfzh.idCard,
                    realName: this.$store.state.ocrUrl.sfzq.realName,
                    taxRegNumber: this.$store.state.ocrUrl.bank.taxRegNumber,
                    idCardImageFront: this.$store.state.ocrUrl.img.sfzqImg,
                    idCardImageBack: this.$store.state.ocrUrl.img.sfzhImg,
                    idCardImagePan: this.$store.state.ocrUrl.img.bankImg
                }
            }
        }
    },
    methods: {
        doConfirm(value) {
            this.showPicker = false
            const timer = new Date(value).getTime()
            this.birthday = this.formatDate(timer)
            //将时间戳赋值给表单的数据
            this.f.model.birthDay = timer
            console.log(timer, '时间戳')
            console.log(value, 'value')
            console.log(this.birthday, 'this.birthday')
        },
        //表单提交按钮
        async onSubmit() {
            console.log(this.f, '提交用户信息的表单')
            const res = await uploadUserInfoAPI(add(this.f))
            console.log(unt(res.data), '上传证件结果')
            // console.log(jiemi(res.data), '提交用户信息结果')
            // isNext()
        },
        //时间戳转成年月日
        formatDate(timestamp) {
            const date = new Date(timestamp);
            const year = date.getFullYear();
            const month = String(date.getMonth() + 1).padStart(2, '0');
            const day = String(date.getDate()).padStart(2, '0');
            return `${year}-${month}-${day}`;
        }
    },
    computed: {
        form() {
            return this.$store.state.ocrUrl
        },
    },
    created() {
        this.birthday = this.formatDate(this.$store.state.ocrUrl.sfzq.birthDay)
    }
}
</script>
<style lang="less" scoped>
/deep/.van-cell,
.van-field {
    margin-top: (10/@a);
    border-radius: (20/@a);
}

.ocrForm {
    width: 100vw;
    height: (667/@a);
    background-color: #f5f5f5;
    padding-top: (100/@a);

    .form {
        .btn {
            background-color: #e1a08b;
            border-radius: (10/@a);
            margin-top: (30/@a);
            margin-left: (75/@a);
            width: (230/@a);
            height: (44/@a);
            color: #fff;
            text-align: center;
            line-height: (44/@a);
            font-size: (20/@a);
        }
    }
}
</style>