package wrapperDemo;

public class LongWrapper {
    public static void main(String[] args) {
        Long l1 = 12345L,
                l2 = 12345L,
                l3 = new Long(12345L),
                l4 = 54321L;

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);
        System.out.println("l3 = " + l3);
        System.out.println("l4 = " + l4);
        System.out.println("l1 == l2 : " + (l1 == l2)); // output: false
        System.out.println("l1 == l3 : " + (l1 == l3)); // output: false
        System.out.println("l3 == l4 : " + (l3 == l4)); // output: false
        System.out.println("l1 == l3 : " + (l1 == l4)); // output: false
        System.out.println("l1.equals(l2) : " + l1.equals(l2)); // output: true
        System.out.println("l1.equals(l3) : " + l1.equals(l3)); // output: true
        System.out.println("l3.equals(l4) : " + l3.equals(l4)); // output: false
        System.out.println("l1.equals(l4) : " + l1.equals(l4)); // output: false
        System.out.println("l1.compareTo(12345L) : " + l1.compareTo(12345L)); // output: 0
        System.out.println("l1.compareTo(c2) : " + l1.compareTo(l2)); // output: 0
        System.out.println("l1.compareTo(c3) : " + l1.compareTo(l3)); // output: 0
        System.out.println("l1.compareTo(c4) : " + l1.compareTo(l4)); // output: -1
    }
}
