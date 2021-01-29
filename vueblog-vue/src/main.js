import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'

import axios from 'axios'
import "./axios"
import "./permission"

import Element from 'element-ui'
import "element-ui/lib/theme-chalk/index.css"
import mavionEditor from 'mavon-editor'
import 'mavon-editor/dist/css/index.css'

Vue.use(Element)
Vue.use(mavionEditor)
Vue.prototype.$axios = axios //
Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
