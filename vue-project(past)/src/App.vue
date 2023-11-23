<script setup>
import { RouterLink, RouterView } from "vue-router";
import AcodianMenu from "./components/AcodianMenu.vue";
import MainHeader from "./components/MainHeader.vue";
import AcodianMenu2 from "./components/AcodianMenu2.vue";
import Toggle from "./components/Toggle.vue";
import SignIn from "./components/SignIn.vue";
import LogIn from "./components/LogIn.vue";
import Game from "./components/Game.vue";
import RestaurantSearchInput from "./components/RestaurantSearchInput.vue";
import Test from "./components/Test.vue";
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
  <!-- <Test /> -->

  <div>
    <!-- v-if="" 걸어서 헤더는 로그인,회원가입,게임 때 날려라 / storeTorefs -->
    <div>
      <MainHeader />
    </div>

    <!-- 여기는 text 대신 라우터뷰 들어가야 함 -->
    <!-- 가장 기본(index.js에서 / 경로)을 Test(=MainView.vue)로 연결해야 함 -->
    <div>
      <Test />
    </div>
  </div>
</template>

<style scoped></style>
