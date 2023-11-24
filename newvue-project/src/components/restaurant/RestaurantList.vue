<template>
  <div class="flex justify-center">
    <div class="container space-y-10">
      <div class="flex justify-center">
        <RestaurantSearchInput />
      </div>

      <div class="table-container">
        <table class="table table-hover text-center shadow-md bg-white">
          <thead class="sticky top-0 bg-white">
            <tr class="text-s text-space-x-4">
              <th>상호명</th>
              <th>지역</th>
              <th>무료주차</th>
              <th>유아의자대여</th>
              <th>휠체어대여</th>
              <th>반려동물 동반</th>
              <th>할랄메뉴</th>
              <th>채식메뉴</th>
              <th>글루텐프리메뉴</th>
              <th>주소</th>
            </tr>
          </thead>
          <tbody class="overflow-auto">
            <tr v-for="res in currentPageResList" :key="res.res_Id">
              <td>
                <RouterLink :to="`/restaurant/${res.res_Id}`">{{
                  res.res_Name
                }}</RouterLink>
              </td>
              <td>{{ res.res_Region }}</td>
              <td v-if="res.res_Park == 1">O</td>
              <td v-else>X</td>
              <td v-if="res.res_Kid == 1">O</td>
              <td v-else>X</td>
              <td v-if="res.res_Wheel == 1"></td>
              <td v-else>X</td>
              <td v-if="res.res_Pet == 1">O</td>
              <td v-else>X</td>
              <td v-if="res.res_Vegi == 1">O</td>
              <td v-else>X</td>
              <td v-if="res.res_Halal == 1">O</td>
              <td v-else>X</td>
              <td v-if="res.res_GFree == 1">O</td>
              <td v-else>X</td>
              <td>{{ res.res_Address }}</td>
            </tr>
          </tbody>
        </table>
      </div>
      <nav class="resPage" aria-label="Page navigation">
        <div class="flex justify-between">
          <div class="flex-1">
            <a
              class="page-link bg-gray-500 hover:bg-black text-white rounded-full py-2 px-3"
              :class="{ disabled: currentPage <= 1 }"
              href="#"
              @click.prevent="currentPage--"
              >&lt;</a
            >
          </div>
          <!-- <li :class="{ active: currentPage === page }" v-for="page in pageCount" :key="page">
                        <a class="page-link" href="#" @click.prevent="clickPage(page)">{{ page }}</a>
                    </li> -->
          <div class="flex-1 text-right">
            <a
              class="page-link bg-gray-500 hover:bg-black text-white rounded-full py-2 px-3"
              :class="{ disabled: currentPage >= pageCount }"
              href="#"
              @click.prevent="currentPage++"
              >&gt;</a
            >
          </div>
        </div>
      </nav>
    </div>
  </div>
</template>

<script setup>
import { useResStore } from "@/stores/restaurant";
import { onMounted, computed, ref } from "vue";
import RestaurantSearchInput from "./RestaurantSearchInput.vue";
import Slider from "../Slider.vue";

const store = useResStore();
onMounted(() => {
  store.GetResList();
});

const perPage = 6;

const currentPage = ref(1);

const pageCount = computed(() => {
  return Math.ceil(store.ResList.length / perPage);
});
const clickPage = function (page) {
  currentPage.value = page;
};

const currentPageResList = computed(() => {
  return store.ResList.slice(
    (currentPage.value - 1) * perPage,
    currentPage.value * perPage
  );
});
</script>

<style scoped>
.table-container {
  background-color: white;
  max-height: 500px; /* Adjust as needed */
  overflow-y: auto;
  border-top-left-radius: 10px;
  border-top-right-radius: 10px;
  outline:#1b1b1b;
  
}

thead tr {
  background-color: #1b1b1b;
  color: #ddd;
  border-top-left-radius: 20px;
  border-top-right-radius: 20px;
  table-layout: fixed;
  height: 70px;
}
tbody tr {
  border-bottom-left-radius: 0;
  border-bottom-right-radius: 0;
}

.resPage {
  height: 50px; /* Fixed height */
}

/* Added styles */
table {
  border-collapse: collapse;
  width: 100%; /* 변경된 부분 */
  margin: 0 auto;
  box-shadow: 4px 4px 10px 0 rgba(0, 0, 0, 0.1);
  background-color: white;
  table-layout: fixed;
}
/* 테이블 행 */
th,
td {
  padding: 8px;
  text-align: center;
  border-bottom: 1px solid #ddd;
}

th {
  background-color: rgba;
  color: #ddd;
}

/* 테이블 올렸을 때 */
tbody tr:hover {
  background-color: #d3d3d3;
  
  cursor: pointer;
}

.table th,
.table td {
  border: 1px solid black; /* Border for each cell */
}
</style>
