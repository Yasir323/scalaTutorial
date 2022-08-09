package com.scalaTutorial.chapter.threeFunctions.functions_1

object FunctionsIntro extends App {
    def func(): String = {
        "Hello"
    }
    println(func())

    // Function without parenthesis
    def funcWithoutParenthesis = "Function without parenthesis."
    println(funcWithoutParenthesis)

    // Function with no return type
    def funcWithNoReturnType(): Unit = {
        println("Function with no return type.")
    }
    funcWithNoReturnType()
}
