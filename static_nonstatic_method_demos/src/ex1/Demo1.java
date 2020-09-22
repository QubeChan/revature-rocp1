package ex1;

import ex2.Animal;

public class Demo1 {
    public static void main(String[] args) {

//        ClassName obj = new Constructor();
        Demo1 d = new Demo1(); // dynamic memory allocation is happening in the heap
        d.helloNonStatic(); // execution
        d.helloNonStaticAgain();
        helloStatic(); // static method of same class

//        ClassName.methodName()
        Calculator.calculatorStatic(); // static method of different class

        Calculator c = new Calculator();
        c.calculatorNonStatic();
        int res = c.add(100, 299);
        System.out.println("result is " + res);
        System.out.println("result is " + c.add(9999, 99));

        Animal.helloAnimalStatic();
        Animal a = new Animal();
        a.helloAnimalNonStatic();
    }

    public void helloNonStatic() {
        System.out.println("Hello from non-static block");
    }

    public void helloNonStaticAgain() {
        System.out.println("Hello from non-static block again");
    }

    public static void helloStatic() {
        System.out.println("Hello from helloStatic() method");
    }

//    all the classes which falls under java.lang package will be imported directly... like eg : String, System
}
