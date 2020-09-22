package relational;

public class RelationalDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        RelationalDemo r = new RelationalDemo();
        System.out.println("Relational Demo");
        System.out.println("a:" + a + " equal to b:" + b + " Result: " + r.equalTo(a,b));
        System.out.println("a:" + a + " not equal to b:" + b + " Result: " + r.notEqualTo(a,b));
        System.out.println("a:" + a + " greater than b:" + b + " Result: " + r.greaterThan(a,b));
        System.out.println("a:" + a + " less than b:" + b + " Result: " + r.lessThan(a,b));
        System.out.println("a:" + a + " greater than and equal to b:" + b + " Result: " + r.greaterThanAndEqualTo(a,b));
        System.out.println("a:" + a + " less than and equal to b:" + b + " Result: " + r.lessThanAndEqualTo(a,b));

    }

    public boolean equalTo(int a, int b) {
        return a == b;
    }

    public boolean notEqualTo(int a, int b) {
        return a != b;
    }

    public boolean greaterThan(int a, int b) {
        return a > b;
    }

    public boolean lessThan(int a, int b) {
        return a < b;
    }

    public boolean greaterThanAndEqualTo(int a, int b) {
        return a >= b;
    }

    public boolean lessThanAndEqualTo(int a, int b) {
        return a <= b;
    }
}
