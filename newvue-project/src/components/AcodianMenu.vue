<template>
  <!--
    Heads up! 👋
  
    Plugins:
      - @tailwindcss/forms
  -->
  <div class="flex gap-8">
    <div class="relative">
      <details class="group [&_summary::-webkit-details-marker]:hidden">
        <summary
          class="flex cursor-pointer items-center gap-2 border-b border-gray-400 pb-1 text-gray-900 transition hover:border-gray-600"
        >
          <span class="text-sm font-medium"> 대분류 </span>

          <span class="transition group-open:-rotate-180">
            <svg
              xmlns="http://www.w3.org/2000/svg"
              fill="none"
              viewBox="0 0 24 24"
              stroke-width="1.5"
              stroke="currentColor"
              class="h-4 w-4"
            >
              <path
                stroke-linecap="round"
                stroke-linejoin="round"
                d="M19.5 8.25l-7.5 7.5-7.5-7.5"
              />
            </svg>
          </span>
        </summary>

        <div
          class="z-50 group-open:absolute group-open:start-0 group-open:top-auto group-open:mt-2"
        >
          <div class="w-96 rounded border border-gray-200 bg-white">
            <header class="flex items-center justify-between p-4">
              <!-- 여기에 클릭 이벤트 줘야할 거 같은디! 리셋 -->
              <button
                type="button"
                class="text-sm text-gray-900 underline underline-offset-4"
              >
                Reset
              </button>
            </header>

            <ul class="space-y-1 border-t border-gray-200 p-4">
              <li>
                <label
                  for="FilterInStock"
                  class="inline-flex items-center gap-2"
                >
                  <input
                    type="checkbox"
                    id="FilterInStock"
                    class="h-5 w-5 rounded border-gray-300"
                  />

                  <span class="text-sm font-medium text-gray-700">
                    여기에 선택 항목이 들어가야 하는데..
                  </span>
                </label>
              </li>

              <li>
                <label
                  for="FilterPreOrder"
                  class="inline-flex items-center gap-2"
                >
                  <input
                    type="checkbox"
                    id="FilterPreOrder"
                    class="h-5 w-5 rounded border-gray-300"
                  />

                  <span class="text-sm font-medium text-gray-700">
                    문제는 눌렀을 때 값을
                  </span>
                </label>
              </li>

              <li>
                <label
                  for="FilterOutOfStock"
                  class="inline-flex items-center gap-2"
                >
                  <input
                    type="checkbox"
                    id="FilterOutOfStock"
                    class="h-5 w-5 rounded border-gray-300"
                  />

                  <span class="text-sm font-medium text-gray-700">
                    어떻게 들어가게 할 건가.
                  </span>
                </label>
              </li>
            </ul>
          </div>
        </div>
      </details>
    </div>
  </div>
</template>

<script setup></script>

<style scoped></style>
