package calculator;

public class SimpleCalc {
    private double value;
    public void plus(int a, int b) {
        value = a+b;
    }

    public double getValue() {
        return value;
    }
}
