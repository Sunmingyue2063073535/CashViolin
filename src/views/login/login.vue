<template>
    <div class="login">
        <div class="callback" @click="$router.back()">
            <img src="../../assets/callback.png" alt="">
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
                <div class="yzmBtn">Obtain</div>
                <van-field class="phone" v-model="username" name="用户名" placeholder="Please enter phone number" />
                <van-field class="yzm" v-model="code" name="用户名" placeholder="please enter verification code" />
                <div class="formBtn">Log in</div>
            </van-form>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            username: '',
            code: ''
        }
    },
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
                right: 0;
                top: 0;
                z-index: 1;
                width: (56/@a);
                height: (46/@a);
                border-radius: 0 (10/@a) (10/@a) 0;
                background-color: #dc9894;
                font-size: (10/@a);
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