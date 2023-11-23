<template>
    <div class="container">
        <h4>게시글 목록</h4>
        <hr>
        <RestaurantSearchInput />
        <table class="table table-hover text-center">
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
            <tr v-for="res in currentPageResList" :key="res.res_Id">
                <td>
                    <RouterLink :to="`/restaurant/${res.res_Id}`">{{ res.res_Name }}</RouterLink>
                </td>
                <td >{{ res.res_Region }}</td>
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
                <td >{{ res.res_Address }}</td>

            </tr>
        </table>
        <nav class="resPage" aria-label="Page navigation">
            <div class="pagination d-flex justify-items-between">
                <a class="page-link" :class="{ disabled: currentPage <= 1 }" href="#"
                        @click.prevent="currentPage--">&lt;</a>
                <!-- <li :class="{ active: currentPage === page }" v-for="page in pageCount" :key="page">
                    <a class="page-link" href="#" @click.prevent="clickPage(page)">{{ page }}</a>
                </li> -->
                <a class="page-link" :class="{ disabled: currentPage >= pageCount }" href="#"
                        @click.prevent="currentPage++">&gt;</a>
            </div>
        </nav>
    </div>
</template>

<script setup>
import { useResStore } from "@/stores/restaurant";
import { onMounted, computed, ref } from "vue";
// import BoardSearchInput from "./BoardSearchInput.vue";
const store = useResStore()
onMounted(() => {
    store.GetResList()
})

const perPage = 5;

const currentPage = ref(1)

const pageCount = computed(() => {
    return Math.ceil(store.ResList.length / perPage)
})
const clickPage = function (page) {
    currentPage.value = page
}

const currentPageResList = computed(() => {
    return store.ResList.slice(
        (currentPage.value - 1) * perPage,
        currentPage.value * perPage
    )
})



</script>

<style scoped>
.resPage{
    display: flex;
}
</style>