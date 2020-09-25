package wrapperDemo;

public class FloatWrapper {
    public static void main(String[] args) {
        Float f1 = 0.1f,
                f2 = 0.1f,
                f3 = new Float(0.1f),
                f4 = 0.2f;

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4);
        System.out.println("f1 == f2 : " + (f1 == f2)); // output: false
        System.out.println("f1 == f3 : " + (f1 == f3)); // output: false
        System.out.println("f3 == f4 : " + (f3 == f4)); // output: false
        System.out.println("f1 == f3 : " + (f1 == f4)); // output: false
        System.out.println("f1.equals(f2) : " + f1.equals(f2)); // output: true
        System.out.println("f1.equals(f3) : " + f1.equals(f3)); // output: true
        System.out.println("f3.equals(f4) : " + f3.equals(f4)); // output: false
        System.out.println("f1.equals(f4) : " + f1.equals(f4)); // output: false
        System.out.println("f1.compareTo(0.1f) : " + f1.compareTo(0.1f)); // output: 0
        System.out.println("f1.compareTo(f2) : " + f1.compareTo(f2)); // output: 0
        System.out.println("f1.compareTo(f3) : " + f1.compareTo(f3)); // output: 0
        System.out.println("f1.compareTo(f4) : " + f1.compareTo(f4)); // output: -1
    }
}
