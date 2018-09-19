package example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private ICalculatorService calculatorService;

    @Before
    public void setup() {
        this.calculatorService = new Calculator();
    }

    @Test
    public void calculatorAdditionNumbersFinishOk() {
        //GIVEN
        double numA = 0;
        double numB = 10;

        //WHEN
        double result = calculatorService.add(numA, numB);

        //THEN
        assertEquals(9d, result, 1d);
    }

    @Test
    public void calculatorAdditionNumbersFinishKo() {
        //GIVEN
        double numA = -0.00000000000000001;
        double numB = 1.00000000000000001;

        //WHEN
        double result = calculatorService.add(numA, numB);

        //THEN
        assertEquals(1, result, 0d);
    }
}