<template>
    
  <div class = "Sign">
    <!-- 얘가 메인 -->
    <!-- 얘가 성공하면 /home으로 가야함 -->
    <RouterLink to="/signin">로그인</RouterLink> 
    <RouterLink to="/regist">회원가입</RouterLink>
   
  </div>

</template>

<script setup>

import { RouterLink } from "vue-router";
</script>

<style scoped>

.Sign{
    display: inline-block;
    font-size: large;
}

</style>
