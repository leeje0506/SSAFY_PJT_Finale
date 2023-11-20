<script setup>
import { RouterLink, RouterView } from "vue-router";
</script>

<template>
  <header>
    <div class="wrapper">
      <nav>
        <!-- <RouterLink to="/home">Home</RouterLink>  |  -->
        <!-- <RouterLink to="/calendar">Calendar</RouterLink> -->
      </nav>
    </div>
  </header>

  <RouterView />

  <div class="justify-center flex bg-yellow-300 items-center h-screen">
    <div class="text-4xl">Hello 👋🏼</div>
  </div>
</template>

<style scoped></style>
