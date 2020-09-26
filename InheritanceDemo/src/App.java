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
    }
}
