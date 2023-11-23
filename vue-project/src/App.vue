<script setup>
import { RouterLink, RouterView } from "vue-router";
import AcodianMenu from "./components/AcodianMenu.vue";
import MainHeader from "./components/MainHeader.vue";
import AcodianMenu2 from "./components/AcodianMenu2.vue";
import Toggle from "./components/Toggle.vue";
import SignIn from "./components/SignUp.vue";
import LogIn from "./components/LogIn.vue";
import Game from "./components/Game.vue";
import RestaurantSearchInput from "./components/restaurant/RestaurantSearchInput.vue";
import Test from "./components/Test.vue";
import Character from "./components/Character.vue";
import HomeView from "./views/HomeView.vue";
</script>

<template>
  <!-- <AcodianMenu/> -->
  <!-- <MainHeader /> -->
  <!-- <AcodianMenu2 /> -->
  <!-- <Toggle /> -->
  <!-- <SignIn /> -->
  <!-- <LogIn /> -->
  <!-- <Game /> -->
  <!-- <RestaurantSearchInput /> -->
  <!-- <RouterView /> -->
  <!-- <MainHeader/> -->

  <RouterView />
  <!-- <RView/> -->

  <!-- v-if="" 걸어서 헤더는 로그인,회원가입,게임 때 날려라 / storeTorefs -->

  <!-- 여기는 text 대신 라우터뷰 들어가야 함 -->
  <!-- 가장 기본(index.js에서 / 경로)을 Test(=MainView.vue)로 연결해야 함 -->

  <!-- <Test /> -->
</template>

<style scoped>
.main-back {
  background-image: url("../images/hero-bg4.jpg");
  background-repeat: no-repeat;
  background-position: center top;
  object-fit: cover;
  background-size: 100%;
  background-position-y: top 50;
}
</style>
