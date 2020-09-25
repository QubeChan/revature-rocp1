package wrapperDemo;

public class IntegerWrapper {
    public static void main(String[] args) {
        Integer i1 = 1337, // common pool
                i2 = 1337, // common pool
                i3 = new Integer(1337), // heap
                i4 = 404; // common pool

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("i4 = " + i4);
        System.out.println("i1 == i2 : " + (i1 == i2)); // output: false
        System.out.println("i1 == i3 : " + (i1 == i3)); // output: false
        System.out.println("i3 == i4 : " + (i3 == i4)); // output: false
        System.out.println("i1 == i3 : " + (i1 == i4)); // output: false
        System.out.println("i1.equals(i2) : " + i1.equals(i2)); // output: true
        System.out.println("i1.equals(i3) : " + i1.equals(i3)); // output: true
        System.out.println("i3.equals(i4) : " + i3.equals(i4)); // output: false
        System.out.println("i1.equals(i4) : " + i1.equals(i4)); // output: false
        System.out.println("i1.compareTo(1337) : " + i1.compareTo(1337)); // output: 0
        System.out.println("i1.compareTo(404) : " + i1.compareTo(404)); // output: 1
        System.out.println("i1.compareTo(8888) : " + i1.compareTo(8888)); // output: -1
    }
}
