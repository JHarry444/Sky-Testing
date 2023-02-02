package com.qa.testing;

import com.qa.main.testing.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// maven auto finds any class that begins or ends with 'Test'
public class CalcTest {



    private Calculator calc = new Calculator();


    @Test        // flags this as a test method
    void testAdd() {
        // if calc.add(7, 9) == 16 -> pass
        // otherwise fail
        Assertions.assertEquals(16, this.calc.add(7, 9));
        // won't hit this if the previous assertion fails
        Assertions.assertEquals(32, this.calc.add(16, 16));

    }


    @Test // flags this as a test method
    void testSubtract() {
        Assertions.assertEquals(8, this.calc.subtract(19, 11));
    }


    @Test // flags this as a test method
    void testDivide() {
        Assertions.assertEquals(3.3, this.calc.divide(10, 3), 0.1);
    }


    @Test // flags this as a test method
    void testMultiply() {
        Assertions.assertEquals(108, this.calc.multiply(9, 12));
    }
}
