public class Main {
    public static void main(String[] args) {
        SingletonCalculator calculator = SingletonCalculator.getInstance();
        double result = calculator.calculateExpression(4, 3);
        System.out.println("Результат выражения 2*x + 3/y: " + result);
    }
}