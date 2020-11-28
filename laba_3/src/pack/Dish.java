package pack;

public abstract class Dish {

    private String brand;
    private String name;

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public Dish(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public abstract void displayInfo();
}