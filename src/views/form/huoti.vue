<template>
    <div class="huoti">
        <img :src="headImgSrc" alt="摄像头" @click="callCamera">
        <canvas ref="canvas" width="500" height="500"></canvas>
        <video ref="video" width="200" height="200" autoplay></video>
        <div class="btn" @click="photograph">拍照</div>
    </div>
</template>
<script>
import { add, unt } from '../../utils/AESKey.js'
import { huotijiaoyanAPI } from "../../api";
import isNext from './isNext.js'
export default {
    data() {
        return {
            headImgSrc: require('../../assets/default-user.png'),
            formData: {
                model: {
                    faceInfo: null,
                    action: '1',
                    score: '',
                    livenessType: 'ZH'
                }
            },
        }
    },
    methods: {
        // 调用摄像头
        callCamera() {
            // H5调用电脑摄像头API
            navigator.mediaDevices.getUserMedia({
                video: true
            }).then(success => {
                // 摄像头开启成功
                this.$refs['video'].srcObject = success
                // 实时拍照效果
                this.$refs['video'].play()
            }).catch(error => {
                console.error('摄像头开启失败，请检查摄像头是否可用！')
            })
        },
        // 拍照
        async photograph() {
            let ctx = this.$refs['canvas'].getContext('2d')
            // 把当前视频帧内容渲染到canvas上
            ctx.drawImage(this.$refs['video'], 0, 0, 300, 300)
            // 转base64格式、图片格式转换、图片质量压缩
            let imgBase64 = this.$refs['canvas'].toDataURL('image/jpeg', 0.7)
            console.log(imgBase64)
            // 由字节转换为KB 判断大小
            let str = imgBase64.replace('data:image/jpeg;base64,', '')
            let strLength = str.length
            let fileLength = parseInt(strLength - (strLength / 8) * 2)
            // 图片尺寸  用于判断
            let size = (fileLength / 1024).toFixed(2)
            console.log(size)

            // 上传拍照信息  调用接口上传图片 .........

            // 保存到本地
            this.dialogCamera = false
            //上传
            this.formData.model.faceInfo = imgBase64
            const res = await huotijiaoyanAPI(add(this.formData))
            console.log(this.formData)
            try {
                console.log(res, 'res')
                if (unt(res.data).status === 0) {
                    console.log(res, 'res222')
                    Toast('Successful recognition')
                    isNext()
                }
            } catch (error) {

            }
            // let ADOM = document.createElement('a')
            // ADOM.href = this.headImgSrc
            // ADOM.download = new Date().getTime() + '.jpeg'
            // ADOM.click()
        },
        // 关闭摄像头
        closeCamera() {
            if (!this.$refs['video'].srcObject) {
                this.dialogCamera = false
                return
            }
            let stream = this.$refs['video'].srcObject
            let tracks = stream.getTracks()
            tracks.forEach(track => {
                track.stop()
            })
            this.$refs['video'].srcObject = null
        },
    }
}
</script>
<style lang="less" scoped>
.huoti {
    width: 100vw;
    background-color: #f5f5f5;
    box-sizing: border-box;

    .video-div {
        margin-left: (35/@a);
        width: (300/@a);
        height: (300/@a);
        border-radius: 50%;
        background-color: #fff;

        .viedo {
            width: 100%;
            height: 100%;
            margin-left: (30/@a);
            border-radius: 50%;
            text-align: center;
            object-fit: cover;
            -webkit-transform: translate3d(0, 0, 0);
            transform: scaleX(-1);
        }
    }

    .btn {
        width: (241/@a);
        height: (53/@a);
        text-align: center;
        line-height: (53/@a);
        background: #E1A08B;
        border-radius: (10/@a);
        margin-left: (67/@a);
        margin-top: (150/@a);
        font-size: (19/@a);
        font-family: Alibaba PuHuiTi;
        font-weight: bold;
        color: #FFFFFF;
    }
}
</style>