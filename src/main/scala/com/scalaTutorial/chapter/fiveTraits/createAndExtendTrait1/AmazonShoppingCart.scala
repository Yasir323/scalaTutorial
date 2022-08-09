package com.scalaTutorial.chapter.fiveTraits.createAndExtendTrait1
import scala.collection.mutable
class AmazonShoppingCart extends ShoppingCart with InventoryService {

    val products: mutable.ListBuffer[String] = mutable.ListBuffer[String]()
    var count = 10

    override def add(prodName: String): Int = {
        println(s"Insert: Book - $prodName")
        products.append(prodName)
        count -= 1
        1
    }

    override def update(oldProdName: String, newProdName: String): Int = {
        println(s"Update: Book - $oldProdName -> ${newProdName}")
        val ind = products.indexOf(oldProdName)
        products(ind) = newProdName
        1
    }

    override def search(prodName: String): Boolean = {
        val ind = products.indexOf(prodName)
        println(s"Searching $prodName")
        if (ind == -1) return false
        true
    }

    override def delete(prodName: String): Int = {
        println(s"Deleting $prodName")
        val ind = products.indexOf(prodName)
        if (ind == -1) return 0
        products.remove(ind)
        count += 1
        1
    }

    override def checkStockQuantity(prodName: String): Int = count

}
