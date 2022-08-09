package com.scalaTutorial.chapter.fiveTraits.traitWithTypeParameter2

import scala.collection.mutable
class AmazonShoppingCart[A] extends ShoppingCart[A] {

    val products: mutable.ListBuffer[A] = mutable.ListBuffer[A]()

    override def add(prodName: A): Int = {
        println(s"Insert: Book - $prodName")
        products.append(prodName)
        1
    }

    override def update(oldProdName: A, newProdName: A): Int = {
        println(s"Update: Book - $oldProdName -> ${newProdName}")
        val ind = products.indexOf(oldProdName)
        products(ind) = newProdName
        1
    }

    override def search(prodName: A): Boolean = {
        val ind = products.indexOf(prodName)
        println(s"Searching $prodName")
        if (ind == -1) return false
        true
    }

    override def delete(prodName: A): Int = {
        println(s"Deleting $prodName")
        val ind = products.indexOf(prodName)
        if (ind == -1) return 0
        products.remove(ind)
        1
    }
}