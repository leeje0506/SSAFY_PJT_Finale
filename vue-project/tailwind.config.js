// tailwind.config.js
/** @type {import('tailwindcss').Config} */
const colors = require("tailwindcss/colors");
module.exports = {
  /**darkMode: "class",
  daisyui: {
    themes: ["light", "dark", "cupcake"],
  },*/
  //퍼지에 경로들 넣어주면 됨! css에서 .클래스 이런 느낌
  purge: [],
  darkMode: false, // or 'media' or 'class'
  content: ["./index.html", "./src/**/*.{js,ts,jsx,tsx}"],
  theme: {
    extend: {
      colors: {
        ...colors,
        primary: "#1a74e5",
      },
    },
  },
  variants: {
    extend: {},
  },
  plugins: [],
};
