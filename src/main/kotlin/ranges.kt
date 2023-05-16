fun main(){
    for (number in 10..15)
        println(number)

    for (letter in 'c'..'f')
        println("letter is $letter")

    for (num in 1..10){
        if (num==5) {
            break
        }
            println("number $num")
    }

    for (letters in 'a'..'d') {
        if (letters == 'c') {
            continue
        }
        println(letters)
    }
}