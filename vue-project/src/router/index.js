import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import AboutView from '../views/AboutView.vue'
import WorldCupView from '../views/WorldCupView.vue'


const router = createRouter({


  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/about',
      name: 'about',
      component: AboutView
    },{
      path: '/gmae',
      name: 'game',
      component: WorldCupView
    }
  ]
})

export default router
