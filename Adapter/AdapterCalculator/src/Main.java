

import domein.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(2, 3);
        long res = calculator.add();
        System.out.println(res);
    }
}