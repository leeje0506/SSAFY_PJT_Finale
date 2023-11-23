<template>
  <div class="flex h-screen">
    <!-- Left Pane -->
    <div
      class="hidden xl:flex items-center justify-center flex-1 bg-white text-black"
    >
      <div class="max-w-xl text-center">
        <img src="src/img/메인이미지.jpg" />
      </div>
    </div>
    <!-- Right Pane -->
    <div class="w-full bg-brown xl:w-1/2 flex items-center justify-center">
      <div class="max-w-xl w-full p-6">
        <h1 class="text-3xl font-semibold mb-6 text-black text-center">
          LOG IN
        </h1>
        <div v-if="error" class="text-red-500">{{ error }}</div>
        <form @submit.prevent="login" class="space-y-4">
          <!-- Your form elements go here -->

          <div>
            <label for="userId" class="block text-sm font-medium text-gray-700"
              >ID</label
            >
            <input
              v-model.trim="id"
              type="text"
              id="userId"
              name="userId"
              class="mt-1 p-2 w-full border rounded-md focus:border-yellow-300 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-yellow-500 transition-colors duration-300"
            />
          </div>

          <div>
            <label
              for="password"
              class="block text-sm font-medium text-gray-700"
              >PASSWORD</label
            >
            <input
              v-model.trim="password"
              type="password"
              id="password"
              name="password"
              class="mt-1 p-2 w-full border rounded-md focus:border-yellow-300 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-yellow-500 transition-colors duration-300"
            />
          </div>

          <div>
            <button
              type="submit"
              class="w-full bg-black text-white p-2 rounded-md hover:bg-yellow-600 focus:outline-none focus:bg-black focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-yellow-700 transition-colors duration-300"
            >
              LOG IN
            </button>
          </div>
        </form>
        <div class="mt-4 text-sm text-gray-600 text-center">
          <p>
            Don't you have an account?
            <!-- 여기 로그인 히어로 회원가입 이동하게 만들기 -->
            <RouterLink to="/signup" class="text-black font-sans hover:underline">SIGN UP HERE</RouterLink>
          </p>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref } from "vue";
import { useUserStore } from "@/stores/user";
import { useRouter } from "vue-router";

const store = useUserStore();
const router = useRouter();

const id = ref("");
const password = ref("");
const error = ref(""); // 로그인 실패 시 에러 메시지를 저장할 변수

const login = async function () {
  if (!id.value || !password.value) {
    alert("ID와 비밀번호를 모두 입력해주세요.");
    return;
  }

  try {
    // 로그인 요청 보내기
    await store.userLogin(id.value, password.value);
    // 로그인 성공 시 Test.vue 페이지로 이동
    router.push("");
  } catch (err) {
    // 로그인 실패 시 에러 메시지를 저장하고 표시
    error.value = "ID 혹은 비밀번호가 틀렸습니다.";
  }
};
</script>

<style scoped></style>
