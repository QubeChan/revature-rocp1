import inventory.Product;

public class App {
    public static void main(String[] args) {
        Product product = new Product(1,"Coke",5.00,1.50);
        System.out.println(product.toString());
    }
}
