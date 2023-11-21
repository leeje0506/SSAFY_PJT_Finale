import { ref, computed } from 'vue'
import { defineStore } from 'pinia'
import router from '@/router'
import axios from 'axios'

const Res_API = `http://localhost:8080/api/restaurant`

export const useResStore = defineStore('Res', () => {
    const ResList = ref([])

    const GetResList = function () {
        axios.get(Res_API)
          .then((response) => {
          ResList.value = response.data
          })
      }
    

    const Res = ref({})
    const GetRes = function (id) {
      axios.get(`${Res_API}/${id}`)
        .then((response) => {
        Res.value = response.data
      })
    }

    const SearchResList = function (OptionInfo) {
        axios.get(Res_API, {
          params: OptionInfo
        })
          .then((response) => {
            ResList.value = response.data
        })
      }
    
      return { ResList, GetResList, Res ,  GetRes , SearchResList }
    })