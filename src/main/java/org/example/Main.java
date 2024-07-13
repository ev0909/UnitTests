package org.example;

public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        try {
            int c = calc.devide.apply(a, b); // Арефметичесукая ошибка. На ноль делить нельзя.
            calc.println.accept(c);

        } catch (ArithmeticException exception) {
            System.out.println("На ноль делить нельзя.");
        }
    }
}

