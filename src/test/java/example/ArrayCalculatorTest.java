package example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayCalculatorTest {

    @Test
    public void calculateWholeListAddedToInt()
    {
        ArrayCalculator calculator = new ArrayCalculator();

        calculator.addIntegerToList(1);
        calculator.addIntegerToList(2);
        calculator.addIntegerToList(5);

        assertEquals("The value doesn't match with the expected (8)", 8, calculator.getWholeListAdded());
    }

    @Test
    public void calculateWholeListAddedWithFactorToInt()
    {
        ArrayCalculator calculator = new ArrayCalculator();

        calculator.addIntegerToList(1);
        calculator.addIntegerToList(2);
        calculator.addIntegerToList(5);

        assertEquals("The value doesn't match with the expected (14)", 14, calculator.getWholeListAddedWithFactor(2));
    }
}
