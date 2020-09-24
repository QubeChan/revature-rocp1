import inventory.Product;

public class App {
    public static void main(String[] args) {
        Product coke = new Product(1, "Coke", 5.00, 1.50);
        Product sprite = new Product(2, "Sprite", 5.00, 1.5);
        System.out.println(coke.toString());
        System.out.println(sprite.toString());
    }
}
