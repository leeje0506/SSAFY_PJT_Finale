<template>
  <RouterLink to="/" class="text-black text-2xl font-sans hover:underline"
    >Home</RouterLink
  >
  <div class="flex justify-center items-center h-screen">
    <!-- 왼쪽 영역 -->

    <div class="max-w-xl text-center">
      <div class="max-w-xl text-center">
        <img src="src/img/메인이미지.jpg" />
      </div>

      <!-- 오른쪽 영역 -->

      <div class="max-w-xl w-full p-6">
        <h1 class="text-3xl font-semibold mb-6 text-black text-center">
          SIGN UP
        </h1>
        <!-- 에러 메시지 -->
        <div v-if="error" class="text-red-500">{{ error }}</div>

        <!-- 회원가입 폼 -->
        <form @submit.prevent="signup" class="space-y-4">
          <!-- 사용자 이름 입력 -->
          <div>
            <label
              for="username"
              class="block text-sm font-medium text-gray-700"
              >USER NAME</label
            >
            <input
              v-model="UserInfo.name"
              type="text"
              id="username"
              name="username"
              class="mt-1 p-2 w-full border rounded-md focus:border-yellow-300 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-yellow-500 transition-colors duration-300"
            />
          </div>
          <!-- 사용자 ID 입력 -->
          <div>
            <label for="userId" class="block text-sm font-medium text-gray-700"
              >ID</label
            >
            <input
              v-model="UserInfo.id"
              type="text"
              id="userId"
              name="userId"
              class="mt-1 p-2 w-full border rounded-md focus:border-yellow-300 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-yellow-500 transition-colors duration-300"
            />
          </div>
          <!-- 비밀번호 입력 -->
          <div>
            <label
              for="password"
              class="block text-sm font-medium text-gray-700"
              >PASSWORD</label
            >
            <input
              v-model="UserInfo.password"
              type="password"
              id="password"
              name="password"
              class="mt-1 p-2 w-full border rounded-md focus:border-yellow-300 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-yellow-500 transition-colors duration-300"
            />
          </div>

          <!-- 캐릭터 선택 -->
          <div>
            <label
              for="character"
              class="block text-sm font-medium text-gray-700"
              >Choose Character</label
            >

            <div class="flex space-x-5">
              <div
                class="flex items-center me-4"
                v-for="(item, index) in items"
                :key="index"
              >
                <input
                  :id="'radio' + index"
                  type="radio"
                  :value="index"
                  v-model="selectedCharacter"
                  class="w-4 h-4 text-yellow-400 bg-gray-100 border-gray-300 rounded focus:ring-yellow-500 dark:focus:ring-yellow-600 dark:ring-offset-gray-800 focus:ring-2 dark:bg-gray-700 dark:border-gray-600"
                />

                <label
                  :for="'radio' + index"
                  class="ms-2 w-10 h-15 text-sm font-medium text-gray-900 dark:text-gray-300"
                >
                  <img :src="item.image" alt="Yellow" />
                </label>
              </div>
            </div>
          </div>

          <!-- 회원가입 버튼 -->
          <div>
            <button
              type="submit"
              class="w-full bg-black text-white p-2 rounded-md hover:bg-yellow-600 focus:outline-none focus:bg-yellow-600 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-yellow-700 transition-colors duration-300"
            >
              SIGN UP
            </button>
          </div>
        </form>
        <!-- 로그인 페이지로 이동하는 링크 -->
        <div class="mt-4 text-sm text-gray-600 text-center">
          <p>
            Already have an account?
            <RouterLink to="/login" class="text-black font-sans hover:underline"
              >LOG IN HERE</RouterLink
            >
          </p>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { useUserStore } from "@/stores/user";
import { ref } from "vue";
import { RouterLink, useRouter } from "vue-router";

const store = useUserStore();
const router = useRouter();

// 회원가입 버튼 클릭 시 호출되는 함수
const signup = async function () {
  // async 키워드 추가
  // 선택한 캐릭터의 정수값을 UserInfo에 저장
  UserInfo.character = selectedCharacter;

  try {
    await store.signUp(UserInfo.value); // await 키워드 추가
    // 회원가입 성공 후 홈페이지로 이동
    router.push("");
  } catch (err) {
    // 회원가입 실패 시 오류 출력
    error.value = err.message;
  }
};
// 사용자 정보를 저장할 변수
const UserInfo = ref({
  id: "",
  password: "",
  name: "",
  character: null, // 초기값 null로 설정
});

// 캐릭터 이미지 경로
const items = ref([
  { image: "src/chaImage/쿠로미.png" },
  { image: "src/chaImage/시나모롤.png" },
  { image: "src/chaImage/케로피.png" },
  { image: "src/chaImage/턱시도샘.png" },
  { image: "src/chaImage/포차코.png" },
  { image: "src/chaImage/폼폼푸린.png" },
  { image: "src/chaImage/헬로키티.png" },
]);

// 선택된 캐릭터의 인덱스
const selectedCharacter = ref(null); // 초기값 null로 설정
</script>

<style scoped></style>
