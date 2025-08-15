package com.peter.swaggy.navigation

const val ROUT_HOME = "home"
const val ROUT_ABOUT = "about"
const val ROUT_CONTACT = "contact"
const val ROUT_ITEM= "item"
const val ROUT_CATEGORY= "category"
const val ROUTE_SPLASH = "splash"
const val ROUTE_SCAFFOLD = "scaffold"
const val ROUTE_DETAIL = "detail"
const val ROUTE_INTENT = "intent"
const val ROUTE_DASHBOARD = "dashboard"
const val ROUTE_DASHBOARD2 = "dashboard2"
const val ROUTE_FORM = "form"
//Auth

const val ROUT_REGISTER= "register"
const val ROUT_LOGIN= "login"

//CRUD -Products
const val ROUT_ADD_PRODUCT = "add_product"
const val ROUT_PRODUCT_LIST = "product_list"
const val ROUT_EDIT_PRODUCT = "edit_product/{productId}"

// ✅ Helper function for navigation
fun editProductRoute(productId: Int) = "edit_product/$productId"