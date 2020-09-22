package arithemetic;

public class ArithemeticDemo {

    public static void main(String[] args) {
        int intA = 10;
        int intB = 4;

        float floatA = 10.0f;
        float floatB = 4.0f;

        double doubleA = 10.101;
        double doubleB = 4.101;

        ArithemeticDemo a = new ArithemeticDemo();
        System.out.println("Arithemetic Demo");
//        printing out addition
        System.out.println("\nDisplaying addition:");
        System.out.println(intA + " + " + intB + " = " + a.add(intA, intB));
        System.out.println(floatA + " + " + floatB + " = " + a.add(floatA, floatB));
        System.out.println(doubleA + " + " + doubleB + " = " + a.add(doubleA, doubleB));

//        printing out subtraction
        System.out.println("\nDisplaying subtraction:");
        System.out.println(intA + " - " + intB + " = " + a.subtract(intA, intB));
        System.out.println(floatA + " - " + floatB + " = " + a.subtract(floatA, floatB));
        System.out.println(doubleA + " - " + doubleB + " = " + a.subtract(doubleA, doubleB));

//        printing out multiplication
        System.out.println("\nDisplaying multiplication:");
        System.out.println(intA + " * " + intB + " = " + a.multiply(intA, intB));
        System.out.println(floatA + " * " + floatB + " = " + a.multiply(floatA, floatB));
        System.out.println(doubleA + " * " + doubleB + " = " + a.multiply(doubleA, doubleB));

//        printing out division
        System.out.println("\nDisplaying division:");
        System.out.println(intA + " / " + intB + " = " + a.divide(intA, intB));
        System.out.println(floatA + " / " + floatB + " = " + a.divide(floatA, floatB));
        System.out.println(doubleA + " / " + doubleB + " = " + a.divide(doubleA, doubleB));

//        printing out modulus
        System.out.println("\nDisplaying modulus:");
        System.out.println(intA + " % " + intB + " = " + a.modulus(intA, intB));
        System.out.println(floatA + " % " + floatB + " = " + a.modulus(floatA, floatB));
        System.out.println(doubleA + " % " + doubleB + " = " + a.modulus(doubleA, doubleB));

//        printing out increment
        System.out.println("\nDisplaying increment:");
        System.out.println(intA + "++ = " + a.increment(intA));
        System.out.println(floatA + "++ = " + a.increment(floatA));
        System.out.println(doubleA + "++ = " + a.increment(doubleA));

//        printing out decrement
        System.out.println("\nDisplaying decrement:");
        System.out.println(intA + "-- = " + a.decrement(intA));
        System.out.println(floatA + "-- = " + a.decrement(floatA));
        System.out.println(doubleA + "-- = " + a.decrement(doubleA));
    }

    //    addition
    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    //    subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    public float subtract(float a, float b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    //    multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    //    division
    public int divide(int a, int b) {
        return a / b;
    }

    public float divide(float a, float b) {
        return a / b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    //    modulus
    public int modulus(int a, int b) {
        return a % b;
    }

    public float modulus(float a, float b) {
        return a % b;
    }

    public double modulus(double a, double b) {
        return a % b;
    }

    //    increment
    public int increment(int a) {
        return a++;
    }

    public float increment(float a) {
        return a++;
    }

    public double increment(double a) {
        return a++;
    }

    //    decrement
    public int decrement(int a) {
        return a--;
    }

    public float decrement(float a) {
        return a--;
    }

    public double decrement(double a) {
        return a--;
    }
}
