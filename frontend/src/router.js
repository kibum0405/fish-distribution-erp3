
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import SupplierRegistrationSupplierManager from "./components/listers/SupplierRegistrationSupplierCards"
import SupplierRegistrationSupplierDetail from "./components/listers/SupplierRegistrationSupplierDetail"

import OrderOrderManager from "./components/listers/OrderOrderCards"
import OrderOrderDetail from "./components/listers/OrderOrderDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/supplierRegistrations/suppliers',
                name: 'SupplierRegistrationSupplierManager',
                component: SupplierRegistrationSupplierManager
            },
            {
                path: '/supplierRegistrations/suppliers/:id',
                name: 'SupplierRegistrationSupplierDetail',
                component: SupplierRegistrationSupplierDetail
            },

            {
                path: '/orders/orders',
                name: 'OrderOrderManager',
                component: OrderOrderManager
            },
            {
                path: '/orders/orders/:id',
                name: 'OrderOrderDetail',
                component: OrderOrderDetail
            },




    ]
})
