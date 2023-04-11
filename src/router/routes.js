import shouye from '../views/shouye/shouye.vue'
import me from '../views/shouye/me.vue'
import login from '../views/login/login.vue'
import ocr from '../views/form/ocr.vue'
const routes = [
    { path: '/', component: shouye },
    { path: '/me', component: me },
    { path: '/login', component: login },
    { path: '/ocr', component: ocr },
]

export default routes