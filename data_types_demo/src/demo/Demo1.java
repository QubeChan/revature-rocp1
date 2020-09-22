package demo;

public class Demo1 {
    public static void main(String[] args) {
        /*
        Data type - where you are asking java to allocate some memory for you to hold some values within it

        Java provides 8 primitive data types with default values to it...

        dataType        size        defaultValue
        ----------------------------------------
        byte            1 byte          0
        short           2 bytes         0
        int             4 bytes         0
        long            8 bytes         0

        float           4 bytes         0.0000f
        double          8 bytes         0.0000d in java any decimal values will by default be considered as double

        char            2 bytes         '\u00000' (uni-code charset) supports 17 country languages
        boolean         1 bit           false
         */

        int x = 100;
        System.out.println("value of x = " + x);

        float f1 = 12.344f;
        System.out.println("value of f1 = " + f1);

        double d1 = 889.99;
        System.out.println("value of d1 = " + d1);

        String s = "Jason";
        System.out.println("Hello " + s);

        char c = 'H';
        System.out.println("value of c is " + c);

        long l = 1234567890L;
        System.out.println("value of l = " + l);

        boolean b = true;
        System.out.println("value of b is " + b);
    }
}
