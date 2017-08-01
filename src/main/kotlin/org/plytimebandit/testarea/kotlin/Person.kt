package org.plytimebandit.testarea.kotlin

class Person(val firstname: String, val lastname: String) {

    operator fun component1(): String {
        return firstname
    }

    operator fun component2(): String {
        return lastname
    }

    override fun toString(): String {
        return "Person(firstname='$firstname', lastname='$lastname')"
    }


}