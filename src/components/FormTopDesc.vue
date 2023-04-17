<template>
    <div class="formTopDesc">
        <div class="callback" @click="$router.push('/')">
            <img src="../assets/callback.png" alt="">
        </div>
        <div class="desc">{{ desc }}</div>
        <!-- <div class="info" v-if="info">{{ info }}</div> -->
        <div class="info">{{ info }}</div>
    </div>
</template>

<script>
export default {
    name: 'formTopDesc',
    props: { desc: String, info: String }
}
</script>

<style lang="less" scoped>
.formTopDesc {
    position: fixed;
    top: 0;
    z-index: 99;
    width: 100vw;
    background: #f5f5f5;
    text-align: center;
    padding-bottom: (8/@a);

    .info {
        margin-top: (20/@a);
        font-size: (10/@a);
        font-family: Alibaba PuHuiTi;
        font-weight: bold;
        color: #505050;
    }

    .desc {
        font-size: (19/@a);
        font-family: Alibaba PuHuiTi;
        font-weight: bold;
        color: #010101;
    }

    .callback {
        line-height: (67/@a);
        width: (25/@a);
        height: (25/@a);
        margin-left: (22/@a);

        img {
            width: 100%;
        }
    }
}
</style>