package Hard;

public class Potion extends Item {
    public Potion(String name, int quantity) {
        super(name, quantity);
    }

    @Override
    void use() {
        quantity--;
        System.out.println("You drank a potion!");
    }
}
