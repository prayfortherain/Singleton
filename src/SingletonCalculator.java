public class SingletonCalculator {
    private static SingletonCalculator instance;
    private SingletonCalculator() {
    }
    public static SingletonCalculator getInstance() {
        if (instance == null) {
            instance = new SingletonCalculator();
        }
        return instance;
    }
    public double calculateExpression(double x, double y) {
        return 2 * x + 3 / y;
    }
}
