package ex1;

public class Calculator {
    public static void calculatorStatic() {
        System.out.println("Hello from Calculator's class calculatorStatic() method");
    }

    public void calculatorNonStatic() {
        System.out.println("Hello from Calculator's class calculatorNonStatic() method");
    }

    public int add(int a, int b) {
        int res = a + b;
        return res;
    }

    public int add(int a, int b, int c) {
        int res = a + b + c;
        return res;
    }

    public float add(float a, float b) {
        float res = a + b;
        return res;
    }

    public float divide(float a, float b) {
        float res = a / b;
        return res;
    }

//    add is overloaded above - 3 types of add with unique arguments
}
