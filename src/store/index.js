import Vue from "vue";
import Vuex from "vuex";
import createPersistedState from "vuex-persistedstate"

Vue.use(Vuex);

export default new Vuex.Store({
  plugins: [createPersistedState()],
  state: {
    isLogin: false, //是否登录
    count: 0 //我的订单上面的状态
  },
  getters: {},
  mutations: {
    //change title count
    changeCount(state, payload) {
      state.count = payload
    },
    // 登录或退出
    changeLogin(state, payload) {
      state.isLogin = payload
    }
  },
  actions: {},
  modules: {},
});