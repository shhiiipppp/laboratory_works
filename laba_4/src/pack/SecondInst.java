package pack;

public class SecondInst implements Nameable {

    private String name;

    SecondInst(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.print(name);
    }
}
