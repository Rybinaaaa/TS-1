import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {
    static Calculator f;

    @BeforeAll
    public static void initVariable() {
        f = new Calculator();
    }

    @Test
    public void add_adds1to2_returns3() {
        int result = f.add(1, 2);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void subtract_subtract5from2_returns3() {
        int result = f.subtract(5, 2);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void multiply_multiply5on2_returns10() {
        int result = f.multiply(5, 2);
        Assertions.assertEquals(10, result);
    }

    @Test
    public void divide_divide10on2_returns5() {
        int result = f.divide(10, 2);
        Assertions.assertEquals(5, result);
    }
}
