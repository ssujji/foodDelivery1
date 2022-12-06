
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"
import PaymentManager from "./components/listers/PaymentCards"
import PaymentDetail from "./components/listers/PaymentDetail"

import MenuView from "./components/MenuView"
import MenuViewDetail from "./components/MenuViewDetail"
import MeansOfDeliveryView from "./components/MeansOfDeliveryView"
import MeansOfDeliveryViewDetail from "./components/MeansOfDeliveryViewDetail"
import FoodCookingManager from "./components/listers/FoodCookingCards"
import FoodCookingDetail from "./components/listers/FoodCookingDetail"

import DeliveryManager from "./components/listers/DeliveryCards"
import DeliveryDetail from "./components/listers/DeliveryDetail"

import OrderInfoManager from "./components/listers/OrderInfoCards"
import OrderInfoDetail from "./components/listers/OrderInfoDetail"

import MyPageView from "./components/MyPageView"
import MyPageViewDetail from "./components/MyPageViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },
            {
                path: '/payments',
                name: 'PaymentManager',
                component: PaymentManager
            },
            {
                path: '/payments/:id',
                name: 'PaymentDetail',
                component: PaymentDetail
            },

            {
                path: '/menus',
                name: 'MenuView',
                component: MenuView
            },
            {
                path: '/menus/:id',
                name: 'MenuViewDetail',
                component: MenuViewDetail
            },
            {
                path: '/meansOfDeliveries',
                name: 'MeansOfDeliveryView',
                component: MeansOfDeliveryView
            },
            {
                path: '/meansOfDeliveries/:id',
                name: 'MeansOfDeliveryViewDetail',
                component: MeansOfDeliveryViewDetail
            },
            {
                path: '/foodCookings',
                name: 'FoodCookingManager',
                component: FoodCookingManager
            },
            {
                path: '/foodCookings/:id',
                name: 'FoodCookingDetail',
                component: FoodCookingDetail
            },

            {
                path: '/deliveries',
                name: 'DeliveryManager',
                component: DeliveryManager
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveryDetail',
                component: DeliveryDetail
            },

            {
                path: '/orderInfos',
                name: 'OrderInfoManager',
                component: OrderInfoManager
            },
            {
                path: '/orderInfos/:id',
                name: 'OrderInfoDetail',
                component: OrderInfoDetail
            },

            {
                path: '/myPages',
                name: 'MyPageView',
                component: MyPageView
            },
            {
                path: '/myPages/:id',
                name: 'MyPageViewDetail',
                component: MyPageViewDetail
            },


    ]
})
