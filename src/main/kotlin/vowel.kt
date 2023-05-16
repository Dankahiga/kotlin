fun main() {
    print("Enter a letter: ")
    var letter = readLine()!!

    if (letter in "aeiou") {
    println("$letter is a vowel")
    }

    else if (letter in "bcdfghjklmnpqrstvwxyz") {
    println("$letter is a consonant")
    }
}