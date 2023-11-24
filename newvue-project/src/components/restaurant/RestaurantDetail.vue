<template>
  <div class="res-back">
    <a
      class="mx-2 pr-4 px-6 sm:px-8 lg:px-3 text-black text-4xl font-bold md:text-4xl hover:text-gray-700"
      href="/"
    >
      <span> WorldFood </span>
    </a>

    <div
      class="container mx-auto flex flex-col items-start justify-center min-h-screen w-[500px] space-y-4"
    >
      <div
        class="content w-full p-14 flex flex-col justify-center items-center bg-gray-100 rounded-lg shadow-lg"
      >

      <div class="modal-container">
        <Modal/>
      </div>
      <div class="flex flex-row space-x-20">

          <div
            class="flex p-12 flex-col items-start bg-gray-100 rounded-lg shadow-lg"
          >
            <h4 class="text-4xl font-bold mb-5 text-center text-indigo-700">
              {{ store.Res.res_Name }}
            </h4>
  
            <div class="information text-xl text-left mb-5">
              <div class="mb-2">지역 : {{ store.Res.res_Region }}</div>
              <div class="mb-2">국가 : {{ store.Res.res_Contury }}</div>
              <div class="mb-2">주소 : {{ store.Res.res_Address }}</div>
              <div class="mb-2">전화번호 : {{ store.Res.res_Tel }}</div>
              <div class="mb-2">주중 영업시간 : {{ store.Res.res_WDay }}</div>
              <div class="mb-2">주말 영업시간 : {{ store.Res.res_WEnd }}</div>
            </div>
          </div>
          <div
            class="flex p-12 flex-col items-start bg-gray-100 rounded-lg shadow-lg"
          >
            <h4 class="text-4xl font-bold mb-5 text-center text-indigo-700">
              {{ store.Res.res_Name }}
            </h4>
  
            <div class="information text-xl text-left mb-5">
              <div class="mb-2">지역 : {{ store.Res.res_Region }}</div>
              <div class="mb-2">국가 : {{ store.Res.res_Contury }}</div>
              <div class="mb-2">주소 : {{ store.Res.res_Address }}</div>
              <div class="mb-2">전화번호 : {{ store.Res.res_Tel }}</div>
              <div class="mb-2">주중 영업시간 : {{ store.Res.res_WDay }}</div>
              <div class="mb-2">주말 영업시간 : {{ store.Res.res_WEnd }}</div>
            </div>
          </div>
          <div
            class="flex p-12 flex-col items-start bg-gray-100 rounded-lg shadow-lg"
          >
            <h4 class="text-4xl font-bold mb-5 text-center text-indigo-700">
              {{ store.Res.res_Name }}
            </h4>
  
            <div class="information text-xl text-left mb-5">
              <div class="mb-2">지역 : {{ store.Res.res_Region }}</div>
              <div class="mb-2">국가 : {{ store.Res.res_Contury }}</div>
              <div class="mb-2">주소 : {{ store.Res.res_Address }}</div>
              <div class="mb-2">전화번호 : {{ store.Res.res_Tel }}</div>
              <div class="mb-2">주중 영업시간 : {{ store.Res.res_WDay }}</div>
              <div class="mb-2">주말 영업시간 : {{ store.Res.res_WEnd }}</div>
            </div>
          </div>
        </div>
      </div>

      <div class="map-and-review flex w-full">
        <div class="map w-[500px] h-[400px] rounded-lg shadow-lg">
          <Mmap v-if="showMap" />
        </div>
        <div class="review flex-grow h-[400px] text-4xl rounded-lg shadow-lg">
          hi 여기는 리뷰를 할 거야
        </div>
      </div>
    </div>
  </div>

  <div class="footer-back">
    <footer class="py-6 text-white">
      <div class="container mx-auto text-center">
        <p>
          Project By:
          <a href="https://themewagon.com/" class="text-blue-500 underline"
            >Jieun&Dongheon</a
          >
        </p>
      </div>
    </footer>
  </div>
</template>

<script setup>
import { useRoute, useRouter } from "vue-router";
import { useResStore } from "@/stores/restaurant";
import { onMounted, ref, watch } from "vue";
import axios from "axios";
import Game from "../Game.vue";
import Mmap from "../maps/Mmap.vue";
import Modal from "../Modal.vue";

const store = useResStore();
const showMap = ref(false);
const route = useRoute();
const router = useRouter();
onMounted(() => {
  store.GetRes(route.params.id).then(() => {
    showMap.value = true;
  });
});
</script>

<style scoped>
/* .container {
  max-width: 100%;
} */
.map {
  height: 400px;
  justify-items: center;
}
.footer-back {
  background-image: url("../../images/footer-dark.jpg");
  background-repeat: no-repeat;
  background-position: center;
  object-fit: cover;
  background-size: 200%;
}

.res-back {
  background-image: url("../../images/hero-bg4.jpg");
  background-repeat: no-repeat;
  background-position: center top;
  object-fit: cover;
  background-size: 100%;
  background-position-y: top 50;
}

.modal-container {
  position: absolute;
  right: 0; /* 원하는 위치에 따라 값을 조정하세요. */
  top: 0; /* 원하는 위치에 따라 값을 조정하세요. */
  bottom: 100;
}
</style>
