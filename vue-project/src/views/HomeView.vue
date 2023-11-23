<template>
  <div >
    <RouterView />
  </div>
</template>

<script setup>
import MainHeader from "../components/MainHeader.vue";
import Test from "../components/Test.vue";
import { RouterView } from "vue-router";
</script>

<style scoped>
/* .main-back {
  background-image: url("../images/hero-bg4.jpg");
  background-repeat: no-repeat;
  background-position: center top;
  object-fit: cover;
  background-size: 100%;
  background-position-y: top 50;
} */
</style>
