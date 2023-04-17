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
import baseForm from '../views/form/baseForm.vue'
import xieyi from '../views/xieyi/xieyi.vue'
import ocrForm from '../views/form/ocrForm.vue'
import syyinsi from '../views/shouyexieyi/shouyeyinsi.vue'
import syquanxian from '../views/shouyexieyi/shouyequanxian.vue'
import beforeys from '../views/before/beforeys.vue'
import beforeqx from '../views/before/beforeqx.vue'
const routes = [
    { path: '/', component: xieyi },
    { path: '/shouye', component: shouye },
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
    { path: '/baseForm', component: baseForm },
    { path: '/ocrForm', component: ocrForm },
    { path: '/syyinsi', component: syyinsi },
    { path: '/syquanxian', component: syquanxian },
    { path: '/beforeys', component: beforeys },
    { path: '/beforeqx', component: beforeqx },
]

export default routes