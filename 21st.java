public class Main {
    static int addIntegers(int a, int b) {
        return a + b;
    }
    
    static double addDoubles(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        int resultInt = addIntegers(12, 7);
        double resultDouble = addDoubles(3.14, 2.71);
        System.out.println("int: " + resultInt);
        System.out.println("double: " + resultDouble);
    }
}
