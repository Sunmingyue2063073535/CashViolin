<template>
    <div class="TopDesc">
        <div class="callback" @click="$router.back()">
            <img src="../assets/callback.png" alt="">
        </div>
        <div class="desc">{{ desc }}</div>
        <!-- <div class="info" v-if="info">{{ info }}</div> -->
        <div class="info">{{ info }}</div>
    </div>
</template>

<script>
export default {
    name: 'TopDesc',
    props: { desc: String, info: String }
}
</script>

<style lang="less" scoped>
.TopDesc {
    position: fixed;
    top: 0;
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
        line-height: (75/@a);
        width: (25/@a);
        height: (25/@a);
        margin-left: (22/@a);

        img {
            width: 100%;
        }
    }
}
</style>