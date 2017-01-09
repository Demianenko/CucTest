package calculator;

/**
 * Created by user on 1/9/2017.
 */
public class SimpleCalc {
    private double value;
    public void plus(int a, int b) {
        value = a+b;
    }

    public double getValue() {
        return value;
    }
}
