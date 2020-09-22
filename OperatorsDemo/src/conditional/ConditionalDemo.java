package conditional;

public class ConditionalDemo {
    public static void main(String[] args) {
        int a = 100;
        boolean b = a == a ? true : false;
        System.out.println(a + " equals " + a + "? " + b);
    }
}
