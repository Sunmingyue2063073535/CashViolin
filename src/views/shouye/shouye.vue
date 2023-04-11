<template>
    <div class="shouye">
        <!-- 顶部图 -->
        <div class="shouye-top">
            <img src="../../assets/shouye.png" alt="">
        </div>
        <!-- 去贷款按钮 -->
        <div class="btn" @click="$router.push('/ocr')">Apply now</div>
        <!-- banner -->
        <div class="banner">
            <div class="toapply">To apply</div>
        </div>
        <div class="three">
            <img src="../../assets/shouye-three.png" alt="">
        </div>
        <div class="nav">
            <div class="nav-shouye">
                <img src="../../assets/sy-icon-a.png" alt="">
            </div>
            <div class="nav-me" @click="$router.push('/me')">
                <img src="../../assets/me-icon.png" alt="">
            </div>
        </div>
    </div>
</template>

<script>
export default {}
</script>

<style lang="less" scoped>
.shouye {
    width: 100vw;
    background-color: #f5f5f5;
    padding-top: (39/@a);
    padding-bottom: (70/@a);

    .nav {
        position: fixed;
        bottom: 0;
        left: 0;
        z-index: 1;
        width: 100vw;
        height: (56/@a);
        background-color: #fff;
        display: flex;
        justify-content: space-around;
        align-items: center;

        .nav-shouye {
            width: (23/@a);
            height: (27/@a);

            img {
                width: 100%;
            }
        }

        .nav-me {
            width: (23/@a);
            height: (27/@a);

            img {
                width: 100%;
            }
        }
    }

    .three {
        width: (330/@a);
        height: (134/@a);
        background: #FFFFFF;
        border-radius: (10/@a);
        margin-top: (7/@a);
        margin-left: (22/@a);

        img {
            width: 100%;
        }
    }

    .banner {
        width: (330/@a);
        height: (141/@a);
        background: #FFFFFF;
        border-radius: (10/@a);
        margin-left: (22/@a);
        background-image: url(../../assets/shouye-banner.png);
        background-size: contain;
        padding-top: (85/@a);
        padding-left: (15/@a);
        margin-top: (9/@a);

        .toapply {
            width: (90/@a);
            height: (34/@a);
            background: #E1A08B;
            border-radius: (10/@a);
            font-size: (11/@a);
            text-align: center;
            line-height: (34/@a);
            font-family: Alibaba PuHuiTi;
            font-weight: bold;
            color: #FFFFFF;
        }
    }

    .btn {
        width: (330/@a);
        height: (52/@a);
        background: #E1A08B;
        border-radius: (10/@a);
        margin-left: (22/@a);
        text-align: center;
        line-height: (52/@a);
        font-size: (16/@a);
        font-family: Alibaba PuHuiTi;
        font-weight: bold;
        color: #FFFFFF;
    }



    .shouye-top {
        width: (335/@a);
        height: (323/@a);
        margin-left: (22/@a);

        img {
            width: 100%;
        }
    }
}
</style>