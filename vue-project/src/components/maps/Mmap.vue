<template>
    <div>
      <div id="map"></div>
    </div>
  </template>
  
  <script setup>
  import { useResStore } from "@/stores/restaurant";
  import { onMounted, ref, toRaw } from 'vue';
  
  const store = useResStore()
  // store.GetRes(store.Res.Res_Id)
  

  let map = null;
  const initMap = function () {
    let myCenter = new kakao.maps.LatLng(store.Res.res_Lati, store.Res.res_Longi); // store에서 restaurant의 위도 경도 가져 오기
    
    if (navigator.geolocation) {
    navigator.geolocation.getCurrentPosition((position) => {
      const lat = store.Res.res_Lati;
      const lon = store.Res.res_Longi;
      myCenter = new kakao.maps.LatLng(lat, lon);
      
      new kakao.maps.Marker({
        map,
        position: myCenter,
      });
      map.setCenter(myCenter);
    
    });
  }

      
   


    const container = document.getElementById('map');
    const options = {
      center: myCenter,
      // marker: myCenter,
      level: 3,
    }; 

    map = new kakao.maps.Map(container, options);
    // 줌 컨트롤 생성
    const zoomControl = new kakao.maps.ZoomControl();
    map.addControl(zoomControl, kakao.maps.ControlPosition.RIGHT);
  };
  
  onMounted(  () => {

    if (window.kakao && window.kakao.maps) {
      initMap();
    } else {
      const script = document.createElement('script'); 
      script.src = `//dapi.kakao.com/v2/maps/sdk.js?autoload=false&appkey=${
        import.meta.env.VITE_KAKAO_API_KEY             // env.local에 들어 있는 api key 변경해야한다~~
      }`;
      script.addEventListener('load', () => {
        kakao.maps.load(initMap);
      }); 
      document.head.appendChild(script);
    }
  });

  </script>
  
  <style scoped>
  #map {
    width: 500px;
    height: 400px;
  }
  </style>
  