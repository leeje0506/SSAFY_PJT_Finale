import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import AboutView from '../views/AboutView.vue'
import WorldCupView from '../views/WorldCupView.vue'
import RestaurantList from '@/components/restaurant/restaurantList.vue'
import RestaurantDetail from '@/components/restaurant/restaurantDetail.vue'


const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/gmae',
      name: 'game',
      component: WorldCupView
    },
    {
      path: '/restaurant',
      name: 'restaurant',
      component: RestaurantList
    },
    {
      path: '/restaurant/:id',
      name: 'restaurantDetail',
      component: RestaurantDetail
    }
  ]
})

export default router
