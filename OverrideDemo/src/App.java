import dto.Employee;
import dto.Person;

public class App {
    public static void main(String[] args) {
        Person p = new Person("Cloud");
        System.out.println(p.toString());

        Employee e = new Employee("Tifa", 1);
        System.out.println(e.toString());

        p = new Employee("Cloud", 2);
        System.out.println(p.toString());

        System.out.println(e.equals(p)); // Output: false

        e.setId(2);

        System.out.println(p.toString());
        System.out.println(e.toString());

        System.out.println(e.equals(p)); // Output: true
    }
}
