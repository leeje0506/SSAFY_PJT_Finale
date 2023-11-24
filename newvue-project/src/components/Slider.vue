<template>
     <section class="flex flex-col items-center">
        <div class="container mx-auto">
          <div class="flex flex-wrap">
            <div class="w-full">
              <div class="mb-4 text-center my-10">
                <p class="text-white text-5xl font-sans">Search World Food</p>
                <p class="mt-2 text-white font-sans">find your food</p>
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

</template>

<script setup>

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
  width: calc(250px * 15);
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
  background-size: 150%;
}

</style>