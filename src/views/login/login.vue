<template>
    <div class="login">
        <div class="callback" @click="$router.back()">
            <img src="../../assets/callback-left.png" alt="">
        </div>
        <div class="login-mask">
            <div class="login-title">Login please</div>
            <div class="login-desc">
                Mobile phone number + 6-digit verification code to log in
            </div>
            <!-- 表单 -->
            <van-form class="form">
                <!-- 手机图标 -->
                <div class="phone-icon">
                    <img src="../../assets/phone.png" alt="">
                </div>
                <!-- 验证码图标 -->
                <div class="yzm-icon">
                    <img src="../../assets/lock.png" alt="">
                </div>
                <!-- 发送验证码按钮 -->
                <div class="yzmBtn" @click="setYzm" v-if="!isyzm">Send</div>
                <div class="yzmBtn" v-else>{{ num }} s</div>
                <van-field type="tel" class="phone" v-model="phone" name="phone" placeholder="Please enter phone number" />
                <van-field type="digit" class="yzm" v-model="code" name="code"
                    placeholder="Please enter verification code" />
                <div class="formBtn" @click="doLogin">Log in</div>
            </van-form>
        </div>
    </div>
</template>

<script>
import { add, unt } from "../../utils/AESKey.js";
import { getyzmApi, getLoginApi } from '../../api'
import { Toast } from "vant";
export default {
    data() {
        return {
            phone: '',
            code: '',
            isyzm: false,
            num: 0
        }
    },
    methods: {
        //登录
        async doLogin() {
            const f = {
                phone: this.phone,
                phoneCode: '+91',
                code: this.code
            }
            const res = await getLoginApi(add(f))
            try {
                if (!add(res.data).status) {
                    //登录成功
                    this.$store.commit('setUserInfo', unt(res.data).user)
                    this.$router.push('/')
                    this.$store.commit('changeLogin', true)
                    Toast('Login Successful')
                    console.log(f, '登录的参数')
                    console.log(unt(res.data))
                }
            } catch (error) {

            }

        },
        //获取验证码
        async setYzm() {
            const f = {
                model: {
                    phone: '',
                    phoneCode: '+91'
                }
            }
            f.model.phone = this.phone

            if (this.phone) {
                try {
                    const res = await getyzmApi(add(f), false)
                    if (unt(res.data).status === 0) {
                        console.log(unt(res.data))
                        this.djs()
                    }
                } catch (error) {

                }
            } else {
                Toast('Please fill in your phone number')
            }
            // console.log(unt(res.data))
        },
        //倒计时
        djs() {
            this.isyzm = true
            this.num = 60
            let timer = setInterval(() => {
                this.num--
                if (this.num < 0) {
                    this.isyzm = false
                    clearInterval(timer)
                }
            }, 1000)
        }
    }
}
</script>

<style lang="less",scoped>
.login {
    width: 100vw;
    height: (667/@a);
    background-image: url(../../assets/login.png);
    background-size: contain;
    padding-top: (180/@a);

    .callback {
        position: absolute;
        top: (25/@a);
        left: (25/@a);
    }

    .login-mask {

        width: (337/@a);
        height: (486/@a);
        background: #FFFFFF;
        border-radius: (26/@a) (26/@a) 0 0;
        margin-left: (19/@a);
        padding-top: (32/@a);
        padding-left: (25/@a);
        padding-right: (30/@a);



        .form {
            position: relative;
            margin-top: (24/@a);

            .formBtn {
                width: (285/@a);
                height: (46/@a);
                background: #D8929B;
                border-radius: (10/@a);
                text-align: center;
                margin-top: (98/@a);
                line-height: (46/@a);
                font-size: (18/@a);
                font-family: Alibaba PuHuiTi;
                font-weight: bold;
                color: #FFFFFF;
            }

            .yzm {
                width: (285/@a);
                height: (46/@a);
                background: #FFF1F3;
                border-radius: 10px;
                margin-top: (11/@a);
                padding-left: (40/@a);
            }

            .phone-icon {
                position: absolute;
                z-index: 1;
                top: (10/@a);
                left: (10/@a);
                width: (15/@a);
                height: (21/@a);

                img {
                    width: 100%;
                }
            }

            .yzm-icon {
                position: absolute;
                z-index: 1;
                top: (65/@a);
                left: (10/@a);
                width: (15/@a);
                height: (21/@a);

                img {
                    width: 100%;
                }
            }

            .yzmBtn {
                position: absolute;
                right: (-5px);
                top: (55/@a);
                z-index: 1;
                width: (56/@a);
                height: (46/@a);
                border-radius: 0 (10/@a) (10/@a) 0;
                background-color: #dc9894;
                font-size: (16/@a);
                text-align: center;
                line-height: (46/@a);
                font-family: Alibaba PuHuiTi;
                font-weight: bold;
                color: #FFFFFF;
            }

            .phone {
                width: (285/@a);
                height: (46/@a);
                background: #FFF1F3;
                border-radius: 0 (10/@a) (10/@a) 0;
                padding-left: (40/@a);
            }
        }

        .login-title {
            font-size: (16/@a);
            font-family: Alibaba PuHuiTi;
            font-weight: bold;
            color: #454545;
        }

        .login-desc {
            width: (290/@a);
            height: (31/@a);
            font-size: (13/@a);
            font-family: Alibaba PuHuiTi;
            font-weight: bold;
            color: #797979;
            margin-top: (10/@a);
            line-height: (19/@a);
        }
    }
}
</style>