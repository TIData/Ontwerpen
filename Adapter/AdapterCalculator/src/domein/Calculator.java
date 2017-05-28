package domein;

import calcLibrary.*;

public class Calculator implements TargetLong {

    private TargetDouble calculator;

    public Calculator(long x, long y) {
        calculator = new CalculatorLibrary(x, y);
    }

    public long add() {
        return (long) calculator.add();
    }
}
