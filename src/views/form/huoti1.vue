<template>
    <div class="huoti">
        <FormTopDesc desc="FACE RECOGNITION"></FormTopDesc>
        <div class="video-div">
            <video ref="videoPlayer" autoplay class="video" width="300" height="300"
                style="object-fit: cover;border-radius: 50%;" playsinline></video>
        </div>
        <div class="btn" @click="startRecording">{{ btnDesc }}</div>
    </div>
</template>
<script>
import { add, unt } from '../../utils/AESKey.js'
import { huotijiaoyanAPI } from "../../api";
import isNext from './isNext.js'
import { Toast } from "vant";
export default {
    data() {
        return {
            mediaRecorder: null,
            num: 3,
            chunks: [],
            formData: {
                model: {
                    faceInfo: null,
                    action: '1',
                    livenessType: 'GCT'
                }
            },
            isShow: false
        }
    },
    methods: {
        startRecording() {
            this.isShow = true
            const video = this.$refs.videoPlayer;
            const stream = video.srcObject;
            const facingMode = stream.getVideoTracks()[0].getSettings().facingMode;
            if (facingMode === 'user') {
                video.style.transform = 'scaleX(-1)';
            }
            const mediaRecorder = new MediaRecorder(stream);

            this.mediaRecorder = mediaRecorder;

            mediaRecorder.ondataavailable = event => {
                this.chunks.push(event.data);
            };
            mediaRecorder.onstop = () => {
                const blob = new Blob(this.chunks, { type: 'video/webm' });
                const reader = new FileReader();
                reader.readAsDataURL(blob);
                reader.onloadend = async () => {
                    const base64data = reader.result;
                    console.log(base64data)
                    // 处理Base64字符串
                    this.formData.model.faceInfo = base64data
                    //上传活体视屏
                    console.log(this.formData, 'formData')
                    console.log(base64data.length / 1024, '1222222222222222222')
                    const res = await huotijiaoyanAPI(add(this.formData))
                    try {
                        console.log(res, 'res')
                        if (unt(res.data).status === 0) {
                            console.log(res, 'res222')
                            Toast('Successful recognition')
                            isNext()
                        }
                    } catch (error) {

                    }
                };

            };

            mediaRecorder.start();
            this.djs()
            setTimeout(() => {
                this.stopRecording()

            }, 3000);
        },
        stopRecording() {
            const mediaRecorder = this.mediaRecorder;
            mediaRecorder.stop();
        },
        djs() {
            this.num = 3
            let timer = setInterval(() => {
                this.num--
                if (this.num < 0) {
                    clearInterval(timer)
                    this.num = 3,
                        this.isShow = false
                }
            }, 1000)
        }
    }, created() {
        // 解决视频卡顿
        const constraints = {
            audio: true,
            video: {
                width: { ideal: 640 },
                height: { ideal: 480 },
                frameRate: { ideal: 30 }
            }
        };

        navigator.mediaDevices.getUserMedia(constraints)
            .then(stream => {
                this.$refs.videoPlayer.srcObject = stream;
                this.$refs.videoPlayer.play();
            })
            .catch(error => console.error(error));
    },
    mounted() {
        const video = this.$refs.videoPlayer;

        navigator.mediaDevices.getUserMedia({ video: true })
            .then(stream => {
                video.srcObject = stream;
            })
            .catch(error => {
                console.log(error);
            });
    },
    computed: {
        btnDesc() {
            return !this.isShow ? 'start identifying' : this.num
        }
    }
}
</script>
<style lang="less" scoped>
.huoti {
    width: 100vw;
    background-color: #f5f5f5;
    padding-top: (100/@a);
    box-sizing: border-box;
    padding-bottom: (64/@a);

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