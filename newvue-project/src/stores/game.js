import { ref, computed } from "vue";
import { defineStore } from "pinia";
import router from "@/router";
import axios from "axios";

// const Game_API = `http://localhost:8080/api/game`;

export const useGameStore = defineStore("Game", () => {
  const game = ref([]);

  //   const Game = ref({});
  //   const GetGame = function () {
  //     axios.get(`${Game_API}`);
  //   };

  return { game };
});
