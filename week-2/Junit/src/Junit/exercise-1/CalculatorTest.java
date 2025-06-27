package Junit.Exercise1;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        System.out.println("2 + 3 = " + result);  // 🔸 This will print in terminal
        assertEquals(5, result);
    }
}
