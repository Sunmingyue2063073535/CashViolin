<template>
    <div class="ocr">
        <FormTopDesc desc="identity verification" info="Please take a photo and upload your profile"></FormTopDesc>
        <!-- 上传区域 -->
        <div class="ocr-upload">
            <!-- 身份证前 -->
            <div class="ocr-one">
                <div class="ocr-img" @click="doClickOne">
                    <input class="sfz" id="sfzqian" type="file" accept="image/*" capture="camera"
                        @change="handleFileInputqian" style="width:50px'">
                    <img :src="sfzqImg" alt="">
                </div>
                <div class="ocr-desc">Please take a front photo of your ID</div>
            </div>
            <!-- 身份证后 -->
            <div class="ocr-one" @click="doSfzh">
                <div class="ocr-img">
                    <input class="sfz" id="sfzhou" type="file" accept="image/*" capture="camera"
                        @change="handleFileInputsfhou">
                    <img :src="sfzhImg" alt="">
                </div>
                <div class="ocr-desc">Please take a photo of the back of your ID card</div>
            </div>
            <!-- 银行卡 -->
            <div class="ocr-one" @click="doBank">
                <div class="ocr-img">
                    <input class="sfz" id="bank" type="file" accept="image/*" capture="camera"
                        @change="handleFileInputBank">
                    <img :src="bankImg" alt="">
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
        <button class="ocr-btn" @click="doSubmit">Next Step</button>
    </div>
</template>
<script>
import { uploadFileApi, zhengjainshibieAPI } from "../../api";
import { add, unt } from "../../utils/AESKey.js";
import { Toast } from "vant";
export default {
    data() {
        return {
            show: false, //弹出框的显示与隐藏
            sfzqImg: require('../../assets/ocr-one.png'),
            sfzhImg: require('../../assets/ocr-two.png'),
            bankImg: require('../../assets/ocr-three.png'),
            user: {
                sfzq: {},
                sfzh: {},
                bank: {},
                img: {
                    sfzqImg: '',
                    sfzhImg: '',
                    bankImg: ''
                }
            }
        }
    },
    methods: {
        //上传
        doSubmit() {
            if (!this.user.img.sfzImg && !this.user.img.sfzhImg && !this.user.img.bankImg) {
                Toast('Please upload documents')
            } else {
                this.$store.commit('setOCRUrl', this.user)
                this.$router.push('/ocrForm')
            }
        },
        // 身份证前
        doClickOne() {
            this.show = true
        },
        handleFileInputqian(event) {
            this.$store.commit('showLoading')
            // 获取图片元素的引用
            const photo = this.$refs.photo
            // 获取用户选择的文件对象
            const file = event.target.files[0]
            // 创建一个FileReader对象，用于读取文件内容
            const reader = new FileReader()
            // 当文件读取完成后，触发onload事件
            reader.onload = async () => {
                // 将读取的文件内容设置为图片的src属性
                // photo.src = reader.result

                const newFile = this.base64toFile(reader.result, file.name)
                const fileObj = {
                    content: reader.result,
                    file: newFile,
                    message: '',
                    status: ''
                }
                const newFileObj = await this.photoZip(fileObj.file)
                console.log(newFileObj, '1')
                //压缩后的
                const res = await uploadFileApi(newFileObj)
                console.log(unt(res.data), '上传图片的结果身份证前')
                this.sfzqImg = unt(res.data).model.id
                //识别证件的结果
                this.user.sfzq = await this.zjsb(unt(res.data).model.id, 'FRONT')
                this.user.img.sfzqImg = unt(res.data).model.id
                // this.user.sfqian = unt(res.data).model.id
            }
            // 开始读取文件内容，这会触发onload事件
            reader.readAsDataURL(file)
        },
        // 身份证后
        handleFileInputsfhou(event) {
            this.$store.commit('showLoading')
            // 获取图片元素的引用
            const photo = this.$refs.photo
            // 获取用户选择的文件对象
            const file = event.target.files[0]
            // 创建一个FileReader对象，用于读取文件内容
            const reader = new FileReader()
            // 当文件读取完成后，触发onload事件
            reader.onload = async () => {
                // 将读取的文件内容设置为图片的src属性
                // photo.src = reader.result

                const newFile = this.base64toFile(reader.result, file.name)
                const fileObj = {
                    content: reader.result,
                    file: newFile,
                    message: '',
                    status: ''
                }
                const newFileObj = await this.photoZip(fileObj.file)
                console.log(newFileObj, '1')
                //压缩后的
                const res = await uploadFileApi(newFileObj)
                console.log(unt(res.data), '上传图片的结果身份证前')
                this.sfzhImg = unt(res.data).model.id
                this.user.sfzh = await this.zjsb(unt(res.data).model.id, 'FRONT')
                this.user.img.sfzhImg = unt(res.data).model.id
                // this.user.sfqian = unt(res.data).model.id
            }
            // 开始读取文件内容，这会触发onload事件
            reader.readAsDataURL(file)
        },
        doSfzh() {
            document.getElementById('sfzhou').click()
        },
        //银行卡
        handleFileInputBank(event) {
            this.$store.commit('showLoading')
            // 获取图片元素的引用
            const photo = this.$refs.photo
            // 获取用户选择的文件对象
            const file = event.target.files[0]
            // 创建一个FileReader对象，用于读取文件内容
            const reader = new FileReader()
            // 当文件读取完成后，触发onload事件
            reader.onload = async () => {
                // 将读取的文件内容设置为图片的src属性
                // photo.src = reader.result

                const newFile = this.base64toFile(reader.result, file.name)
                const fileObj = {
                    content: reader.result,
                    file: newFile,
                    message: '',
                    status: ''
                }
                const newFileObj = await this.photoZip(fileObj.file)
                console.log(newFileObj, '1')
                //压缩后的
                const res = await uploadFileApi(newFileObj)
                console.log(unt(res.data), '上传图片的结果身份证前')
                this.bankImg = unt(res.data).model.id
                this.user.bank = await this.zjsb(unt(res.data).model.id, 'FRONT')
                this.user.img.bankImg = unt(res.data).model.id
                // this.user.sfqian = unt(res.data).model.id
            }
            // 开始读取文件内容，这会触发onload事件
            reader.readAsDataURL(file)
        },
        doBank() {
            document.getElementById('bank').click()
        },
        //去上传
        doTake() {
            document.getElementById('sfzqian').click()
            this.show = false
        },
        //base64转成file对象
        base64toFile(base64String, fileName) {
            const binaryString = atob(base64String.split(',')[1]);
            const buffer = new ArrayBuffer(binaryString.length);
            const bytes = new Uint8Array(buffer);

            for (let i = 0; i < binaryString.length; i++) {
                bytes[i] = binaryString.charCodeAt(i);
            }

            const blob = new Blob([buffer], { type: 'image/png' });
            return new File([blob], fileName, { type: 'image/png' });
        },
        // 压缩照片
        async photoZip(file) {
            return new Promise((resolve, reject) => {
                const reader = new FileReader();
                reader.readAsDataURL(file);
                reader.onload = () => {
                    const base64 = reader.result;
                    const img = new Image();
                    img.src = base64;
                    img.onload = () => {
                        const canvas = document.createElement('canvas');
                        const context = canvas.getContext('2d');
                        canvas.width = img.width;
                        canvas.height = img.height;
                        context.drawImage(img, 0, 0);
                        const quality = 0.7;
                        const maxWidth = 800;
                        const maxHeight = 800;
                        let newBase64 = canvas.toDataURL('image/jpeg', quality);
                        console.log(newBase64.length / 1024, '11111111111111')
                        while (newBase64.length / 1024 > 100) {
                            canvas.width *= 0.9;
                            canvas.height *= 0.9;
                            context.drawImage(img, 0, 0, canvas.width, canvas.height);
                            newBase64 = canvas.toDataURL('image/jpeg', quality);
                        }
                        const blob = this.dataURLtoBlob(newBase64);
                        const newFile = new File([blob], file.name, { type: 'image/jpeg' });
                        console.log(newBase64.length / 1024, '33333333')
                        // 返回file对象格式
                        resolve({ file: newFile, content: newBase64, message: '', status: '' });
                    }
                }
                reader.onerror = reject;
            }
            );
        },
        dataURLtoBlob(dataURL) {
            const arr = dataURL.split(',');
            const mime = arr[0].match(/:(.*?);/)[1];
            const bstr = atob(arr[1]);
            let n = bstr.length;
            const u8arr = new Uint8Array(n);
            while (n--) {
                u8arr[n] = bstr.charCodeAt(n);
            }
            return new Blob([u8arr], { type: mime });
        },
        //证件识别
        async zjsb(file, cardType) {
            const form = {
                model: {
                    url: file,
                    cardType: cardType
                }
            }
            const res = await zhengjainshibieAPI(add(form))
            console.log(unt(res.data), '识别证件结果')
            return unt(res.data).model
        },
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

                .sfz {
                    display: none;
                }

                img {
                    width: (208/@a);
                    height: (145/@a);
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