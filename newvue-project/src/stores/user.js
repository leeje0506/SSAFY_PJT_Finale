import { ref, computed } from "vue";
import { defineStore } from "pinia";
import router from "@/router";
import axios from "axios";

const error = ref(null);

const Review_API = `http://localhost:8080`;

export const useUserStore = defineStore("user", () => {
  const loginUserId = ref("");
  const userLogin = function (id, password) {
    return axios
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

        router.push({ name: "main" });
      })
      .catch((err) => {
        // 로그인 실패 시 에러 처리
        error.value = err.message;
        console.log(err);
      });
  };

  const SIGN_API = `http://localhost:8080/signup`;

  const signUp = function (UserInfo) {
    return axios
      .post(`${SIGN_API}`, UserInfo)
      .then((response) => {
        console.log(response);
        router.push({ name: "main" });
      })
      .catch((err) => {
        // 로그인 실패 시 에러 처리
        error.value = err.message;
        console.log(err);
      });
  };

  // return { userLogin, signUp, loginUserId, error };
  return { userLogin, signUp, loginUserId, error };
});
