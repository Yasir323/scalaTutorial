package com.scalaTutorial.chapter.threeFunctions.implicitFunctions_5

class Caps(name: String) {
    def allCaps: Boolean = name == name.toUpperCase()
}
