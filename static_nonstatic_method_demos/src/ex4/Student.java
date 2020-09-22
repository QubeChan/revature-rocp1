package ex4;

public class Student {

    int id;
    String name;
    int age;
    public final static String COLLEGE = "Revature College";

    public void printStudent(){
        System.out.println("System ID : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Student Age : " + age);
        System.out.println("Student College : " + COLLEGE);
    }
}
