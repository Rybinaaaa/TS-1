package cz.fel.cvut.ts1;

import org.example.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class test {

    @Test
    public void factorialTest() {
        Factorial factorial = new Factorial();
        int number  = 3;
        long exceptResult = 6;

        long result = factorial.factorial(number);

        Assertions.assertEquals(exceptResult, result);
    }

    @ParameterizedTest(name = "{0} factorial should be equal to {1}") @CsvSource({"1, 1", "3, 6"})
    public void add_addsAandB_returnsC(int a, int b) {
// arrange
        Factorial calc = new Factorial();
        int expectedResult = b;
// act
        long result = calc.factorial(a);
// assert
        Assertions.assertEquals(expectedResult, result);
    }
}
