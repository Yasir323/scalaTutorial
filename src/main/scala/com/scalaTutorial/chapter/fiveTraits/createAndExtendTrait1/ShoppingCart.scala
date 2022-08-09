package com.scalaTutorial.chapter.fiveTraits.createAndExtendTrait1

trait ShoppingCart {
    def add(prodName: String): Int
    def update(oldName: String, newName: String): Int
    def search(prodName: String): Boolean
    def delete(prodName: String): Int
}

