package org.plytimebandit.testarea.kotlin


fun main(args: Array<String>) {

    val myListTransformed = listMapPrint()
    performingWhen(myListTransformed)
    val name = creatingAndPrintingClass()
    callingConditionalExpression(name)
    parsingTypes()
    loopsAndCounting()
    checkingValues()
    destructuringClass()
    usingDataClasses()

}

private fun usingDataClasses() {
    val data = DataContainer("foo", 1)
    println(data)

    val data2 = data.copy()
    println("Data is equals: ${data == data2}")

    val data3 = DataContainer("foo", 1)
    println("1. Data is equals: ${data == data2}")
    println("2. Data is equals: ${data2 == data3}")
    println("3. Data is equals: ${data == data3}")

    val person = Person("Flash", "Gordon")
    val person2 = Person("Flash", "Gordon")
    println("Normal class is equals: ${person == person2}")

    println(data)
    println(data.copy("bar"))
    println(data.copy("bazzz"))
    println(data.copy(id = 4))
    println(data.copy(id = 9))
    println(data.copy("zoom", 42))
}

private fun destructuringClass() {
    val person = Person("Flash", "Gordon")
    val (one, two) = person
    println(person)
    println("${one} and ${two}")
}

private fun checkingValues() {
    checkValue("test")
    checkValue("Hello")
    checkValue(1)
    checkValue(11)
    checkValue(11.22)
}

private fun loopsAndCounting() {
    for (i in 0..5)
        print(i)
    println()

    val x = 5
    if (x in 0..10) println("0-10 contains ${x}")
    if (x !in 10..20) println("10-20 does not contain ${x}")

    val mymap = hashMapOf<String, Int>()
    mymap.put("aaa", 1)
    mymap.put("bbb", 2)
    mymap.put("ccc", 3)

    var i = 0
    for ((k, v) in mymap) {
        println("${i++}. Key is $k and value is $v")
    }
}

private fun parsingTypes() {
    val numAsString = "42"
    val numAsInt = numAsString.toInt();
    print(numAsString.javaClass.name + ": ")
    println(numAsString)
    print(numAsInt.javaClass.name + ": ")
    println(numAsInt)
    if (numAsInt is Int) {
        println("is truly an int.")
    } else {
        println("no int at all!")
    }
}

private fun callingConditionalExpression(name: NameContainer) {
    val name2 = NameContainer("Cornholio")

    println("The bigger name is: ${getBiggerName(name, name2)}")
}

private fun creatingAndPrintingClass(): NameContainer {
    val name = NameContainer("Pete")
    println(name)
    println(name.name)
    println(name.getTheName())
    return name
}

private fun performingWhen(myListTransformed: List<String>) {
    val firstElement = when (myListTransformed[0]) {
        "ax" -> "aa"
        "bx" -> "bb"
        else -> "xx"
    }
    println(firstElement)
}

private fun listMapPrint(): List<String> {
    val myList = listOf("a", "b", "c")
    val myListTransformed = myList.map { e -> e + "x" }
    for (e in myListTransformed)
        println(e)
    return myListTransformed
}

fun getBiggerName(n1: NameContainer, n2: NameContainer) = if (n1.name.length > n2.name.length) n1.name else n2.name

fun checkValue(o: Any) {
    when (o) {
        1 -> println("Is number one")
        "Hello" -> println("Is a greeting")
        is String -> println("Is a String")
        !is Double -> println("Is no Double")
        else -> println("Dunno! Is ${o.javaClass.name}")
    }

}