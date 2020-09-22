package type_casting_example;

public class TypeCastingDemo {
    public static void main(String[] args) {
        /*
        Type Casting
        Conversion of 1 data type to another is known as typecasting

        1) Implicit Casting (taken care by compiler itself) - when we assign smaller
        data type to larger data type. Please note that all the number family
        like(int, short, long & byte) are considered as smaller than float & double

        2) Explicit Casting (programmer should do it) - when we convert larger type to the smaller
        data type it's called as explicit casting
         */

        int x = 1000; // 4 bytes

        double d1 = x; // double is 8 bytes //implicit casting done by compiler

        System.out.println("Value of d1 = " + d1);

        float f1 = x; // float is 4 bytes still it is considered larger than int & long so this is done implicitly
        System.out.println("Value of f1 = " + f1);

        char c = 'A'; // 2 bytes

        int y = c; // 4 bytes implicit
        System.out.println("Value of y = " + y);

        y = 100; // 4 bytes
        c = (char) y; // 4 bytes to 2 bytes explicit casting done by programmer
        System.out.println("value of c after explicit casting is : " + c);

        float f = 99.88f;
        int z = (int) f;
        System.out.println("value of z is " + z);
    }
}
