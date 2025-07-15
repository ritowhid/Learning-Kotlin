package com.main.function

/*
 -> inline:
    inline functions are a performance optimization feature, especially useful with
    higher-order functions (functions that take other functions as parameters, like lambdas).

 -> crossinline:
    When you use an inline function, you can return from a lambda using a non-local return
    (i.e., it exits the outer function). But sometimes you want to prevent that — for example,
    when you're passing the lambda to another function or thread where non-local returns would cause issues.

    The crossinline marker is used to mark lambdas that mustn’t allow non-local
    returns, especially when such a lambda is passed to another execution context
    such as a higher order function that is not inlined, a local object or a nested function.
    In other words, you won’t be able to do a return in such lambdas.

 -> Say you have multiple lambdas in your inlined function, and you don’t want all of them to be inlined,
    you can mark the lambdas you don’t want to be inlined with the noinline keyword.
 */
fun main() {

    // call function of inline
    addValInline(
        3,
        4,
        myOutput = {
            print("Inline: $it & ")
        },
        myOutput2 = {
            println(it)
        })

//===============================================================================================

    // call function of crossinline
    addValCrossinline(
        3,
        4,
        myOutputCi = {
            print("Crossinline: $it ")
            if (it < 10) {
                // return ❌ Not allowed due to crossinline
            }
            print("Done & ")
        },
        myOutputCi2 = {
            println(it)
        })

//================================================================================================

    // call function of noinline
    addValNoinline(
        3,
        4,
        myOutputNi = {
            print("Noinline: $it & ")
        },
        myOutputNi2 = {
            println(it)
        })
}

inline fun addValInline(
    i: Int,
    j: Int,
    myOutput: (Int) -> Unit, // it creates object
    myOutput2: (Int) -> Unit // it creates object - to avoid this, use inline
) {
    val r = i + j
    myOutput(r)
    myOutput2(r + 2)
}

//================================================================================================

inline fun addValCrossinline(
    i: Int,
    j: Int,
    crossinline myOutputCi: (Int) -> Unit, // it creates object
    myOutputCi2: (Int) -> Unit // it creates object - to avoid this, use inline before fun
) {
    val r = i + j
    myOutputCi(r)
    myOutputCi2(r + 2)
}

//================================================================================================

inline fun addValNoinline(
    i: Int,
    j: Int,
    crossinline myOutputNi: (Int) -> Unit,
    noinline myOutputNi2: (Int) -> Unit // using 'noinline' to create an object
) {
    val r = i + j
    myOutputNi(r)
    myOutputNi2(r + 2)
}