package com.scalaTutorial.chapter.fourClasses.companionClass2

class Mobile (brand: String, model: String) {
    def print(): Unit = println(s"Mobile\nBrand: $brand\nModel: $model")
}

// Companion Object
// A companion class or object can access the private members of its companion.
object Mobile {
    def apply(brand: String, model: String ): Mobile = {
        new Mobile(brand, model)
    }
}

