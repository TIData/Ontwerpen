
import domein.CalculatorAdapter;

public class Main {

    public static void main(String[] args) {
        CalculatorAdapter calculator = new CalculatorAdapter(2, 3);
        long res = calculator.add();
        System.out.println(res);
    }
}
