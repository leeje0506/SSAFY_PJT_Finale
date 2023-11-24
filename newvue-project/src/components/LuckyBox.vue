<template>
  <div class="evt_wrap">
    <h2>지금 선택한 이 메뉴. 먹을까?</h2>
  
    <ul class="flower_choice">
      <li
        v-for="(item, index) in items"
        :key="index"
        @click="showPopup(index)"
        :class="{ on: item.on }"
      ></li>
    </ul>
    <div class="popup" v-if="popupVisible">
      <a @click="hidePopup">X</a>
      <p>{{ selectedItem.show }}</p>
    </div>
  </div>
</template>

<script setup>
import { ref } from "vue";

const items = ref([{ show: "꽝" }, { show: "와장창" }, { show: "와와" }]); // 세 개의 아이템
const popupVisible = ref(false); // 팝업의 가시성
const selectedItem = ref(null); // 선택한 아이템

// 팝업을 보여주는 함수
const showPopup = (index) => {
  items.value.forEach((item) => (item.on = false)); // 모든 아이템에서 'on' 제거
  items.value[index].on = true; // 선택된 아이템에 'on' 추가
  selectedItem.value = items.value[index]; // 선택한 아이템 저장
  popupVisible.value = true; // 팝업 보이게 설정
};

// 팝업을 숨기는 함수
const hidePopup = () => {
  items.value.forEach((item) => (item.on = false)); // 모든 아이템에서 'on' 제거
  popupVisible.value = false; // 팝업 숨기게 설정
};
</script>

<style scoped>
* {
  margin: 0;
  padding: 0;
}
ul,
li {
  list-style: none;
}
a {
  text-decoration: none;
}
.evt_wrap {
  position: relative;
  width: 500px;
  height: 300px;
  margin: 20px auto;
  outline: 2px solid red;
}
.evt_wrap h2 {
  font-size: 14px;
  text-align: center;
  padding: 30px;
}

.flower_choice {
  position: absolute;
  top: 100px;
  display: flex;
  justify-content: space-between;
  width: 500px;
  height: 100px;
  margin-top: 100px;
}
.flower_choice > li {
  width: 130px;
  background: gold;
  animation: smbox 1s infinite;
}
@keyframes smbox {
  0% {
    transform: rotate(0deg);
  }
  50% {
    transform: rotate(7deg);
  }
  100% {
    transform: rotate(0deg);
  }
}

.flower_choice li:nth-child(1) {
  background: tomato;
}
.flower_choice li:nth-child(2) {
  background: orange;
}
.flower_choice li:hover {
  animation: none;
}

.flower_choice li.on {
  animation: jump 1.5s 2;
}
@keyframes jump {
  0% {
    transform: translateY(0);
  }
  25% {
    transform: translateY(-20px);
  }
  50% {
    transform: translateY(0);
  }
  75% {
    transform: translateY(-20px);
  }
  100% {
    transform: translateY(0);
  }
}

.popup {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 150px;
  height: 100px;
  background: skyblue;
  position: fixed;
  left: 45%;
  top: 30%;
  transform: translate(-50% -50%);
  z-index: 5000;
}
.popup a {
  display: block;
  padding: 10px;
  background: blue;
  color: #fff;
  margin-bottom: 0;
  text-align: center;
}
</style>