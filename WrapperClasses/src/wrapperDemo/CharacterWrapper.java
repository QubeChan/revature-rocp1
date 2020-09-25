package wrapperDemo;

public class CharacterWrapper {
    public static void main(String[] args) {
        Character c1 = 'a',
                c2 = 'a',
                c3 = new Character('a'),
                c4 = 'b';

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);
        System.out.println("c1 == c2 : " + (c1 == c2)); // output: true
        System.out.println("c1 == c3 : " + (c1 == c3)); // output: false
        System.out.println("c3 == c4 : " + (c3 == c4)); // output: false
        System.out.println("c1 == c3 : " + (c1 == c4)); // output: false
        System.out.println("c1.equals(c2) : " + c1.equals(c2)); // output: true
        System.out.println("c1.equals(c3) : " + c1.equals(c3)); // output: true
        System.out.println("c3.equals(c4) : " + c3.equals(c4)); // output: false
        System.out.println("c1.equals(c4) : " + c1.equals(c4)); // output: false
        System.out.println("c1.compareTo('a') : " + c1.compareTo('a')); // output: 0
        System.out.println("c1.compareTo(c2) : " + c1.compareTo(c2)); // output: 0
        System.out.println("c1.compareTo(c3) : " + c1.compareTo(c3)); // output: 0
        System.out.println("c1.compareTo(c4) : " + c1.compareTo(c4)); // output: -1
    }
}
