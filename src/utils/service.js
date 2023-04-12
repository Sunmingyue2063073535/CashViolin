// 导出一个axios的实例  而且这个实例要有请求拦截器 响应拦截器
import axios from 'axios'
import { Toast } from 'vant'
// import { getPhoneInfo } from "./android";
import store from '../store'
import router from '../router'
// 创建一个axios的实例
const service = axios.create({
    // 设置基地址
    baseURL: 'https://app.pocketgo.xyz',
    withCredentials: true,
    timeout: 600000,
})
service.defaults.headers["Content-Type"] = "application/json";

// 请求拦截器
service.interceptors.request.use(
    async (config) => {
        // store.commit('showLoading')
        // const token = 'D65VTUX2289ab611e5afc7b833a0c924d77faeed01996ef8322860eb02238acbbe2c879871e75a7f7084fa3882d26a3d75c33c8b2d1a7249a72d22b59274c9ae02d9ab57740fc7e7ccb240d9e5fb161b76a39da1f951d6f2561ac2c599701cc1772ff0c7fdbe775f5fa58a000d6f6c96f4e97be1'
        // const token = await getPhoneInfo()
        // config.headers.Token = token
        //添加登录的token
        // const auth = store.state.user.userInfo.token
        // if (auth) {
        //     config.headers.Auth = auth
        // }
        return config
    },
    (error) => {
        // store.commit('showLoading')
        return Promise.reject(error)
    }
)

// 响应拦截器
service.interceptors.response.use(
    (response) => {
        //判断登录失效
        if (response.data.status === 1012) {
            // store.commit('user/clearuserInfo')
            //跳到登录页
            // router.push('/login')
            //提示登录
            // Toast('অনুগ্রহ করে প্রথমে লগ-ইন করুন')
        }
        //对请求错误的结果进行拦截
        try {
            // if (response.data.status && response.data.status !== 0) {
            //     Toast(response.data.message)
            //     store.commit('hideLoading')
            //     return
            // }
        } catch (error) {

        }
        // store.commit('hideLoading')
        return response
    },
    (error) => {
        // store.commit('hideLoading')
        return Promise.reject(error)
    }
)

export default service // 导出axios实例