import java.util.function.Supplier;

public class Main {
    Supplier<Calculator> instance = Calculator::new;

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b); // Возможно, возникновение ошибки, в случае если b = 0.
        calc.println.accept(c);
    }
}
