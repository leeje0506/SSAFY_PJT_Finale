<template>
    <div>
        <h4>게시글 목록</h4>
        <hr>
        
        <!-- <RestaurantSearchInput /> -->

        <table>
            <tr>
                <th> 상호명 </th>
                <th> 지역 </th>
                <th> 무료주차 </th>
                <th> 아동용 의자대여 </th>
                <th> 휠체어 대여 </th>
                <th> 반려동물 </th>
                <th> 할랄음식 </th>
                <th> 글루텐프리 </th>
                <th> 주소 </th>
            </tr>
            <tr v-for="res in store.ResList" :key="res.res_Id">
                <td>
                    <RouterLink :to="`/restaurant/${res.res_Id}`">{{ res.res_Name }}</RouterLink>
                </td>
                <td v-if="res.res_Region == 1">O</td>
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
                <td >{{ res.res_Address }}</td>

            </tr>
        </table>

    </div>
</template>

<script setup>
import { useResStore } from "@/stores/restaurant";
import { onMounted } from "vue";
// import RestaurantSearchInput from "./RestaurantSearchInput.vue";
const store = useResStore()

onMounted(() => {
    store.GetResList()
})

</script>

<style scoped></style>