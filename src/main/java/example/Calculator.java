package example;

/**
 *
 */
class Calculator implements ICalculatorService {

    @Override
    public double add(double input1, double input2) {
        return input1 + input2;
    }

    public Double addWithDouble(Double input1, Double input2) {
        Double result = Double.MAX_VALUE;

        if (input1 == null) {
            return result;
        }

        if (input2 == null) {
            return result;
        }

        return input1 + input2;
    }

    @Override
    public double subtract(double input1, double input2) {
        return input1 - input2;
    }

    @Override
    public double multiply(double input1, double input2) {
        throw new UnsupportedOperationException("Method not implemented yet!");
    }

    @Override
    public double divide(double input1, double input2) {
        throw new UnsupportedOperationException("Method not implemented yet!");
    }
}
