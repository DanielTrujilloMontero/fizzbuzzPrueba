package test;

import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    private FizzBuzz fizzbuzz;

    @Before
    public void setUp() throws Exception {
        fizzbuzz = new FizzBuzz();
    }

    @Test
    public void should_return_number_if_neither_3_or_5() {
        assertThat(fizzbuzz.of(1)).isEqualTo("1");
        assertThat(fizzbuzz.of(2)).isEqualTo("2");
    }

    @Test
    public void should_return_fizz_when_multiple_of_3() {
        assertThat(fizzbuzz.of(3)).isEqualTo("fizz");
        assertThat(fizzbuzz.of(6)).isEqualTo("fizz");
    }

    @Test
    public void should_return_buzz_when_multiple_of_5() {
        assertThat(fizzbuzz.of(5)).isEqualTo("buzz");
        assertThat(fizzbuzz.of(10)).isEqualTo("buzz");
    }

    @Test
    public void should_return_fizzbuzz_when_multiple_of_15() {
        assertThat(fizzbuzz.of(15)).isEqualTo("fizzbuzz");
        assertThat(fizzbuzz.of(30)).isEqualTo("fizzbuzz");
    }

    private class FizzBuzz {
        public String of(int number) {
            if (is_Multiple_of_15(number)) return "fizzbuzz";
            if (is_Multiple_of_5(number)) return "buzz";
            if (is_Multiple_of_3(number)) return "fizz";
            return String.valueOf(number);
        }

        private boolean is_Multiple_of_3(int number) {
            return number % 3 == 0;
        }

        private boolean is_Multiple_of_5(int number) {
            return number % 5 == 0;
        }

        private boolean is_Multiple_of_15(int number) {
            return number % 15 == 0;
        }
    }
}
