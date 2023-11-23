<template>
  <!-- <div class="justify-center flex bg-yellow-300 items-center">
    <img
      src="https://tecdn.b-cdn.net/img/new/avatars/5.webp"
      class="mx-auto mb-4 w-32 rounded-lg"
      alt="Avatar"
    />
    <div>
      <h5 class="mb-2 text-xl font-medium leading-tight">John Doe</h5>
      <p class="text-neutral-500 dark:text-neutral-400">Web designer</p>
    </div>
  </div> -->

  <div class="mx-auto px-4 sm:px-6 lg:px-8">
    <nav class="flex items-center justify-between flex-wrap bg-teal-500 p-6">
      <div class="flex-column justify-between items-center space-x-5">
        <div>
          <a
            class="text-white text-xl font-bold md:text-2xl hover:text-gray-700"
            href="/"
          >
            <span> WorldFood </span>
          </a>
        </div>
      </div>
      <div class="w-full block flex-grow lg:flex lg:items-center lg:w-auto">
        <div class="text-sm lg:flex-grow">
          <!-- <a
                href="#responsive-header"
                class="block mt-4 lg:inline-block lg:mt-0 text-teal-200 hover:text-white mr-4"
              >
                Home
              </a>
              <a
                href="#responsive-header"
                class="block mt-4 lg:inline-block lg:mt-0 text-teal-200 hover:text-white mr-4"
              >
                About
              </a> -->
          <!-- <a
                href="#responsive-header"
                class="block mt-4 lg:inline-block lg:mt-0 text-teal-200 hover:text-white"
              >
                Blog
              </a> -->
          <!-- <a
                href="#responsive-header"
                class="block mt-4 lg:inline-block lg:mt-0 text-teal-200 hover:text-white"
              >
                Testimonial
              </a> -->
        </div>

        <div class="flex space-x-1">
          <div>
            <!-- <router-link src="/login">login</router-link> -->
            <RouterLink
              to="/login"
              type="button"
              class="inline-block text-sm px-4 py-2 leading-none border rounded text-white border-white hover:border-transparent hover:text-teal-500 hover:bg-white mt-4 lg:mt-0"
            >
              Login
            </RouterLink>
          </div>

          <!-- <button
              @click="useUserStore.signin"
              class="inline-block text-sm px-4 py-2 leading-none border rounded text-white border-white hover:border-transparent hover:text-teal-500 hover:bg-white mt-4 lg:mt-0"
            >
              Signin

            </button> -->
          <RouterLink
            to="signup"
            type="button"
            class="inline-block text-sm px-4 py-2 leading-none border rounded text-white border-white hover:border-transparent hover:text-teal-500 hover:bg-white mt-4 lg:mt-0"
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
