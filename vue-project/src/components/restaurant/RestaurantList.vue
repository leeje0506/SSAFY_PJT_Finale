<template>
  <div>
    <!-- <h4>게시글 목록</h4> -->
    <!-- <hr> -->
    <div>
      <RestaurantSearchInput />
    </div>

    <!-- <div>
      <Slider />
    </div> -->

    <table>
      <!-- <tr>
                <th>상호명</th>
                <th>지역</th>
                <th>무료주차</th>
                <th>아동용 의자대여</th>
                <th>휠체어 대여</th>
                <th>반려동물</th>
                <th>할랄음식</th>
                <th>글루텐프리</th>
                <th>주소</th>
            </tr> -->
      <tr v-for="res in store.ResList" :key="res.Res_Id">
        <td>
          <RouterLink :to="`/restaurant/${res.Res_Id}`">{{
            res.Res_Name
          }}</RouterLink>
        </td>
        <td v-if="res.Res_Region == 1">O</td>
        <td v-else>X</td>
        <td v-if="res.Res_Kid == 1">O</td>
        <td v-else>X</td>
        <td v-if="res.Res_Wheel == 1"></td>
        <td v-else>X</td>
        <td v-if="res.Res_Pet == 1">O</td>
        <td v-else>X</td>
        <td v-if="res.Res_Vegi == 1">O</td>
        <td v-else>X</td>
        <td v-if="res.Res_Halal == 1">O</td>
        <td v-else>X</td>
        <td v-if="res.Res_GFree == 1">O</td>
        <td v-else>X</td>
        <td v-if="res.Res_Address == 1">O</td>
        <td v-else>X</td>
      </tr>
    </table>
  </div>
</template>

<script setup>
import { useResStore } from "@/stores/restaurant";
import { onMounted } from "vue";
import RestaurantSearchInput from "./RestaurantSearchInput.vue";
import Slider from "../Slider.vue";
const store = useResStore();

onMounted(() => {
  store.GetResList();
});
</script>

<style scoped></style>
