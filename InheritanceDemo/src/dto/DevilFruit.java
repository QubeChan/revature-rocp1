package dto;

public class DevilFruit {
    private String name, desc;

    public DevilFruit(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Devil Fruit: " + name
                + "\nDescription: " + desc;
    }
}
