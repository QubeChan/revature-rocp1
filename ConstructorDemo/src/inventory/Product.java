package inventory;

public class Product {
    private int id;
    private String name;
    private double rating,
            cost;


    public Product() {
//        default constructor
    }

    public Product(int id, String name, double rating, double cost) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.cost = cost;
    }

    public String toString() {
        return "Product info\nID: " + id + "\nName: " + name + "\nRating: " + rating + "\nCost: " + cost;
    }
}
