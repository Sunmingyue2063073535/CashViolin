import FormTopDesc from './FormTopDesc.vue'
import TopDesc from './TopDesc.vue'
import copy from './copy.vue'
export default {
    install(Vue) {
        Vue.component('FormTopDesc', FormTopDesc)
        Vue.component('TopDesc', TopDesc)
        Vue.component('copy', copy)
    }
}