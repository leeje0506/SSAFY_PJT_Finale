<template>
  <div class="mx-auto px-4 sm:px-6 lg:px-8">
    <nav class="flex items-center justify-between flex-wrap bg-teal-500 p-6">
      <div class="flex-column justify-between items-center space-x-5">
        <div>
          <a
            class="text-white text-4xl font-bold md:text-4xl hover:text-gray-700"
            href="/"
          >
            <span> WorldFood </span>
          </a>
        </div>
      </div>
      <div class="w-full block flex-grow lg:flex lg:items-center lg:w-auto">
        <div class="text-sm lg:flex-grow"></div>

        <div class="flex space-x-2">
          <div>
           
            <RouterLink
              to="/login"
              type="button"
              class="inline-block text-xl px-4 py-2 leading-none border rounded text-white border-white hover:border-transparent hover:text-teal-500 hover:bg-white mt-4 lg:mt-0"
            >
              Login
            </RouterLink>
          </div>

          <RouterLink
            to="signup"
            type="button"
            class="inline-block text-xl px-4 py-2 leading-none border rounded text-white border-white hover:border-transparent hover:text-teal-500 hover:bg-white mt-4 lg:mt-0"
            >SignUp</RouterLink
          >
        </div>
      </div>
    </nav>
  </div>
</template>

<script setup>
import { useUserStore } from "@/stores/user";
import { storeToRefs } from "pinia";
import { RouterLink, RouterView } from "vue-router";

const { login, signin } = storeToRefs(useUserStore); // 동적
</script>

<style scoped></style>
