package pack;

public class Dinnerware extends Dish {

    private String material;

    public Dinnerware(String name, String brand, String material){
        super(name, brand);
        this.material = material;
    }

    public void displayInfo(){
        System.out.print("{Столовая посуда}\nБренд: " + super.getBrand() + " Наименование: " + super.getName() + " Материал: " + material);
    }
}
