import { createRouter, createWebHistory } from "vue-router";
import HomeView from "../views/HomeView.vue";
import Game from "../components/Game.vue";
import RestaurantList from "../components/restaurant/RestaurantList.vue";
import RestaurantDetail from "../components/restaurant/RestaurantDetail.vue";
import Main from "../components/Main.vue";
import LogIn from "../components/LogIn.vue";
import SignUp from "../components/SignUp.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/",
      name: "main",
      component: Main,
    },

    {
      path: "/signup",
      name: "signup",
      component: SignUp,
    },
    {
      path: "/login",
      name: "login",
      component: LogIn,
    },
    {
      path: "/game",
      name: "game",
      component: Game,
    },

    {
      path: "/restaurant",
      name: "restaurant",
      component: RestaurantList,
    },
    {
      path: "/restaurant/:id",
      name: "restaurantDetail",
      component: RestaurantDetail,
    },
    
    // {
    //   path: "/signup",
    //   name: "signup",
    //   component: SignUp,
    // },
    // {
    //   path: "/login",
    //   name: "login",
    //   component: LogIn,
    // },
  ],
});

export default router;
