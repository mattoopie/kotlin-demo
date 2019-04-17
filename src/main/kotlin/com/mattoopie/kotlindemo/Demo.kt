import java.lang.Math.random
import java.time.LocalDate

/* Named en default arguments (test a en b) */
fun hello(name: String = "Piet"): String = "Hello $name"
// hello() geeft "Hello Piet"
// hello(name = "Henk") geeft "Hello Henk"

/* Lambda's (test c) */
fun containsEvenNumber(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0 }

/* Zelf een lambda maken (test d) */
fun doSomethingToNumber(number: Int, transform: (Int) -> Int): Int = transform(number)

/* Nullability */
fun getStringNullsafe(): String = "Text"
fun getStringNullable(): String? = if (random() > 0.5) "Text" else null
fun checkNullabilityCompiler() {
    var text = getStringNullsafe()
    // text = getStringNullable() // Compileert niet
    text = getStringNullable() ?: "Use this if null"
    text = getStringNullable()!! // Gooit NullPointerException als null

    var length = getStringNullsafe().length
    // length = getStringNullable().length // Compileert niet
    length = getStringNullable()?.length
        ?: 0 // Als getStringNullable null is: gebruik 0, anders: gebruik het resultaat met .length
}

/* Data classes (test e) */
data class Persoon(
    val naam: String,
    val geboortedatum: LocalDate
)

/* Extension functions (test f en g) */
fun String.addText(text: String): String = this.plus(text)
// Gebruik: "Appel".addText("taart")

fun List<Persoon>.sortByGeboortedatum() = this.sortedBy { it.geboortedatum }
// Gebruik: personen.sortByGeboortedatum()

/* Collections (test h) */
// Standaardlibraries