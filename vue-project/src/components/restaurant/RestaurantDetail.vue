<template>
    <div>
        <div>
            <!-- <Map/>  이런식으로 맵 넣기 지도는 res 가져와져 있는 애를 map 에서 바로 가져다 쓰면 되겠네~-->
        </div>
        
        <div>
            <h4>{{ store.Res.Res_Name }}</h4>
            
            <hr>
            <!-- 추가적으로 내용들과 틀을 잡아야 한다. -->
            <div>{{ store.Res.Res_Region }}</div>
            <div>{{ store.Res.Res_Contury }}</div>
            <div>{{ store.Res.Res_Address }}</div>
            <div>{{ store.Res.Res_Tel }}</div>
            <div>{{ store.Res.Res_WDay }}</div>
            <div>{{ store.Res.Res_WEnd }}</div>
            <div>{{ store.Res.Res_Park }}</div>
            <div>{{ store.Res.Res_Kid }}</div>
            <div>{{ store.Res.Res_Wheel }}</div>
            <div>{{ store.Res.Res_Pet }}</div>
            <div>{{ store.Res.Res_Vegi }}</div>
            <div>{{ store.Res.Res_Halal }}</div>
            <div>{{ store.Res.Res_GFree }}</div>
        </div>
        
        <div>
            <!-- <Review/>  이런식으로 리뷰 넣기 음 여기서 axios요청을 보내고 스토어에 가져오게끔 한다음에 review는 세팅 되어 있는 값만을 띄우면 될까???-->
            <!-- 여기서 하는거 보다 그냥 리뷰에서 가져오는게 나을거 같기도 하다  -->
        </div>
    </div>
</template>

<script setup>
// import Game from "@/components/Game.vue";
import { useRoute, useRouter } from 'vue-router'
import { useResStore } from "@/stores/restaurant";
import { onMounted } from "vue";
import axios from 'axios'

const store = useResStore()

const route = useRoute();
const router = useRouter();
onMounted(() => {
    store.GetRes(route.params.id)
})

</script>

<style scoped></style>