import { ref, computed } from "vue";
import { defineStore } from "pinia";
import router from "@/router";
import axios from "axios";

const Review_API = `http://localhost:8080/review`;

export const useUserStore = defineStore("user", () => {
  const loginUserId = ref("");
  const userLogin = function (id, password) {
    axios
      .post(`${Review_API}/login`, { id, password })
      .then((response) => {
        console.log(response);

        sessionStorage.setItem("access-token", response.data["access-token"]);

        const token = response.data["access-token"].split(".");
        let id = token[1];
        id = atob(id);
        id = JSON.parse(id);
        console.log(id["id"]);
        loginUserId.value = id["id"];

        router.push({ name: "ReviewList" });
      })
      .catch((error) => {
        // 로그인 실패 시 에러 처리
        console.log(error);
      });
  };

  const SIGN_API = `http://localhost:8080/signup`;

  const signUp = function (UserInfo) {
    axios
      .post(`${SIGN_API}`, UserInfo)
      .then((response) => {
        console.log(response);
        router.push({ name: "Login" });
      })
      .catch((error) => {
        // 회원가입 실패 시 에러 처리
        console.log(error);
      });
  };

  return { userLogin, signUp, loginUserId };
});
