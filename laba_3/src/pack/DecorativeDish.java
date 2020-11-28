package pack;

public class DecorativeDish extends Dish{

    private int mark;

    public DecorativeDish(String name, String brand, int mark){
        super(name, brand);
        this.mark = mark;
    }

    public void displayInfo(){
        System.out.print("{Декоративная посуда}\nБренд: " + super.getBrand() + " Наименование: " + super.getName() + " Маркировка: " + mark);
    }
}