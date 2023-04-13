<template>
    <div class="me">
        <!-- 导航 -->
        <div class="nav">
            <div class="nav-shouye" @click="$router.push('/')">
                <img src="../../assets/sy-icon.png" alt="">
            </div>
            <div class="nav-me">
                <img src="../../assets/me-icon-a.png" alt="">
            </div>
        </div>
        <!-- 顶部 -->
        <div class="me-top">
            <div v-if="$store.state.isLogin">
                <div class="me-top-tx">
                    <img src="../../assets/touxiang.png" alt="">
                </div>
                <div class="me-top-name1">{{ $store.state.userInfo.phone }}</div>
            </div>
            <div v-else>
                <div class="me-top-tx">
                    <img src="../../assets/default-user.png" alt="">
                </div>
                <div class="me-top-name2">
                    <button class="btn" @click="$router.push('/login')">Log in</button>
                </div>
            </div>
        </div>
        <div class="me-loan">
            <img src="../../assets/me-banner.png" alt="">
        </div>
        <!-- 功能列表 -->
        <ul class="tools">
            <li @click="$router.push('/loan')">
                <!-- 图标icon -->
                <div class="tools-icon">
                    <img src="../../assets/lock.png" alt="">
                </div>
                <!-- 描述 -->
                <div class="tools-desc">My Loan</div>
                <!-- 右箭头 -->
                <div class="tools-right">
                    <img src="../../assets/right.png" alt="">
                </div>
            </li>
            <li @click="$router.push('/productList')">
                <!-- 图标icon -->
                <div class="tools-icon">
                    <img src="../../assets/lock.png" alt="">
                </div>
                <!-- 描述 -->
                <div class="tools-desc">Privacy Agreement</div>
                <!-- 右箭头 -->
                <div class="tools-right">
                    <img src="../../assets/right.png" alt="">
                </div>
            </li>
            <li>
                <!-- 图标icon -->
                <div class="tools-icon">
                    <img src="../../assets/lock.png" alt="">
                </div>
                <!-- 描述 -->
                <div class="tools-desc">Contact Us</div>
                <!-- 右箭头 -->
                <div class="tools-right">
                    <img src="../../assets/right.png" alt="">
                </div>
            </li>
            <li>
                <!-- 图标icon -->
                <div class="tools-icon">
                    <img src="../../assets/lock.png" alt="">
                </div>
                <!-- 描述 -->
                <div class="tools-desc">Permission statement</div>
                <!-- 右箭头 -->
                <div class="tools-right">
                    <img src="../../assets/right.png" alt="">
                </div>
            </li>
        </ul>
        <!-- 退出按钮 -->
        <button class="tuichu" @click="doLogout" v-if="$store.state.isLogin">Log out</button>
    </div>
</template>
<script>
import { Dialog, Toast } from 'vant'
export default {
    methods: {
        //退出
        doLogout() {
            Dialog.confirm({
                message: 'Are you sure you want to quit?',
                confirmButtonText: 'Confirm',
                cancelButtonText: 'Cancel'
            }).then(() => {
                this.$store.commit('clearUserInfo')
                this.$store.commit('changeLogin', false)
                this.$router.push('/')
                Toast('Exit Successfully')
            });
            // this.$store.commit('clearUserInfo')
            // this.$store.commit('changeLogin', false)
        }
    }
}
</script>
<style lang="less" scoped>
.me {
    width: 100vw;
    background-color: #f5f5f5;
    padding-bottom: (65/@a);

    /deep/.tuichu {
        width: (345/@a);
        height: (51/@a);
        background: #E1A08B;
        border-radius: (10/@a);
        font-size: (16/@a);
        margin-top: (31/@a);
        margin-left: (15/@a);
        text-align: center;
        line-height: (51/@a);
        font-family: Alibaba PuHuiTi;
        font-weight: bold;
        color: #FFFFFF;
    }

    .tools {
        width: (345/@a);
        height: (210/@a);
        margin-top: (12/@a);
        margin-left: (16/@a);

        li {
            width: (345/@a);
            height: (51/@a);
            display: flex;
            padding-top: (11/@a);
            padding-left: (9/@a);
            border-radius: (10/@a);
            margin-bottom: (2/@a);
            background-color: #fff;

            .tools-icon {
                width: (17/@a);
                height: (17/@a);
                border-radius: (5/@a);
                background-color: #fff;

                img {
                    width: 100%;
                }
            }

            .tools-desc {
                font-size: (13/@a);
                flex: 1;
                font-family: Alibaba PuHuiTi;
                font-weight: bold;
                color: #767676;
                margin-left: (13/@a);
                margin-top: (8/@a);
            }

            .tools-right {
                width: (15/@a);
                height: (15/@a);
                margin-right: (20/@a);
                transform: rotate(270deg);
                margin-top: (5/@a);

                img {
                    width: 100%;
                }
            }
        }
    }

    .me-loan {
        width: (345/@a);
        height: (139/@a);
        margin-left: (15/@a);
        margin-top: (9/@a);
        background: #FFFFFF;
        border-radius: (10/@a);

        img {
            width: 100%;
        }
    }

    .me-top {
        width: 100vw;
        height: (150/@a);
        padding-top: (50/@a);
        position: relative;

        .me-top-tx {
            position: absolute;
            top: (5/@a);
            width: (74/@a);
            height: (74/@a);
            background: #FFFFFF;
            border-radius: 50%;
            margin-left: (151/@a);

            img {
                width: 100%;
            }
        }

        .me-top-name1 {
            width: 100vw;
            height: (100/@a);
            border-radius: (30/@a) (30/@a) 0 0;
            background-color: #d8929b;
            font-size: (16/@a);
            font-family: Alibaba PuHuiTi;
            font-weight: bold;
            color: #FFFFFF;
            text-align: center;
            line-height: (100/@a);
        }

        .me-top-name2 {
            width: 100vw;
            height: (100/@a);
            border-radius: (30/@a) (30/@a) 0 0;
            background-color: #d8929b;
            text-align: center;

            .btn {
                margin-top: (40/@a);
                width: (106/@a);
                height: (34/@a);
                background: #FFFFFF;
                border-radius: (5/@a);
                font-size: (14/@a);
                font-family: Alibaba PuHuiTi;
                font-weight: bold;
                color: #E1A08B;
            }
        }
    }

    .nav {
        position: fixed;
        bottom: 0;
        left: 0;
        z-index: 1;
        width: 100vw;
        height: (56/@a);
        background-color: #fff;
        display: flex;
        justify-content: space-around;
        align-items: center;

        .nav-shouye {
            width: (23/@a);
            height: (27/@a);

            img {
                width: 100%;
            }
        }

        .nav-me {
            width: (23/@a);
            height: (27/@a);

            img {
                width: 100%;
            }
        }
    }
}
</style>