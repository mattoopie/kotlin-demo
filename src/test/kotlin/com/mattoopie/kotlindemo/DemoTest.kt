import org.assertj.core.api.Assertions.assertThat
import java.time.LocalDate
import kotlin.test.Test

class FunctionsTest {

    @Test
    fun a_testNamedArguments() {
        assertThat(hello(name = "Freek")).isEqualTo("Hello Freek")
    }

    @Test
    fun b_testDefaultArguments() {
        assertThat(hello()).isEqualTo("Hello Piet")
    }

    @Test
    fun c_testLambda() {
        assertThat(containsEvenNumber(listOf(5, 6, 7))).isTrue()
    }

    @Test
    fun d_testCustomLambda() {
        assertThat(doSomethingToNumber(5) { it + 6 }).isEqualTo(11)
    }

    @Test
    fun e_testDataClasses() {
        val persoon = Persoon(
                naam = "Kees",
                geboortedatum = LocalDate.now()
        )
        assertThat(persoon.naam).isEqualTo("Kees")
    }

    @Test
    fun f_testStringExtension() {
        assertThat("Appel".addText("taart")).isEqualTo("Appeltaart")
    }

    @Test
    fun g_testListExtension() {
        val personen = listOf<Persoon>(
                Persoon(
                        naam = "Kees",
                        geboortedatum = LocalDate.now()
                ),
                Persoon(
                        naam = "Piet",
                        geboortedatum = LocalDate.now().minusDays(3)
                ),
                Persoon(
                        naam = "Klaas",
                        geboortedatum = LocalDate.now().plusDays(5)
                )
        )
        assertThat(personen.sortByGeboortedatum())
                .extracting("naam")
                .containsExactly("Piet", "Kees", "Klaas")
    }

    @Test
    fun h_testCollections() {
        val vandaag = LocalDate.now()
        val personen = listOf(
                Persoon(
                        naam = "Kees",
                        geboortedatum = vandaag
                ),
                Persoon(
                        naam = "Piet",
                        geboortedatum = vandaag.minusDays(3)
                ),
                Persoon(
                        naam = "Klaas",
                        geboortedatum = vandaag.plusDays(5)
                )
        )

        assertThat(
                personen.filter { it.naam == "Piet" }
        ).containsExactly(
                Persoon(
                        naam = "Piet",
                        geboortedatum = vandaag.minusDays(3)
                )
        )

        assertThat(
                personen.map { it.naam.length }
        ).containsExactly(4, 4, 5)

        personen.forEachIndexed { index, persoon ->
            println("$index - ${persoon.naam}")
        }

        val (geborenVoorVandaag, geborenVanafVandaag)
                = personen.partition { it.geboortedatum < vandaag }

        assertThat(geborenVoorVandaag)
                .extracting("naam")
                .containsExactly("Piet")

        assertThat(geborenVanafVandaag)
                .extracting("naam")
                .containsExactly("Kees", "Klaas")
    }
}