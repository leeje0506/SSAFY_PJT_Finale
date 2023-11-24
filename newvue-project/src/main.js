import "./assets/main.css";

import { createApp } from "vue";
import { createPinia } from "pinia";

import App from "./App.vue";
import router from "./router";
import "./styles/app.css"; // Here

const app = createApp(App);

app.use(createPinia());
app.use(router);

app.mount("#app");

// import Vue from 'vue'
// import VueTailwind from 'vue-tailwind'

// import TInput from 'vue-tailwind/dist/t-input';
// import TSelect from 'vue-tailwind/dist/t-select';
// import TCheckbox from 'vue-tailwind/dist/t-checkbox';
// import TButton from 'vue-tailwind/dist/t-button';
// import TInputGroup from 'vue-tailwind/dist/t-input-group';
// import TRichSelect from 'vue-tailwind/dist/t-rich-select';
// import TToggle from 'vue-tailwind/dist/t-toggle';
// import TAlert from 'vue-tailwind/dist/t-alert';
// import TDialog from 'vue-tailwind/dist/t-dialog';
// import TPagination from 'vue-tailwind/dist/t-pagination';
// import TDropdown from 'vue-tailwind/dist/t-dropdown';

// const settings = {
//   't-input': {
//     component: TInput,
//     props: {
//       fixedClasses: 'block w-full px-3 py-2 transition duration-100 ease-in-out border rounded shadow-sm focus:ring-2 focus:ring-blue-500 focus:outline-none focus:ring-opacity-50 disabled:opacity-50 disabled:cursor-not-allowed',
//       classes: 'text-black placeholder-gray-400 bg-white border-gray-300 focus:border-blue-500 ',
//       variants: {}
//     }
//   },
//   't-select': {
//     component: TSelect,
//     props: {
//       fixedClasses: 'block w-full pl-3 pr-10 py-2 transition duration-100 ease-in-out border rounded shadow-sm focus:ring-2 focus:ring-blue-500 focus:outline-none focus:ring-opacity-50 disabled:opacity-50 disabled:cursor-not-allowed',
//       classes: 'text-black placeholder-gray-400 bg-white border-gray-300 focus:border-blue-500 ',
//       variants: {
//         danger: 'border-red-300 bg-red-50 placeholder-red-200 text-red-900',
//         success: 'border-green-300 bg-green-50 placeholder-gray-400 text-green-900'
//       }
//     }
//   },
//   't-checkbox': {
//     component: TCheckbox,
//     props: {
//       fixedClasses: 'transition duration-100 ease-in-out rounded shadow-sm focus:border-blue-500 focus:ring-2 focus:ring-blue-500 focus:outline-none focus:ring-opacity-50 focus:ring-offset-0 disabled:opacity-50 disabled:cursor-not-allowed',
//       classes: 'text-blue-500 border-gray-300 ',
//       variants: {
//         error: 'text-red-500 border-red-300',
//         success: 'text-green-500 border-green-300'
//       }
//     }
//   },
//   't-button': {
//     component: TButton,
//     props: {
//       fixedClasses: 'block px-4 py-2 transition duration-100 ease-in-out focus:border-blue-500 focus:ring-2 focus:ring-blue-500 focus:outline-none focus:ring-opacity-50 disabled:opacity-50 disabled:cursor-not-allowed',
//       classes: 'text-white bg-blue-500 border border-transparent shadow-sm rounded hover:bg-blue-600',
//       variants: {
//         secondary: 'text-gray-800 bg-white border border-gray-300 shadow-sm hover:text-gray-600',
//         error: 'text-white bg-red-500 border border-transparent rounded shadow-sm hover:bg-red-600',
//         success: 'text-white bg-green-500 border border-transparent rounded shadow-sm hover:bg-green-600',
//         link: 'text-blue-500 underline hover:text-blue-600'
//       }
//     }
//   },
//   't-input-group': {
//     component: TInputGroup,
//     props: {
//       fixedClasses: {
//         wrapper: '',
//         label: 'block',
//         body: '',
//         feedback: ' text-sm text-sm',
//         description: 'text-gray-400 text-sm'
//       },
//       classes: {
//         wrapper: '',
//         label: '',
//         body: '',
//         feedback: 'text-gray-400',
//         description: 'text-gray-400'
//       },
//       variants: {
//         danger: {
//           label: 'text-red-500',
//           feedback: 'text-red-500'
//         },
//         success: {
//           label: 'text-green-500',
//           feedback: 'text-green-500'
//         }
//       }
//     }
//   },
//   't-rich-select': {
//     component: TRichSelect,
//     props: {
//       fixedClasses: {
//         wrapper: 'relative',
//         buttonWrapper: 'inline-block relative w-full',
//         selectButton: 'w-full flex text-left justify-between items-center px-3 py-2 text-black transition duration-100 ease-in-out border rounded shadow-sm focus:border-blue-500 focus:ring-2 focus:ring-blue-500 focus:outline-none focus:ring-opacity-50 disabled:opacity-50 disabled:cursor-not-allowed',
//         selectButtonLabel: 'block truncate',
//         selectButtonPlaceholder: 'block truncate',
//         selectButtonIcon: 'fill-current flex-shrink-0 ml-1 h-4 w-4',
//         selectButtonClearButton: 'rounded flex flex-shrink-0 items-center justify-center absolute right-0 top-0 m-2 h-6 w-6 transition duration-100 ease-in-out',
//         selectButtonClearIcon: 'fill-current h-3 w-3',
//         dropdown: 'absolute w-full z-10 -mt-1 absolute border-b border-l border-r rounded-b shadow-sm z-10',
//         dropdownFeedback: '',
//         loadingMoreResults: '',
//         optionsList: 'overflow-auto',
//         searchWrapper: 'inline-block w-full',
//         searchBox: 'inline-block w-full',
//         optgroup: '',
//         option: 'cursor-pointer',
//         disabledOption: 'opacity-50 cursor-not-allowed',
//         highlightedOption: 'cursor-pointer',
//         selectedOption: 'cursor-pointer',
//         selectedHighlightedOption: 'cursor-pointer',
//         optionContent: '',
//         optionLabel: 'truncate block',
//         selectedIcon: 'fill-current h-4 w-4',
//         enterClass: '',
//         enterActiveClass: '',
//         enterToClass: '',
//         leaveClass: '',
//         leaveActiveClass: '',
//         leaveToClass: ''
//       },
//       classes: {
//         wrapper: '',
//         buttonWrapper: '',
//         selectButton: 'bg-white border-gray-300',
//         selectButtonLabel: '',
//         selectButtonPlaceholder: 'text-gray-400',
//         selectButtonIcon: 'text-gray-600',
//         selectButtonClearButton: 'hover:bg-blue-100 text-gray-600',
//         selectButtonClearIcon: '',
//         dropdown: 'bg-white border-gray-300',
//         dropdownFeedback: 'pb-2 px-3 text-gray-400 text-sm',
//         loadingMoreResults: 'pb-2 px-3 text-gray-400 text-sm',
//         optionsList: '',
//         searchWrapper: 'p-2 placeholder-gray-400',
//         searchBox: 'px-3 py-2 bg-gray-50 text-sm rounded border focus:outline-none focus:shadow-outline border-gray-300',
//         optgroup: 'text-gray-400 uppercase text-xs py-1 px-2 font-semibold',
//         option: '',
//         disabledOption: '',
//         highlightedOption: 'bg-blue-100',
//         selectedOption: 'font-semibold bg-gray-100 bg-blue-500 font-semibold text-white',
//         selectedHighlightedOption: 'font-semibold bg-gray-100 bg-blue-600 font-semibold text-white',
//         optionContent: 'flex justify-between items-center px-3 py-2',
//         optionLabel: '',
//         selectedIcon: '',
//         enterClass: 'opacity-0',
//         enterActiveClass: 'transition ease-out duration-100',
//         enterToClass: 'opacity-100',
//         leaveClass: 'opacity-100',
//         leaveActiveClass: 'transition ease-in duration-75',
//         leaveToClass: 'opacity-0'
//       },
//       variants: {
//         danger: {
//           selectButton: 'border-red-300 bg-red-50 text-red-900',
//           selectButtonPlaceholder: 'text-red-200',
//           selectButtonIcon: 'text-red-500',
//           selectButtonClearButton: 'hover:bg-red-200 text-red-500',
//           dropdown: 'bg-red-50 border-red-300'
//         },
//         success: {
//           selectButton: 'border-green-300 bg-green-50 text-green-900',
//           selectButtonIcon: 'text-green-500',
//           selectButtonClearButton: 'hover:bg-green-200 text-green-500',
//           dropdown: 'bg-green-50 border-green-300'
//         }
//       }
//     }
//   },
//   't-toggle': {
//     component: TToggle,
//     props: {
//       fixedClasses: {
//         wrapper: 'relative inline-flex flex-shrink-0 cursor-pointer transition-colors ease-in-out duration-200',
//         wrapperChecked: 'relative inline-flex flex-shrink-0 cursor-pointer transition-colors ease-in-out duration-200  border-2 border-transparent focus:ring-2 focus:ring-blue-500 focus:outline-none focus:ring-opacity-50',
//         wrapperDisabled: 'relative inline-flex flex-shrink-0 cursor-pointer transition-colors ease-in-out duration-200 opacity-50 cursor-not-allowed',
//         wrapperCheckedDisabled: 'relative inline-flex flex-shrink-0 cursor-pointer transition-colors ease-in-out duration-200 opacity-50 cursor-not-allowed border-2 border-transparent focus:ring-2 focus:ring-blue-500 focus:outline-none focus:ring-opacity-50',
//         button: 'inline-block absolute transform translate-x-0 transition ease-in-out duration-200',
//         buttonChecked: 'inline-block absolute transform translate-x-full transition ease-in-out duration-200',
//         checkedPlaceholder: 'inline-block',
//         uncheckedPlaceholder: 'inline-block'
//       },
//       classes: {
//         wrapper: 'bg-gray-100 rounded-full border-2 border-transparent focus:ring-2 focus:ring-blue-500 focus:outline-none focus:ring-opacity-50',
//         wrapperChecked: 'bg-blue-500 rounded-full',
//         wrapperDisabled: 'bg-gray-100 rounded-full border-2 border-transparent focus:ring-2 focus:ring-blue-500 focus:outline-none focus:ring-opacity-50',
//         wrapperCheckedDisabled: 'bg-blue-500',
//         button: 'h-5 w-5 rounded-full bg-white shadow flex items-center justify-center text-gray-400 text-xs',
//         buttonChecked: 'h-5 w-5 rounded-full bg-white shadow flex items-center justify-center text-blue-500 text-xs',
//         checkedPlaceholder: 'rounded-full w-5 h-5 flex items-center justify-center text-gray-400 text-xs',
//         uncheckedPlaceholder: 'rounded-full w-5 h-5 flex items-center justify-center text-gray-400 text-xs'
//       },
//       variants: {
//         danger: {
//           wrapperChecked: 'bg-red-500 rounded-full',
//           wrapperCheckedDisabled: 'bg-red-500 rounded-full'
//         },
//         success: {
//           wrapperChecked: 'bg-green-500 rounded-full',
//           wrapperCheckedDisabled: 'bg-green-500 rounded-full'
//         },
//         box: {
//           wrapper: 'bg-gray-100 rounded-sm border-2 border-transparent focus:ring-2 focus:ring-blue-500 focus:outline-none focus:ring-opacity-50',
//           wrapperChecked: 'bg-blue-500 rounded-sm',
//           wrapperCheckedDisabled: 'bg-blue-500 rounded-sm',
//           button: 'h-6 w-6 rounded-sm bg-white shadow flex items-center justify-center text-gray-400 text-xs',
//           buttonChecked: 'h-6 w-6 rounded-sm  bg-white shadow flex items-center justify-center text-blue-500 text-xs',
//           checkedPlaceholder: 'rounded-sm w-6 h-6 flex items-center justify-center text-gray-400 text-xs',
//           uncheckedPlaceholder: 'rounded-sm w-6 h-6 flex items-center justify-center text-gray-400 text-xs'
//         }
//       }
//     }
//   },
//   't-alert': {
//     component: TAlert,
//     props: {
//       fixedClasses: {
//         wrapper: 'relative flex items-center p-4 border-l-4  rounded shadow-sm',
//         body: 'flex-grow',
//         close: 'absolute relative flex items-center justify-center ml-4 flex-shrink-0 w-6 h-6 transition duration-100 ease-in-out rounded  focus:ring-2 focus:ring-blue-500 focus:outline-none focus:ring-opacity-50',
//         closeIcon: 'fill-current h-4 w-4'
//       },
//       classes: {
//         wrapper: 'bg-blue-50 border-blue-500',
//         body: 'text-blue-700',
//         close: 'text-blue-500 hover:bg-blue-200'
//       },
//       variants: {
//         danger: {
//           wrapper: 'bg-red-50 border-red-500',
//           body: 'text-red-700',
//           close: 'text-red-500 hover:bg-red-200'
//         },
//         success: {
//           wrapper: 'bg-green-50 border-green-500',
//           body: 'text-green-700',
//           close: 'text-green-500 hover:bg-green-200'
//         }
//       }
//     }
//   },
//   't-dialog': {
//     component: TDialog,
//     props: {
//       fixedClasses: {
//         overlay: 'overflow-auto scrolling-touch left-0 top-0 bottom-0 right-0 w-full h-full fixed z-40 bg-opacity-50',
//         wrapper: 'relative mx-auto',
//         modal: 'overflow-visible relative ',
//         close: 'flex items-center justify-center  rounded-full absolute right-0 top-0 -m-3 h-8 w-8 transition duration-100 ease-in-out focus:ring-2 focus:ring-blue-500 focus:outline-none focus:ring-opacity-50',
//         dialog: 'overflow-visible relative',
//         iconWrapper: 'flex flex-shrink-0 h-12 items-center justify-center rounded-full w-12 mx-auto',
//         icon: 'w-6 h-6',
//         okButton: 'block px-4 py-2 text-white transition duration-100 ease-in-out border border-transparent rounded shadow-sm focus:border-blue-500 focus:ring-2 focus:ring-blue-500 focus:outline-none focus:ring-opacity-50 disabled:opacity-50 disabled:cursor-not-allowed w-full max-w-xs',
//         buttons: 'p-3 flex space-x-4 justify-center bg-gray-100 rounded-b'
//       },
//       classes: {
//         close: 'bg-gray-100 text-gray-600 hover:bg-gray-200',
//         closeIcon: 'fill-current h-4 w-4',
//         overlay: 'bg-black',
//         wrapper: 'z-50 max-w-lg px-3 py-12',
//         dialog: 'bg-white shadow rounded text-left',
//         body: 'p-3 space-y-3',
//         buttons: 'bg-gray-100',
//         iconWrapper: 'bg-gray-100',
//         icon: 'text-gray-500',
//         content: 'w-full flex justify-center flex-col',
//         titleWrapper: '',
//         title: 'text-lg font-semibold text-center',
//         textWrapper: 'text-left w-full',
//         text: '',
//         cancelButton: 'block px-4 py-2 transition duration-100 ease-in-out bg-white border border-gray-300 rounded shadow-sm hover:bg-gray-100 focus:border-gray-100 focus:ring-2 focus:ring-blue-500 focus:outline-none focus:ring-opacity-50 disabled:opacity-50 disabled:cursor-not-allowed w-full max-w-xs',
//         okButton: 'bg-blue-500 hover:bg-blue-600',
//         inputWrapper: 'mt-3 flex items-center space-x-3',
//         input: 'block w-full px-3 py-2 text-black placeholder-gray-400 transition duration-100 ease-in-out bg-white border border-gray-300 rounded shadow-sm focus:border-blue-500 focus:ring-2 focus:ring-blue-500 focus:outline-none focus:ring-opacity-50 disabled:opacity-50 disabled:cursor-not-allowed w-full',
//         select: 'block w-full px-3 py-2 text-black placeholder-gray-400 transition duration-100 ease-in-out bg-white border border-gray-300 rounded shadow-sm focus:border-blue-500 focus:ring-2 focus:ring-blue-500 focus:outline-none focus:ring-opacity-50  disabled:opacity-50 disabled:cursor-not-allowed w-full',
//         radioWrapper: 'flex items-center space-x-2',
//         radio: 'text-blue-500 transition duration-100 ease-in-out border-gray-300 shadow-sm focus:border-blue-500 focus:ring-2 focus:ring-blue-500 focus:outline-none focus:ring-opacity-50 focus:ring-offset-0  disabled:opacity-50 disabled:cursor-not-allowed',
//         radioText: '',
//         checkboxWrapper: 'flex items-center space-x-2',
//         checkbox: 'text-blue-500 transition duration-100 ease-in-out border-gray-300 rounded shadow-sm focus:border-blue-500 focus:ring-2 focus:ring-blue-500 focus:outline-none focus:ring-opacity-50 focus:ring-offset-0  disabled:opacity-50 disabled:cursor-not-allowed',
//         checkboxText: '',
//         errorMessage: 'text-red-500 block text-sm',
//         busyWrapper: 'absolute bg-opacity-50 bg-white flex h-full items-center justify-center left-0 top-0 w-full',
//         busyIcon: 'animate-spin h-6 w-6 fill-current text-gray-500',
//         overlayEnterClass: 'opacity-0',
//         overlayEnterActiveClass: 'transition ease-out duration-100',
//         overlayEnterToClass: 'opacity-100',
//         overlayLeaveClass: 'opacity-100',
//         overlayLeaveActiveClass: 'transition ease-in duration-75',
//         overlayLeaveToClass: 'opacity-0',
//         enterClass: '',
//         enterActiveClass: '',
//         enterToClass: '',
//         leaveClass: '',
//         leaveActiveClass: '',
//         leaveToClass: ''
//       },
//       variants: {
//         danger: {
//           overlay: 'bg-red-100',
//           okButton: 'bg-red-500 hover:bg-red-600',
//           iconWrapper: 'bg-red-50',
//           buttons: 'bg-red-50',
//           icon: 'text-red-500'
//         },
//         horizontal: {
//           body: 'p-3 flex space-x-3',
//           title: 'text-lg font-semibold'
//         }
//       }
//     }
//   },
//   't-pagination': {
//     component: TPagination,
//     props: {
//       classes: {
//         wrapper: 'table border-collapse text-center bg-white mx-auto shadow-sm',
//         element: 'w-8 h-8 border border-gray-200 table-cell hover:border-blue-100',
//         activeElement: 'w-8 h-8 border border-gray-200 border-blue-500 table-cell hover:border-blue-600',
//         disabledElement: 'w-8 h-8 border border-gray-200 table-cell',
//         ellipsisElement: 'w-8 h-8 border border-gray-200 hidden md:table-cell',
//         activeButton: 'bg-blue-500 w-full h-full text-white hover:bg-blue-600 transition duration-100 ease-in-out focus:ring-2 focus:ring-blue-500 focus:outline-none focus:ring-opacity-50',
//         disabledButton: 'opacity-25 w-full h-full cursor-not-allowed transition duration-100 ease-in-out',
//         button: 'hover:bg-blue-100 w-full h-full transition duration-100 ease-in-out focus:ring-2 focus:ring-blue-500 focus:outline-none focus:ring-opacity-50',
//         ellipsis: ''
//       },
//       variants: {
//         rounded: {
//           wrapper: 'bg-white mx-auto text-center flex space-x-2',
//           element: 'w-8 h-8 rounded-full',
//           activeElement: 'w-8 h-8 rounded-full',
//           disabledElement: 'w-8 h-8 rounded-full',
//           ellipsisElement: 'w-8 h-8 rounded-full hidden md:inline',
//           activeButton: 'border border-blue-500 bg-blue-500 w-full h-full rounded-full text-white hover:bg-blue-600 transition duration-100 ease-in-out focus:ring-2 focus:ring-blue-500 focus:outline-none focus:ring-opacity-50',
//           disabledButton: 'border border-gray-200  opacity-25 w-full h-full rounded-full cursor-not-allowed transition duration-100 ease-in-out',
//           button: 'border border-gray-200 hover:bg-blue-100 hover:border-blue-100 rounded-full w-full h-full transition duration-100 ease-in-out focus:ring-2 focus:ring-blue-500 focus:outline-none focus:ring-opacity-50',
//           ellipsis: ''
//         }
//       }
//     }
//   },
//   't-dropdown': {
//     component: TDropdown,
//     props: {
//       fixedClasses: {
//         button: 'flex items-center text-white block px-4 py-2 transition duration-100 ease-in-out border border-transparent rounded shadow-sm focus:border-blue-500 focus:ring-2 focus:ring-blue-500 focus:outline-none focus:ring-opacity-50 disabled:opacity-50 disabled:cursor-not-allowed',
//         wrapper: 'inline-flex flex-col',
//         dropdownWrapper: 'relative z-10',
//         dropdown: 'origin-top-left absolute left-0 w-56 rounded shadow mt-1',
//         enterClass: 'opacity-0 scale-95',
//         enterActiveClass: 'transition transform ease-out duration-100',
//         enterToClass: 'opacity-100 scale-100',
//         leaveClass: 'opacity-100 scale-100',
//         leaveActiveClass: 'transition transform ease-in duration-75',
//         leaveToClass: 'opacity-0 scale-95'
//       },
//       classes: {
//         button: 'bg-blue-500 hover:bg-blue-600',
//         dropdown: 'bg-white'
//       },
//       variants: {
//         danger: {
//           button: 'bg-red-500 hover:bg-red-600',
//           dropdown: 'bg-red-50'
//         }
//       }
//     }
//   }
// }

// Vue.use(VueTailwind, settings)
