<template>
  <div class="searchMenu flex space-x-2">
    <!-- !!!!!!!!!!!!!!!!!!!! 음식 !!!!!!!!!!!!!!!!!!!!!!!!! -->
    <Listbox class="w-50" as="div" v-model="OptionInfo.food">
      <!-- <ListboxLabel class="block text-sm font-medium leading-6 text-gray-900"
                >Assigned to</ListboxLabel
              > -->
      <div class="relative mt-2">
        <ListboxButton
          class="relative w-50 cursor-default rounded-md bg-white py-1.5 pl-3 pr-10 text-left text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:outline-none focus:ring-2 focus:ring-indigo-500 sm:text-sm sm:leading-6"
        >
          <span class="flex items-center">
            <!-- <img
                      :src="selected.avatar"
                      alt=""
                      class="h-5 w-5 flex-shrink-0 rounded-full"
                    /> -->
            <span class="ml-3 block truncate">{{ OptionInfo.food }}</span>
          </span>
          <span
            class="pointer-events-none absolute inset-y-0 right-0 ml-3 flex items-center pr-2"
          >
            <ChevronUpDownIcon
              class="h-5 w-5 text-gray-400"
              aria-hidden="true"
            />
          </span>
        </ListboxButton>

        <transition
          leave-active-class="transition ease-in duration-100"
          leave-from-class="opacity-100"
          leave-to-class="opacity-0"
        >
          <!-- 여기서 w-full 해버리면 선택 옵션에 따라 박스가 움직여버림. 정확히 정해줘. -->
          <ListboxOptions
            class="absolute z-10 mt-1 max-h-56 w-50 overflow-auto rounded-md bg-white py-1 text-base shadow-lg ring-1 ring-black ring-opacity-5 focus:outline-none sm:text-sm"
          >
            <ListboxOption
              as="template"
              v-for="food in Food"
              :key="food.name"
              :value="food.name"
              v-slot="{ active, OptionInfo }"
            >
              <li
                :class="[
                  active ? 'bg-indigo-600 text-white' : 'text-gray-900',
                  'relative cursor-default select-none py-2 pl-3 pr-9',
                ]"
              >
                <div class="flex items-center">
                  <!-- <img
                            :src="person.avatar"
                            alt=""
                            class="h-5 w-5 flex-shrink-0 rounded-full"
                          /> -->
                  <span
                    :class="[
                      OptionInfo ? 'font-semibold' : 'font-normal',
                      'ml-3 block truncate',
                    ]"
                    >{{ food.name }}</span
                  >
                </div>

                <span
                  v-if="OptionInfo"
                  :class="[
                    active ? 'text-white' : 'text-indigo-600',
                    'absolute inset-y-0 right-0 flex items-center pr-4',
                  ]"
                >
                  <CheckIcon class="h-5 w-5" aria-hidden="true" />
                </span>
              </li>
            </ListboxOption>
          </ListboxOptions>
        </transition>
      </div>
    </Listbox>

    <!-- !!!!!!!!!!!!!!!!!!!! 주소 주소 주소 주소 주소 주소 !!!!!!!!!!!!!!!!!!!!!-->
    <Listbox class="w-50" as="div" v-model="OptionInfo.address">
      <!-- <ListboxLabel class="block text-sm font-medium leading-6 text-gray-900"
                >Assigned to</ListboxLabel
              > -->
      <div class="relative mt-2">
        <ListboxButton
          class="relative w-50 cursor-default rounded-md bg-white py-1.5 pl-3 pr-10 text-left text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:outline-none focus:ring-2 focus:ring-indigo-500 sm:text-sm sm:leading-6"
        >
          <span class="flex items-center">
            <!-- <img
                      :src="selected.avatar"
                      alt=""
                      class="h-5 w-5 flex-shrink-0 rounded-full"
                    /> -->
            <span class="ml-3 block truncate">{{ OptionInfo.address }}</span>
          </span>
          <span
            class="pointer-events-none absolute inset-y-0 right-0 ml-3 flex items-center pr-2"
          >
            <ChevronUpDownIcon
              class="h-5 w-5 text-gray-400"
              aria-hidden="true"
            />
          </span>
        </ListboxButton>

        <transition
          leave-active-class="transition ease-in duration-100"
          leave-from-class="opacity-100"
          leave-to-class="opacity-0"
        >
          <!-- 여기서 w-full 해버리면 선택 옵션에 따라 박스가 움직여버림. 정확히 정해줘. -->
          <ListboxOptions
            class="absolute z-10 mt-1 max-h-56 w-50 overflow-auto rounded-md bg-white py-1 text-base shadow-lg ring-1 ring-black ring-opacity-5 focus:outline-none sm:text-sm"
          >
            <ListboxOption
              as="template"
              v-for="address in Address"
              :key="address.name"
              :value="address.name"
              v-slot="{ active, OptionInfo }"
            >
              <li
                :class="[
                  active ? 'bg-indigo-600 text-white' : 'text-gray-900',
                  'relative cursor-default select-none py-2 pl-3 pr-9',
                ]"
              >
                <div class="flex items-center">
                  <!-- <img
                            :src="person.avatar"
                            alt=""
                            class="h-5 w-5 flex-shrink-0 rounded-full"
                          /> -->
                  <span
                    :class="[
                      OptionInfo ? 'font-semibold' : 'font-normal',
                      'ml-3 block truncate',
                    ]"
                    >{{ address.name }}</span
                  >
                </div>

                <span
                  v-if="OptionInfo"
                  :class="[
                    active ? 'text-white' : 'text-indigo-600',
                    'absolute inset-y-0 right-0 flex items-center pr-4',
                  ]"
                >
                  <CheckIcon class="h-5 w-5" aria-hidden="true" />
                </span>
              </li>
            </ListboxOption>
          </ListboxOptions>
        </transition>
      </div>
    </Listbox>

    <!-- !!!!!!!!!!!!!!!!!!! option1 !!!!!!!!!!!!!!! -->
    <Listbox class="w-50" as="div" v-model="OptionInfo.option1">
      <!-- <ListboxLabel class="block text-sm font-medium leading-6 text-gray-900"
            >Assigned to</ListboxLabel
          > -->
      <div class="relative mt-2">
        <ListboxButton
          class="relative w-50 cursor-default rounded-md bg-white py-1.5 pl-3 pr-10 text-left text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:outline-none focus:ring-2 focus:ring-indigo-500 sm:text-sm sm:leading-6"
        >
          <span class="flex items-center">
            <!-- <img
                  :src="selected.avatar"
                  alt=""
                  class="h-5 w-5 flex-shrink-0 rounded-full"
                /> -->
            <span class="ml-3 block truncate">{{ OptionInfo.option1 }}</span>
          </span>
          <span
            class="pointer-events-none absolute inset-y-0 right-0 ml-3 flex items-center pr-2"
          >
            <ChevronUpDownIcon
              class="h-5 w-5 text-gray-400"
              aria-hidden="true"
            />
          </span>
        </ListboxButton>

        <transition
          leave-active-class="transition ease-in duration-100"
          leave-from-class="opacity-100"
          leave-to-class="opacity-0"
        >
          <ListboxOptions
            class="absolute z-10 mt-1 max-h-56 w-50 overflow-auto rounded-md bg-white py-1 text-base shadow-lg ring-1 ring-black ring-opacity-5 focus:outline-none sm:text-sm"
          >
            <ListboxOption
              as="template"
              v-for="option1 in Option1"
              :key="option1.name"
              :value="option1.name"
              v-slot="{ active, OptionInfo }"
            >
              <li
                :class="[
                  active ? 'bg-indigo-600 text-white' : 'text-gray-900',
                  'relative cursor-default select-none py-2 pl-3 pr-9',
                ]"
              >
                <div class="flex items-center">
                  <!-- <img
                        :src="person.avatar"
                        alt=""
                        class="h-5 w-5 flex-shrink-0 rounded-full"
                      /> -->
                  <span
                    :class="[
                      OptionInfo ? 'font-semibold' : 'font-normal',
                      'ml-3 block truncate',
                    ]"
                    >{{ option1.name }}</span
                  >
                </div>

                <span
                  v-if="OptionInfo"
                  :class="[
                    active ? 'text-white' : 'text-indigo-600',
                    'absolute inset-y-0 right-0 flex items-center pr-4',
                  ]"
                >
                  <CheckIcon class="h-5 w-5" aria-hidden="true" />
                </span>
              </li>
            </ListboxOption>
          </ListboxOptions>
        </transition>
      </div>
    </Listbox>

    <!-- !!!!!!!!!!!!!!!!!!! option2 !!!!!!!!!!!!!!!!!!! -->
    <Listbox class="w-50" as="div" v-model="OptionInfo.option2">
      <!-- <ListboxLabel class="block text-sm font-medium leading-6 text-gray-900"
            >Assigned to</ListboxLabel
          > -->
      <div class="relative mt-2">
        <ListboxButton
          class="relative w-50 cursor-default rounded-md bg-white py-1.5 pl-3 pr-10 text-left text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:outline-none focus:ring-2 focus:ring-indigo-500 sm:text-sm sm:leading-6"
        >
          <span class="flex items-center">
            <!-- <img
                  :src="selected.avatar"
                  alt=""
                  class="h-5 w-5 flex-shrink-0 rounded-full"
                /> -->
            <span class="ml-3 block truncate">{{ OptionInfo.option2 }}</span>
          </span>
          <span
            class="pointer-events-none absolute inset-y-0 right-0 ml-3 flex items-center pr-2"
          >
            <ChevronUpDownIcon
              class="h-5 w-5 text-gray-400"
              aria-hidden="true"
            />
          </span>
        </ListboxButton>

        <transition
          leave-active-class="transition ease-in duration-100"
          leave-from-class="opacity-100"
          leave-to-class="opacity-0"
        >
          <ListboxOptions
            class="absolute z-10 mt-1 max-h-56 w-50 overflow-auto rounded-md bg-white py-1 text-base shadow-lg ring-1 ring-black ring-opacity-5 focus:outline-none sm:text-sm"
          >
            <ListboxOption
              as="template"
              v-for="option2 in Option2"
              :key="option2.name"
              :value="option2.name"
              v-slot="{ active, OptionInfo }"
            >
              <li
                :class="[
                  active ? 'bg-indigo-600 text-white' : 'text-gray-900',
                  'relative cursor-default select-none py-2 pl-3 pr-9',
                ]"
              >
                <div class="flex items-center">
                  <!-- <img
                        :src="person.avatar"
                        alt=""
                        class="h-5 w-5 flex-shrink-0 rounded-full"
                      /> -->
                  <span
                    :class="[
                      OptionInfo ? 'font-semibold' : 'font-normal',
                      'ml-3 block truncate',
                    ]"
                    >{{ option2.name }}</span
                  >
                </div>

                <span
                  v-if="OptionInfo"
                  :class="[
                    active ? 'text-white' : 'text-indigo-600',
                    'absolute inset-y-0 right-0 flex items-center pr-4',
                  ]"
                >
                  <CheckIcon class="h-5 w-5" aria-hidden="true" />
                </span>
              </li>
            </ListboxOption>
          </ListboxOptions>
        </transition>
      </div>
    </Listbox>

    <button
      @click="searchResList"
      class="relative mt-2 w-50 cursor-default rounded-md bg-gray-600 pl-3 pr-3 text-center text-white shadow-sm ring-1 ring-inset ring-gray-700 focus:outline-none focus:ring-2 focus:ring-darkbrown sm:text-sm sm:leading-6"
    >
      음식점 찾기
    </button>
  </div>
</template>

<script setup>
import { ref } from "vue";
import {
  Listbox,
  ListboxButton,
  ListboxLabel,
  ListboxOption,
  ListboxOptions,
} from "@headlessui/vue";
import { CheckIcon, ChevronUpDownIcon } from "@heroicons/vue/20/solid";
import { useResStore } from "@/stores/restaurant";

const store = useResStore();
// //  버튼 이름이 이거. (검색하면 정보 넘겨줘.)
const searchResList = function () {
  store.searchResList(OptionInfo.value);
};

const OptionInfo = ref({
  food: "유럽음식",
  address: "서울특별시",
  option1: "무료주차",
  option2: "채식메뉴",
});

const Food = [
  { name: "지중해음식" },
  { name: "중앙아시아음식" },
  { name: "인도아시아음식" },
  { name: "유럽음식" },
  { name: "동아시아음식" },
  { name: "동남아시아음식" },
  { name: "남미음식" },
  { name: "북미음식" },
  { name: "아시아음식" },
  { name: "오세아니아음식" },
  { name: "카리브해음식" },
  { name: "중동음식" },
];

const Address = [
  { name: "강원도" },
  { name: "경기도" },
  { name: "경상북도" },
  { name: "경상남도" },
  { name: "전라북도" },
  { name: "전라남도" },
  { name: "충청북도" },
  { name: "충정남도" },
  { name: "제주특별자치도" },
  { name: "서울특별시" },
  { name: "대전광역시" },
  { name: "대구광역시" },
  { name: "인천광역시" },
  { name: "부산광역시" },
  { name: "울산광역시" },
  { name: "광주광역시" },
  { name: "세종특별자치시" },
  //시간 남으면 시 추가
];

const Option1 = [
  { name: "무료주차" },
  { name: "유아의자" },
  { name: "휠체어 대여" },
  { name: "반려동물" },
];

const Option2 = [
  { name: "채식메뉴" },
  { name: "할랄메뉴" },
  { name: "글루텐프리메뉴" },
];

//제일 처음 띄워놓는 거 말하는 듯.
// const SelectFood = ref(OptionInfo.food.n);
// const SelectAddress = ref(Address[]);
// const SelectOptions = ref(Options[]);
</script>

<style scoped></style>
