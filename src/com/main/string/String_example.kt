package com.main.string

// string - immutable
fun main() {
    val str = "Hello"
    val str2 : String = "Hello, gfg"

    // create an empty string:
    val var_name = String()

    // accessing string element one by one
    val str3 = "Hello"
    println(str3[0])
    println(str3[1])
    println(str3[2])
    println(str3[3])
    println(str3[4])

    // accessing a string element using for loop
    val str4 = "Geeks"
    for (i in str4.indices) {
        print(str4[i])
    }

    // String Template; Both string types (escaped and raw string) contain template expressions
    val n = 10;
    println("\nThe value of n is $n")
    val str5 = "Geeks"
    println("$str5 is a string which length is ${str5.length}")

    // get an element by index
    println(str5.get(4)) // return the char at particular index

    // string subSequence
    println(str5.subSequence(1,4)) // return a substring

    // compareTo
    val s1 = "GeeksForGeek"
    val s2 = "GeeksForGeeks"
    println(s1.compareTo(s2)) // return 0 if s1 == s2, s1 > s2 return +ve num, s1 < s2 return -ve num

    // above properties and function
    var g = "GeeksForGeeks"
    var e = "Geeks"
    println(g.length)
    println(g.get(4))
    println(g.subSequence(0, 5))
    println(g.compareTo(e))

    /*
        2 types of string literals-
         - Escaped String: declared with double quotes & may contain escape characters like \n, \t etc
         - Raw String: Raw string is placed inside the triple quotes ("""....""") and it does not have
           escape characters. It provides the facility of writing the string into multiple lines, so it is also called a multi-line string.
     */

    // escaped string
    val str6 = "World \n is \n amazing"
    println(str6)

    // raw string - multiline string
    var str7 = """My
        |name
        |is
        |Towhid
    """.trimMargin()
    println(str7)

    /* String equality: feature of comparing the instances of a particular type in two different ways
       -> Structural Equality: it's checked through the == operator and its
          inverse != operator. By default, the expression containing x==y is translated into the call of the equals() function for that type.
       -> Referential Equality: it's checked through the === operator and its inverse !== operator.

     */
    var x = "GeeksForGeeks"
    var y = "GeeksForGeeks"
    var z = "Geeks"
    println(x===y) // true, as both are pointing to the same StringPool
    println(x==z)  //false since values are not equal
    println(x===z) // false


}