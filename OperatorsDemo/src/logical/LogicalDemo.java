package logical;

public class LogicalDemo {
    public static void main(String[] args) {

        LogicalDemo l = new LogicalDemo();
        System.out.println("Logical Demo");
        System.out.println("true and false = " + l.logAnd(true, false));
        System.out.println("true or false = " + l.logOr(true, false));
        System.out.println("!true = " + l.logNot(true));
    }

    public boolean logAnd(boolean a, boolean b) {
        return a && b;
    }

    public boolean logOr(boolean a, boolean b) {
        return a || b;
    }

    public boolean logNot(boolean a) {
        return !a;
    }
}
