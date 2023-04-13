import request from '@/utils/service'
//获取验证码
export function getyzmApi(data) {
    return request.post('/hydrophanous/kerygma-typed/unary', data)
}
//用户登录
export function getLoginApi(data) {
    return request.post('/xerophil-passifloraceous/subpena-cellule-pylori', data)
}
//获取一个未完成的表单
export function getwwcFormApi(data) {
    return request.post('/cullet/intramarginal-conicity/screenload-isolator-leukemogenic', data)
}
//获取指定表单
export function getZhidingFormApi(data) {
    return request.post('/avenge-intermetallic-pippip/hesitation-ichthyophagy/crispbread-laborist-hemiolia', data)
}
//上传文件
export function uploadFileApi(data) {
    return request.post('/suriname-lymphous-eremite/bingle', data, {
        headers: { 'Content-Type': 'multipart/form-data' },
    })
}
//证件识别
export function zhengjainshibieAPI(data) {
    return request.post('/jinriksha-gipsydom/sonly/glamourous', data)
}
//提交用户的信息
export function uploadUserInfoAPI(data) {
    return request.post('/safekeep/mothering-addressee/solely-odditional', data)
}