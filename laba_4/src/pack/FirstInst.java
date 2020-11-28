package pack;

class FirstInst implements Nameable {

    private String name;

    FirstInst(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(name);
    }
}
