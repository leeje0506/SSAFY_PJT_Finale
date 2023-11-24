<template>
  <div id="btnWrap">
    <button type="button" id="popupBtn" @click="openModal">
      지금 고른 이 메뉴가 고민된다면? 
    </button>
  </div>

  <div id="modalWrap" v-show="isModalOpen">
    <div id="modalContent">
      <div id="modalBody">
        <span id="closeBtn" @click="closeModal">&times;</span>
        <slot>
          <ModalPopup>
            <LuckyBox />
          </ModalPopup>
        </slot>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref } from "vue";
import LuckyBox from "./LuckyBox.vue";
const isModalOpen = ref(false);
const openModal = () => {
  isModalOpen.value = true;
};
const closeModal = () => {
  isModalOpen.value = false;
};
</script>

<style scoped>
* {
  padding: 0;
  margin: 0;
  box-sizing: border-box;
}

#btnWrap {
  width: 500px;
  margin: 100px auto;
}

#popupBtn {
  width: 150px;
  height: 50px;
  padding: 10px 5px;
}

#modalWrap {
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  padding-top: 100px; /* Location of the box */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgba(0, 0, 0, 0.4); /* Black w/ opacity */
}

#modalBody {
  width: 600px;
  height: 400px;
  padding: 30px 30px;
  margin: 0 auto;
  border: 1px solid #777;
  background-color: #fff;
}

#closeBtn {
  float: right;
  font-weight: bold;
  color: #777;
  font-size: 25px;
  cursor: pointer;
}
</style>
