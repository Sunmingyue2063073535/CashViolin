<template>
  <div id="app">
    <router-view></router-view>
    <div class="mask" v-if="$store.state.isShow">
      <van-overlay :show="$store.state.isShow" />
      <van-loading color="#df9c8f" size="150px" text-size="50px"></van-loading>
    </div>
  </div>
</template>
<script>
export default {

}
</script>


<style lang="less" scoped>
#app {
  .mask {
    position: fixed;
    top: 0;
    z-index: 9999999;
    width: 100vw;
    margin-top: (300/@a);
    text-align: center;
  }
}
</style>