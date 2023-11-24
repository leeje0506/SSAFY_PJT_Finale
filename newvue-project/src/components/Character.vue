<template>
  <div
    class="flex items-center me-4"
    v-for="(item, index) in items"
    :key="index"
  >

  <!-- 하,.,왜 체크 표시가 안되냐 머가 문제임...? -->
    <!-- 체크박스 -->
    <input
      :id="'checkbox' + index"
      type="checkbox"
      :value="index"
      v-model="selected"
      @change="handleChange(index)"
      class="w-4 h-4 text-yellow-400 bg-gray-100 border-gray-300 rounded focus:ring-yellow-500 dark:focus:ring-yellow-600 dark:ring-offset-gray-800 focus:ring-2 dark:bg-gray-700 dark:border-gray-600"
    />
    <label
      :for="'checkbox' + index"
      class="ms-2 w-10 h-15 text-sm font-medium text-gray-900 dark:text-gray-300"
    >
      <img :src="item.image" alt="Yellow" />
    </label>
  </div>
</template>

<script setup>
import { ref } from "vue";

// 체크박스 항목들
const items = ref([
  { image: "src/chaImage/쿠로미.png" },
  { image: "src/chaImage/시나모롤.png" },
  { image: "src/chaImage/케로피.png" },
  { image: "src/chaImage/턱시도샘.png" },
  { image: "src/chaImage/포차코.png" },
  { image: "src/chaImage/폼폼푸린.png" },
  { image: "src/chaImage/헬로키티.png" },
]);

// 선택된 체크박스의 인덱스
const selected = ref([]);

// 체크박스 선택 상태 변경 시 호출되는 함수
const handleChange = (index) => {
  if (selected.value.includes(index)) {
    selected.value = selected.value.filter((i) => i !== index);
  } else {
    selected.value = [index];
  }
};
</script>
