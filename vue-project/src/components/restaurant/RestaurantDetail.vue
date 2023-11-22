<template>
    <div>

        <div>
            <h4>{{ store.Res.res_Name }}</h4>

            <hr>
            <!-- 추가적으로 내용들과 틀을 잡아야 한다. -->
            <div>{{ store.Res.res_Region }}</div>
            <div>{{ store.Res.res_Contury }}</div>
            <div>{{ store.Res.res_Address }}</div>
            <div>{{ store.Res.res_Tel }}</div>
            <div>{{ store.Res.res_WDay }}</div>
            <div>{{ store.Res.res_WEnd }}</div>
            <div>{{ store.Res.res_Park }}</div>
            <div>{{ store.Res.res_Kid }}</div>
            <div>{{ store.Res.res_Wheel }}</div>
            <div>{{ store.Res.res_Pet }}</div>
            <div>{{ store.Res.res_Vegi }}</div>
            <div>{{ store.Res.res_Halal }}</div>
            <div>{{ store.Res.res_GFree }}</div>
        </div>

        <div>

            <Mmap v-if="showMap" />

        </div>
        <div>
            <!-- <Review/>  -->
            <p>{{ store.Res.res_Lati }}</p>
            <p> {{ store.Res.res_Longi }}</p>
        </div>
    </div>
</template>

<script setup>

import { useRoute, useRouter } from 'vue-router'
import { useResStore } from "@/stores/restaurant";
import { onMounted, ref, watch } from "vue";
import axios from 'axios'
import Game from "../Game.vue";
import Mmap from '../maps/Mmap.vue';


const store = useResStore()
const showMap = ref(false);
const route = useRoute();
const router = useRouter();
onMounted(() => {
    store.GetRes(route.params.id).then(() => {
        showMap.value = true;
    })
});


</script>

<style scoped></style>