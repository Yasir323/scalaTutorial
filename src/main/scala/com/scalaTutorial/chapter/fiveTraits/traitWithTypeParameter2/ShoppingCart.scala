package com.scalaTutorial.chapter.fiveTraits.traitWithTypeParameter2

trait ShoppingCart[A] {
    def add(prodName: A): Int
    def update(oldName: A, newName: A): Int
    def search(prodName: A): Boolean
    def delete(prodName: A): Int
}