// Named en default arguments (test a en b)
fun hello(name: String = "Piet"): String = "Hello $name"

// Lambda's (test c)
fun containsEvenNumber(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0 }
