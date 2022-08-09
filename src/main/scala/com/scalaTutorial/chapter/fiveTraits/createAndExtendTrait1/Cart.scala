package com.scalaTutorial.chapter.fiveTraits.createAndExtendTrait1

object Cart extends App {
    val cart: AmazonShoppingCart = new AmazonShoppingCart()
    println(cart.add("Learning Spark"))
    println(cart.update("Learning Spark", "Learning Spark - 2nd edition"))
    println(cart.search("Learning Spark - 2nd edition"))
    println(cart.delete("Learning Spark - 2nd edition"))
    println(cart.checkStockQuantity("Learning Spark - 2nd edition"))
}
