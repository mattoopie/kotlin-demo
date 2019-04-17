import java.lang.Math.random
import java.time.LocalDate

/* Named en default arguments (test a en b) */
fun hello(name: String = "Piet"): String = "Hello $name"
// hello() geeft "Hello Piet"
// hello(name = "Henk") geeft "Hello Henk"

/* Lambda's (test c) */
fun containsEvenNumber(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0 }

/* Zelf een lambda maken, higher-order functions (test d) */
fun doSomethingToNumber(number: Int, transform: (Int) -> Int): Int = transform(number)
// doSomethingToNumber(5) { it + 6 } geeft 11

/* Nullability */
fun getStringNullsafe(): String = "Text"
fun getStringNullable(): String? = if (random() > 0.5) "Text" else null
fun checkNullabilityCompiler() {
    // String, type inference
    var text = getStringNullsafe()

    // Compileert niet, want String?
    // text = getStringNullable()

    // Elvis operator: als iets ervoor null is, gebruik dan wat erna staat
    text = getStringNullable() ?: "Use this if null"

    // Null assertion: gooit NPE als null
    text = getStringNullable()!!

    // .length gaat goed met null safe waarde (String)
    var length = getStringNullsafe().length

    // Compileert niet, want String?
    // length = getStringNullable().length

    // Als getStringNullable null is: gebruik 0, anders: gebruik het resultaat met .length
    length = getStringNullable()?.length ?: 0
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