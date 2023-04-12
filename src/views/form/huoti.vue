<template>
    <div class="huoti">
        <FormTopDesc desc="FACE RECOGNITION"></FormTopDesc>
        <div class="video-div"></div>
        <div class="btn">start identifying</div>
    </div>
</template>
<script>
export default {}
</script>
<style lang="less" scoped>
.huoti {
    width: 100vw;
    background-color: #f5f5f5;
    padding-top: (100/@a);
    box-sizing: border-box;
    padding-bottom: (64/@a);

    .video-div {
        margin-left: (35/@a);
        width: (300/@a);
        height: (300/@a);
        border-radius: 50%;
        background-color: #fff;
    }

    .btn {
        width: (241/@a);
        height: (53/@a);
        text-align: center;
        line-height: (53/@a);
        background: #E1A08B;
        border-radius: (10/@a);
        margin-left: (67/@a);
        margin-top: (150/@a);
        font-size: (19/@a);
        font-family: Alibaba PuHuiTi;
        font-weight: bold;
        color: #FFFFFF;
    }
}
</style>