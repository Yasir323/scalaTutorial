package com.scalaTutorial.chapter.fourClasses.typeAliasing7


object TypeAliasing extends App {
    case class Donut(name: String, price: Double, productCode: Option[Long] = None)
    val vanillaDonut: Donut = Donut("Vanilla", 1.50)
    val glazedDonut: Donut = Donut("Glazed", 2.0)
    println(s"Vanilla Donut = $vanillaDonut")
    println(s"Glazed Donut = $glazedDonut")
    // Type aliasing a Tuple2 object
    type CartItem[Donut, Int] = (Donut, Int)  // Tuple2
    val cartItem = new CartItem(vanillaDonut, 4)
    println(s"cartItem = $cartItem")
    println(s"cartItem first value = ${cartItem._1}")
    println(s"cartItem second value = ${cartItem._2}")

    def calculateTotal(shoppingCartItems: Seq[CartItem[Donut, Int]]): Double = {
        shoppingCartItems.foreach(
            {
                cartItem => println(s"CartItem donut = ${cartItem._1}, quantity = ${cartItem._2}")
            }
        )
        10.0
    }
    println(calculateTotal(Seq(cartItem)))

    // Using case class instead of type aliasing
    case class ShoppingCartItem(donut: Donut, quantity: Int)
    val shoppingItem: ShoppingCartItem = ShoppingCartItem(Donut("Glazed Donut", 2.50), 10)
    println(s"shoppingItem donut = ${shoppingItem.donut}")
    println(s"shoppingItem quantity = ${shoppingItem.quantity}")

    def calculateTotal2(shoppingCartItems: Seq[ShoppingCartItem]): Double = {
        // calculate the total cost
        shoppingCartItems.foreach { shoppingCartItem =>
        println(s"ShoppingCartItem donut = ${shoppingCartItem.donut}, quantity = ${shoppingCartItem.quantity}")
        }
        10 // some random total cost
    }
    println(calculateTotal2(Seq(shoppingItem)))
}
