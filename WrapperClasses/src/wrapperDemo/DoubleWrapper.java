package wrapperDemo;

public class DoubleWrapper {
    public static void main(String[] args) {
        Double d1 = 1.0002,
                d2 = 1.0002,
                d3 = new Double(1.0002),
                d4 = 2.0001;

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        System.out.println("d4 = " + d4);
        System.out.println("d1 == d2 : " + (d1 == d2)); // output: false
        System.out.println("d1 == d3 : " + (d1 == d3)); // output: false
        System.out.println("d3 == d4 : " + (d3 == d4)); // output: false
        System.out.println("d1 == d3 : " + (d1 == d4)); // output: false
        System.out.println("d1.equals(c2) : " + d1.equals(d2)); // output: true
        System.out.println("d1.equals(c3) : " + d1.equals(d3)); // output: true
        System.out.println("d3.equals(c4) : " + d3.equals(d4)); // output: false
        System.out.println("d1.equals(c4) : " + d1.equals(d4)); // output: false
        System.out.println("d1.compareTo(1.0002) : " + d1.compareTo(1.0002)); // output: 0
        System.out.println("d1.compareTo(c2) : " + d1.compareTo(d2)); // output: 0
        System.out.println("d1.compareTo(c3) : " + d1.compareTo(d3)); // output: 0
        System.out.println("d1.compareTo(c4) : " + d1.compareTo(d4)); // output: -1
    }
}
