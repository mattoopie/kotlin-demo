import org.assertj.core.api.Assertions.assertThat
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
}