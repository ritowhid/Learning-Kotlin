package com.main.miscellaneous

/*
    -> Annotations are metadata you can attach to classes, functions, properties, or
    other code elements. They don’t affect the program’s logic directly but can be used by tools,
    libraries, or the compiler for various purposes like code generation, enforcing rules, or runtime behavior.
 */
// Define a custom annotation
@Target(AnnotationTarget.FUNCTION)  // Where this annotation can be used
@Retention(AnnotationRetention.RUNTIME) // Available at runtime via reflection
annotation class Fancy(val author: String)

// Use a built-in annotation to mark deprecated code
@Deprecated("Use newGreet() instead", ReplaceWith("newGreet()"))
fun oldGreet() {
    println("Hello from oldGreet")
}

@Fancy(author = "Rakibul")
fun newGreet() {
    println("Hello from newGreet")
}

fun main() {
    oldGreet()
    newGreet()

    // Access annotation via reflection
    val method = ::newGreet
    val annotation = method.annotations.find { it is Fancy } as? Fancy
    if (annotation != null) {
        println("Fancy annotation author: ${annotation.author}")
    }
}