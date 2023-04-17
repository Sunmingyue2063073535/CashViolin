<template>
    <div class="noquestions">
        <div class="box">
            <img src="../../assets/nolist.png" alt="">
        </div>
        <div class="desc">{{ desc }}</div>
    </div>
</template>
<script>
export default {
    props: { desc: String }
}
</script>
<style lang="less" scoped>
.noquestions {
    .box {
        margin-top: (84/@a);
        margin-left: (87/@a);
        width: (197/@a);
        height: (133/@a);

        img {
            width: 100%;
        }
    }

    .desc {
        margin-top: (36/@a);
        margin-left: (110/@a);
        font-size: (13/@a);
        font-family: Alibaba PuHuiTi;
        font-weight: bold;
        color: #5F5F5F;
    }
}
</style>