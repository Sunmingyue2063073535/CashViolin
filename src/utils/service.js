// 导出一个axios的实例  而且这个实例要有请求拦截器 响应拦截器
import axios from 'axios'
import { Toast } from 'vant'
// import { getPhoneInfo } from "./android";
import store from '../store'
import router from '../router'
// 创建一个axios的实例
const service = axios.create({
    // 设置基地址
    baseURL: 'https://app.cashviolin.xyz',
    withCredentials: true,
    timeout: 600000,
})
service.defaults.headers["Content-Type"] = "application/json";

// 请求拦截器
service.interceptors.request.use(
    async(config) => {
        store.commit('showLoading')
            //添加token
        const token = 'UAM3IHKS3a86d2c5966e5bed09f370e3b46ac6fc56eb8f8fe691e3857e08fbb6b923e4d2180251d857a9b64fb1442d8d39a955bff7bc6a1c58ff6dc0e289f5b15857fb4efb5c0266c543445bd6aed2d35e6a608342049fe3de2c5e721cabeaf4dc6cecb8e2452ca50b4ff78474ce2ea3f729b81f'
            // const token = await getPhoneInfo()
        config.headers.Token = token
            //添加登录的token
        const auth = store.state.userInfo.token
        if (auth) {
            config.headers.Auth = auth
        }
        return config
    },
    (error) => {
        store.commit('showLoading')
        return Promise.reject(error)
    }
)

// 响应拦截器
service.interceptors.response.use(
    (response) => {
        //判断登录失效
        if (response.data.status === 1012) {
            store.commit('user/clearuserInfo')
                // 跳到登录页
            router.push('/login')
                // 提示登录
            Toast('Please log in first')
        }
        //对请求错误的结果进行拦截
        try {
            if (response.data.status && response.data.status !== 0) {
                Toast(response.data.message)
                store.commit('hideLoading')
                return
            }
        } catch (error) {

        }
        store.commit('hideLoading')
        return response
    },
    (error) => {
        store.commit('hideLoading')
        return Promise.reject(error)
    }
)

export default service // 导出axios实例