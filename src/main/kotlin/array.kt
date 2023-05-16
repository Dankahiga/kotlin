fun main(){
    var languages = arrayOf("Python", "Kotlin", "Java")
    println(languages[0] )//Accessing an Element

    languages[0]="Javascript"//Changing an Element
    println(languages[0])

    var language = languages.plus(element = "c")
    for (lang in language){
        println(lang)
    }

    for (c in languages) {
        println(c)
    }
    println(languages.size)



}