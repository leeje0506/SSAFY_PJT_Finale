<template>
  <div>
    <!-- 메인 화면으로 돌아가기 만들기 -->
    <RouterLink
      to="/"
      class="text-black text-xl font-bold md:text-2xl hover:text-yellow-700"
    >
      <span> WorldFood </span>
    </RouterLink>
  </div>
  <p class="title">{{ WorldTitle }} ({{ round }}/64)</p>
  <div class="flex-box">
    <div
      v-for="d in displays"
      :key="d.name"
      @click="clickHandler(d)"
      class="flex-1"
    >
      <img class="food-img" :src="d.src" />
      <div class="name">{{ d.name }}</div>
    </div>
  </div>
</template>

<script setup>
import { ref, onMounted } from "vue";

const items = [
  {
    name: "가라아게",
    src: "src/img/가라아게.jpg",
  },
  {
    name: "감자칩",
    src: "src/img/감자칩.jpg",
  },
  {
    name: "굴랍자문",
    src: "src/img/굴랍자문.jpg",
  },
  {
    name: "규동",
    src: "src/img/규동.jpg",
  },
  {
    name: "그린커리",
    src: "src/img/그린커리.jpg",
  },
  {
    name: "나시고랭",
    src: "src/img/나시고랭.jpg",
  },
  {
    name: "나폴리피자",
    src: "src/img/나폴리피자.jpg",
  },
  {
    name: "뇨끼",
    src: "src/img/뇨끼.jpg",
  },
  {
    name: "단두부수프",
    src: "src/img/단두부수프.jpg",
  },
  {
    name: "도넛",
    src: "src/img/도넛.jpg",
  },
  {
    name: "돈두르마",
    src: "src/img/돈두르마.jpg",
  },
  {
    name: "돼지바베큐",
    src: "src/img/돼지바베큐.jpg",
  },
  {
    name: "딤섬",
    src: "src/img/딤섬.jpg",
  },
  {
    name: "똠양꿍",
    src: "src/img/똠양꿍.jpg",
  },
  {
    name: "라멘",
    src: "src/img/라멘.jpg",
  },
  {
    name: "라쟈나",
    src: "src/img/라쟈나.jpg",
  },
  {
    name: "락사",
    src: "src/img/락사.jpg",
  },
  {
    name: "랍스터",
    src: "src/img/랍스터.jpg",
  },
  {
    name: "렌당",
    src: "src/img/렌당.jpg",
  },
  {
    name: "마싸만커리",
    src: "src/img/마싸만커리.jpg",
  },
  {
    name: "무사카",
    src: "src/img/무사카.jpg",
  },
  {
    name: "미소라멘",
    src: "src/img/미소라멘.jpg",
  },
  {
    name: "반미",
    src: "src/img/반미.jpg",
  },
  {
    name: "베이징덕",
    src: "src/img/베이징덕.jpg",
  },
  {
    name: "볶음밥",
    src: "src/img/볶음밥.jpg",
  },
  {
    name: "분짜",
    src: "src/img/분짜.jpg",
  },
  {
    name: "불고기",
    src: "src/img/불고기.jpg",
  },
  {
    name: "브라우니",
    src: "src/img/브라우니.jpg",
  },
  {
    name: "비빔밥",
    src: "src/img/비빔밥.jpg",
  },
  {
    name: "빠에야",
    src: "src/img/빠에야.jpg",
  },
  {
    name: "사테꼬치",
    src: "src/img/사테꼬치.jpg",
  },
  {
    name: "소고기쌀국수",
    src: "src/img/소고기쌀국수.jpg",
  },
  {
    name: "스시",
    src: "src/img/스시.jpg",
  },
  {
    name: "쌀국수",
    src: "src/img/쌀국수.jpg",
  },
  {
    name: "쏨땀",
    src: "src/img/쏨땀.jpg",
  },
  {
    name: "아이스크림",
    src: "src/img/아이스크림.jpg",
  },
  {
    name: "알파호레스",
    src: "src/img/알파호레스.jpg",
  },
  {
    name: "에그샌드위치",
    src: "src/img/에그샌드위치.jpg",
  },
  {
    name: "에그타르트",
    src: "src/img/에그타르트.jpg",
  },
  {
    name: "월남쌈",
    src: "src/img/월남쌈.jpg",
  },
  {
    name: "젤라또",
    src: "src/img/젤라또.jpg",
  },
  {
    name: "짜치키",
    src: "src/img/짜치키.jpg",
  },
  {
    name: "초코칩쿠키",
    src: "src/img/초코칩쿠키.jpg",
  },
  {
    name: "초콜릿",
    src: "src/img/초콜릿.jpg",
  },
  {
    name: "춘귄",
    src: "src/img/춘귄.jpg",
  },
  {
    name: "취두부",
    src: "src/img/취두부.jpg",
  },
  {
    name: "치즈버거",
    src: "src/img/치즈버거.jpg",
  },
  {
    name: "치킨라이스",
    src: "src/img/치킨라이스.jpg",
  },
  {
    name: "칠리크랩",
    src: "src/img/칠리크랩.jpg",
  },
  {
    name: "케밥",
    src: "src/img/케밥.jpg",
  },
  {
    name: "코토소파",
    src: "src/img/코토소파.jpg",
  },
  {
    name: "크렘브륄레",
    src: "src/img/크렘브륄레.jpg",
  },
  {
    name: "크로와상",
    src: "src/img/크로와상.jpg",
  },
  {
    name: "크림리소토",
    src: "src/img/크림리소토.jpg",
  },
  {
    name: "클레프티코",
    src: "src/img/클레프티코.jpg",
  },
  {
    name: "키르시토르테",
    src: "src/img/키르시토르테.jpg",
  },
  {
    name: "타코야키",
    src: "src/img/타코야키.jpg",
  },
  {
    name: "파인애플빵",
    src: "src/img/파인애플빵.jpg",
  },
  {
    name: "파히타",
    src: "src/img/파히타.jpg",
  },
  {
    name: "팟타이",
    src: "src/img/팟타이.jpg",
  },
  {
    name: "프라이드치킨",
    src: "src/img/프라이드치킨.jpg",
  },
  {
    name: "피쉬볼",
    src: "src/img/피쉬볼.jpg",
  },
  {
    name: "피쉬앤칩스",
    src: "src/img/피쉬앤칩스.jpg",
  },
  {
    name: "홍콩식프렌치토스트",
    src: "src/img/홍콩식프렌치토스트.jpg",
  },
];

const foods = ref([]);
const displays = ref([]);
const winners = ref([]);
const round = ref(64);
const WorldTitle = ref("세계 음식 월드컵 64강");

onMounted(() => {
  items.sort(() => Math.random() - 0.5);
  foods.value = items;
  displays.value = [items[0], items[1]];
});

const clickHandler = (food) => {
  if (foods.value.length <= 2) {
    if (winners.value.length === 0) {
      displays.value = [food];
      round.value = 1;
      WorldTitle.value = "우승!! " + displays.value[0].name;
    } else {
      const updatedFood = [...winners.value, food];
      foods.value = updatedFood;
      foods.value.sort(() => Math.random() - 0.5);
      displays.value = [updatedFood[0], updatedFood[1]];
      winners.value = [];
      round.value = round.value / 2;
    }
  } else if (foods.value.length > 2) {
    winners.value = [...winners.value, food];
    displays.value = [foods.value[2], foods.value[3]];
    foods.value = foods.value.slice(2);
  }
};
</script>


<style scoped>
.title {
  text-align: center;
  font-size: 70px;
  margin-top: 3%;
}
.flex-box {
  display: flex;
  flex-direction: row;
  align-items: center;
  margin: 5% 10% 5% 10%;
}
.flex-1 {
  flex: 1;
  min-width: 500px;
  overflow: hidden;
  background-color: gray;
  position: relative;
}
.food-img {
  width: 100%;
  height: 100%;
  transition: 0.5s;
  cursor: pointer;
}
.food-img:hover {
  transform: scale(1.1);
  opacity: 0.8;
}
.name {
  position: absolute;
  z-index: 3;
  color: #ffffff;
  bottom: 10%;
  font-size: 55px;
  left: 50%;
  transform: translateX(-50%);
}
</style>
