import dto.DevilFruit;
import dto.Pirate;
import dto.Person;
import dto.Weapon;

public class App {
    public static void main(String[] args) {
        Person p = new Person("Qube");
        System.out.println(p.toString());

        DevilFruit df = new DevilFruit("Gum-Gum Fruit", "Rubber human abilities");
        Weapon wpn = new Weapon("Hands and Feet", "Luffy likes to use his whole bodyy as his weapon");
        Pirate h = new Pirate("Luffy", 100, 100, df, wpn);
        System.out.println(h.toString());

//        Person q = new Pirate("Q",1,1,df,wpn);
//        Pirate x = (Pirate) new Person("E"); // Does not work will give a ClassCastException
//        System.out.println(q.toString());
//        System.out.println(x.toString());
    }
}
