import { createRouter, createWebHistory } from "vue-router";
import HomeView from "../views/HomeView.vue";
import CalendarView from "../views/CalendarView.vue";
import LoginView from "../views/LoginView.vue";
import Regist from "../components/Regist.vue";
import SignIn from "../components/SignIn.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/",
      name: "login",
      component: LoginView,
    },
    {
      path: "/calendar",
      name: "calendar",
      component: CalendarView,
    },
    {
      path: "/home",
      name: "home",
      component: HomeView,
    },
    {
      path: "/regist",
      name: "regist",
      component: Regist,
    },
    {
      path: "/signin",
      name: "signin",
      component: SignIn,
    },
  ],
});

export default router;
