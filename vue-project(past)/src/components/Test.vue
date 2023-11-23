<template>
  <div class="mx-auto">
    <!-- header section starts -->
    <!-- <div>
      <MainHeader />
    </div> -->
    <!-- end header section -->
    <!-- slider section -->
    <section class="flex flex-col items-center">
      <div class="container mx-auto">
        <div class="flex flex-wrap">
          <div class="w-full">
            <div class="mb-4 text-center my-10">
              <p class="text-4xl font-bold">Search World Food</p>
              <p class="mt-2">세계음식을 찾자~</p>
            </div>
            <div class="mb-4 pt-5">
              <div class="container mx-auto">
                <div class="flex flex-wrap">
                  <div class="w-full">
                    <form>
                      <div class="flex flex-wrap">
                        <div class="w-full">
                          <div class="flex justify-center">
                            <RestaurantSearchInput />
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
      <div class="flex overflow-x-scroll pt-10">
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
    <!-- end slider section -->
  </div>

  <section class="py-20">
    <!-- 리뷰 게시판 불러올 곳, 밑은 임시로 확인차...-->
    <RestaurantSearchInput />
  </section>

  <!-- about section -->
  <section class="py-20">
    <div class="container mx-auto">
      <div class="w-full md:w-11/12 lg:w-10/12 mx-auto">
        <div class="text-center mb-10">
          <!-- 게임뷰로 이동하게 만들어야 하는 부분!! 라우터링크 해야하나??ㄴ -->
          <a
            href="/Game.vue"
            class="block mt-4 lg:inline-block lg:mt-0 text-4xl font-bold hover:text-white mr-4"
          >
            Go to game
          </a>
        </div>
        <div class="flex flex-col md:flex-row items-center justify-between">
          <div class="w-full md:w-7/12 mx-auto mb-10 md:mb-0">
            <div class="relative">
              <img src="src/images/about-img.jpg" alt="" class="w-full" />
            </div>
          </div>
          <div class="w-full md:w-5/12">
            <p class="mb-4">우짜고 저짜고 이러쿵 저러쿵</p>
            <a href="" class="flex items-center text-blue-500">
              <i class="fa fa-arrow-right" aria-hidden="true"></i>
            </a>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- end about section -->

  <div class="footer_container">
    <!-- info section -->
    <section class="info_section">
      <div class="container">
        <div class="contact_box">
          <a href="">
            <i class="fa fa-map-marker" aria-hidden="true"></i>
          </a>
          <a href="">
            <i class="fa fa-phone" aria-hidden="true"></i>
          </a>
          <a href="">
            <i class="fa fa-envelope" aria-hidden="true"></i>
          </a>
        </div>
        <!-- <div class="info_links">
          <ul>
            <li class="active">
              <a href="index.html"> Home </a>
            </li>
            <li>
              <a href="about.html"> About </a>
            </li>
            <li>
              <a class="" href="blog.html"> Blog </a>
            </li>
            <li>
              <a class="" href="testimonial.html"> Testimonial </a>
            </li>
          </ul>
        </div> -->
        <div class="social_box">
          <a href="">
            <i class="fa fa-facebook" aria-hidden="true"></i>
          </a>
          <a href="">
            <i class="fa fa-twitter" aria-hidden="true"></i>
          </a>
          <a href="">
            <i class="fa fa-linkedin" aria-hidden="true"></i>
          </a>
        </div>
      </div>
    </section>
    <!-- end info_section -->

    <!-- footer section -->
    <footer class="py-6 bg-gray-800 text-white">
      <div class="container mx-auto text-center">
        <p>
          &copy; <span id="displayYear"></span> All Rights Reserved By
          <a href="https://html.design/" class="text-blue-500 underline"
            >Free Html Templates</a
          ><br />
          Distributed By:
          <a href="https://themewagon.com/" class="text-blue-500 underline"
            >ThemeWagon</a
          >
        </p>
      </div>
    </footer>
    <!-- footer section -->
  </div>
</template>

<script setup>
import { ref } from "vue";
import RestaurantSearchInput from "./RestaurantSearchInput.vue";
import MainHeader from "./MainHeader.vue";
// import { routerLink } from "vue-router";

// Your reactive properties here
let search = ref("");

// Your methods here
const handleSubmit = () => {
  // Your form submit logic here
};

// menu
const openNav = () => {};
</script>

<style scoped>
body {
  align-items: center;
  background: #e3e3e3;
  display: flex;
  height: auto;
  justify-content: center;
}

@-webkit-keyframes scroll {
  0% {
    transform: translateX(0);
  }
  100% {
    transform: translateX(calc(-250px * 3));
  }
}

@keyframes scroll {
  0% {
    transform: translateX(0);
  }
  100% {
    transform: translateX(calc(-250px * 3));
  }
}
.slider {
  background: white;
  box-shadow: 0 10px 20px -5px rgba(0, 0, 0, 0.125);
  height: auto;
  margin: auto;
  overflow: hidden;
  position: relative;
  width: auto;
}
.slider::before,
.slider::after {
  background: linear-gradient(to right, white 0%, rgba(255, 255, 255, 0) 100%);
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
  left: 0;
  top: 0;
}
.slider .slide-track {
  -webkit-animation: scroll 25s linear infinite;
  animation: scroll 25s linear infinite;
  display: flex;
  width: calc(250px * 15);
}
.slider .slide {
  height: auto;
  width: auto;
}
</style>
