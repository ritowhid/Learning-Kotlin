package com.main.regex_ranges

/*
    -> A regular expression is a special sequence of characters that defines a search pattern. It’s commonly used for:
      - Validating input (like emails, phone numbers)
      - Searching text
      - Replacing or splitting strings based on patterns
      - Parsing complex text formats
 */

fun main() {
    val input = "My email is test.user@example.com and my backup is user123@domain.co.uk"

    // 1. Define regex for a simple email pattern
    val emailRegex = Regex("[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}")

    // 2. Check if entire string matches (it won't because the input has extra text)
    println("Full match: ${emailRegex.matches(input)}") // false

    // 3. Check if regex pattern is found anywhere inside the string
    println("Contains email? ${emailRegex.containsMatchIn(input)}") // true

    // 4. Find first email in the string
    val firstEmail = emailRegex.find(input)?.value
    println("First email found: $firstEmail")

    // 5. Find all emails in the string
    val allEmails = emailRegex.findAll(input).map { it.value }.toList()
    println("All emails found: $allEmails")

    // 6. Replace all emails with a placeholder
    val censored = emailRegex.replace(input, "[hidden email]")
    println("Censored text: $censored")

    // 7. Split string by space and punctuation
    val words = Regex("\\W+").split(input)
    println("Words extracted: $words")
}
