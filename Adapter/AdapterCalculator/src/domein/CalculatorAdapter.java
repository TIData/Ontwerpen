package domein;

import calcLibrary.*;

public class CalculatorAdapter implements TargetLong {

    private TargetDouble calculator;

    public CalculatorAdapter(long x, long y) {
        calculator = new CalculatorLibrary(x, y);
    }

    @Override
    public long add() {
        return (long) calculator.add();
    }
}
