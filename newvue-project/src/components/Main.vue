<template>
  <div>
    <div class="main-back">
      <!-- header section  -->
      <MainHeader />
      <!-- header section -->

      <!-- slider section -->
      <section class="flex flex-col items-center">
        <div class="container mx-auto">
          <div class="flex flex-wrap">
            <div class="w-full">
              <div class="mb-2 items-center text-center my-4">
                <p class="text-white text-7xl font-sans">Search World Food</p>
                <p class="mt-2 text-2xl text-white font-sans">find your food</p>
                <div class="font-3xl flex-center space-x-1">
                  <div class="flex items-center justify-center space-x-4">
                    <img class="w-12 h-15  mt-5" src="../images/dish.png" />
                    <RouterLink
                      to="/game"
                      class="block lg:inline-block lg:mt-5 text-5xl font-bold hover:text-white"
                      >Game</RouterLink
                    >
                    <img class="w-12 h-15  mt-5 mr-5" src="../images/dish.png" />
                  </div>
                </div>
              </div>
              <div class="mb-4 pt-5">
                <div class="container mx-auto">
                  <div class="flex flex-wrap">
                    <div class="w-full">
                      <form>
                        <div class="flex flex-wrap">
                          <div class="w-full">
                            <div class="flex justify-center">
                              <RestaurantList />
                            </div>
                          </div>
                        </div>
                      </form>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="flex pt-10">
          <!-- 슬라이더 테스트 개수 안 늘리고 계속 돌 수 있는 방법 없나..?ㅠ -->
          <div class="slider">
            <div class="slide-track">
              <div class="slide">
                <img src="src/images/slider-img1.png" alt="" />
              </div>
              <div class="slide">
                <img src="src/images/slider-img2.png" alt="" />
              </div>
              <div class="slide">
                <img src="src/images/slider-img3.png" alt="" />
              </div>
              <div class="slide">
                <img src="src/images/slider-img4.png" alt="" />
              </div>
              <div class="slide">
                <img src="src/images/slider-img1.png" alt="" />
              </div>
              <div class="slide">
                <img src="src/images/slider-img2.png" alt="" />
              </div>
              <div class="slide">
                <img src="src/images/slider-img3.png" alt="" />
              </div>
              <div class="slide">
                <img src="src/images/slider-img4.png" alt="" />
              </div>
              <div class="slide">
                <img src="src/images/slider-img1.png" alt="" />
              </div>
              <div class="slide">
                <img src="src/images/slider-img2.png" alt="" />
              </div>
              <div class="slide">
                <img src="src/images/slider-img3.png" alt="" />
              </div>
              <div class="slide">
                <img src="src/images/slider-img4.png" alt="" />
              </div>
              <div class="slide">
                <img src="src/images/slider-img1.png" alt="" />
              </div>
              <div class="slide">
                <img src="src/images/slider-img2.png" alt="" />
              </div>
              <div class="slide">
                <img src="src/images/slider-img3.png" alt="" />
              </div>
              <div class="slide">
                <img src="src/images/slider-img4.png" alt="" />
              </div>
              <div class="slide">
                <img src="src/images/slider-img1.png" alt="" />
              </div>
              <div class="slide">
                <img src="src/images/slider-img2.png" alt="" />
              </div>
              <div class="slide">
                <img src="src/images/slider-img3.png" alt="" />
              </div>
              <div class="slide">
                <img src="src/images/slider-img4.png" alt="" />
              </div>
            </div>
          </div>
        </div>
      </section>

      <!-- slider section -->
    </div>

    <section class="py-20">
      <!--  리뷰 게시판을 띄울 수 있게 되면, 검색창 + 슬라이더 + 리뷰 순으로 할 지, 슬라이더 + 검색 + 리뷰 순일 지 고민-->
    </section>

    <!-- footer section -->
    <div class="footer-back">
      <footer class="py-6 text-white">
        <div class="container mx-auto text-center">
          <p>
            Project By:
            <a href="https://themewagon.com/" class="text-blue-500 underline"
              >Jieun&Dongheon</a
            >
          </p>
        </div>
      </footer>
    </div>
    <!-- footer section -->
  </div>
</template>

<script setup>
import { ref } from "vue";
import RestaurantSearchInput from "./restaurant/RestaurantSearchInput.vue";
import MainHeader from "./MainHeader.vue";
import RestaurantList from "./restaurant/RestaurantList.vue";

import { RouterLink, RouterView } from "vue-router";
</script>

<style scoped>
body {
  align-items: center;
  /* background: white; */
  display: flex;
  height: auto;
  justify-content: center;
}

@-webkit-keyframes scroll {
  0% {
    transform: translateX(0);
  }
  100% {
    transform: translateX(calc(-250px * 4));
  }
}

@keyframes scroll {
  0% {
    transform: translateX(0);
  }
  100% {
    transform: translateX(calc(-250px * 4));
  }
}
.slider {
  /* background: white; */
  /* box-shadow: 0 10px 20px -5px rgba(0, 0, 0, 0.125); */
  height: auto;
  margin: auto;
  overflow: hidden;
  position: relative;
  width: auto;
}
.slider::before,
.slider::after {
  /* background: linear-gradient(to right, white 0%, rgba(255, 255, 255, 0) 100%); */
  content: "";

  position: absolute;

  z-index: 2;
}
.slider::after {
  right: 0;
  top: 0;
  transform: rotateZ(180deg);
}
.slider::before {
  left: 10;
  top: 10;
}
.slider .slide-track {
  -webkit-animation: scroll 25s linear infinite;
  animation: scroll 25s linear infinite;
  display: flex;
  width: calc(250px * 20);
}
.slider .slide {
  height: auto;
  width: auto;
}
.main-back {
  background-image: url("../images/hero-bg4.jpg");
  background-repeat: no-repeat;
  background-position: center top;
  object-fit: cover;
  background-size: 100%;
  background-position-y: top 50;
}
.footer-back {
  background-image: url("../images/footer-dark.jpg");
  background-repeat: no-repeat;
  background-position: center;
  object-fit: cover;
  background-size: 200%;
}
</style>
