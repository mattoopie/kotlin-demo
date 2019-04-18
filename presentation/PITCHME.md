@snap[south]
# Kotlin
@snapend

@snap[midpoint]
<img src="presentation/assets/logo.png" width="200" height="200" alt="Kotlin logo" style="border:unset; background:unset; box-shadow:unset;"/>
@snapend

---
@snap[north-west]
## Inhoud
@snapend

* Verschil met Java
* Code
* Vragen

---
@snap[north-west]
## Java
@snapend

* Static methods
* Checked exceptions (throws ...)
* Wildcard types (<? extends E>)
* Ternary operator (bool ? a : b)

---
@snap[north-west]
## Kotlin
@snapend

* Lambda expressions
* Extension functions
* Null safety
* Smart casts
* Primary constructors
* Type inference
* Range expressions
* Companion objects
* Mutable en immutable collections

---
@snap[north-west]
## Functionele aspecten
@snapend

* First class functions
* Higher-order functions
* Lambda expressions
* Currying

---?code=src/main/kotlin/com/mattoopie/kotlindemo/Demo.kt&lang=kotlin&title=Code
@[1-2](Importeren van Java libraries)
@[5-7](Signature, default en named arguments)
@[10](Gebruik maken van een lambda expressie)
@[13](Zelf een lambda maken, higher order function)
@[17-18](Nullability)
@[20-21](Omgaan met nullability van waarde zelf)
@[23-24](Omgaan met nullability van waarde zelf)
@[26-27](Omgaan met nullability van waarde zelf)
@[29-30](Omgaan met nullability van waarde zelf)
@[32-33](Omgaan met nullability van waarde voor iets anders)
@[35-36](Omgaan met nullability van waarde voor iets anders)
@[38-39](Omgaan met nullability van waarde voor iets anders)
@[43-46](Data classes en primary constructor)
@[49-50](Extension functies)
@[52-53](Extension functies)
@[57-64](Gebruik van when ipv switch/case)
@[68-77](Getter en setter)

---?code=src/test/kotlin/com/mattoopie/kotlindemo/DemoTest.kt&lang=kotlin&title=Collections
@[65-78](Maak een aantal instanties van Persoon)
@[80-87](filter)
@[89-91](map)
@[93-95](forEach(Indexed))
@[97-106](partition)

---
@snap[midpoint]
Vragen?
@snapend