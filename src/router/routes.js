import shouye from '../views/shouye/shouye.vue'
import me from '../views/shouye/me.vue'
import login from '../views/login/login.vue'
import ocr from '../views/form/ocr.vue'
import quanxian from '../views/xieyi/quanxian.vue'
import rollover from '../views/huankuan/rollover.vue'
import payType from '../views/huankuan/payType.vue'
import goldMoney from '../views/huankuan/goldMoney.vue'
import kefuform from '../views/kefu/kefuForm.vue'
import loan from '../views/product/loan.vue'
import productList from '../views/product/productList.vue'
import askquestions from '../views/kefu/askQuestions.vue'
import huoti from '../views/form/huoti.vue'
import topay from '../views/huankuan/toPay.vue'
const routes = [
    { path: '/', component: shouye },
    { path: '/me', component: me },
    { path: '/login', component: login },
    { path: '/ocr', component: ocr },
    { path: '/quanxian', component: quanxian },
    { path: '/rollover', component: rollover },
    { path: '/payType', component: payType },
    { path: '/goldMoney', component: goldMoney },
    { path: '/kefuform', component: kefuform },
    { path: '/loan', component: loan },
    { path: '/productList', component: productList },
    { path: '/askquestions', component: askquestions },
    { path: '/huoti', component: huoti },
    { path: '/topay', component: topay },
]

export default routes