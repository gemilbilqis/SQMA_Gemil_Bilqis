public class Matematica {

    public int suma(int a, int b) {
        return a + b;
    }

    public int raport(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Division by zero");
        return a / b;
    }

    public boolean estePar(int a) {
        return a % 2 == 0;
    }
}