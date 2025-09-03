package Hard;

public class Weapon extends Item {
    public Weapon(String name, int quantity) {
        super(name, quantity);
    }

    @Override
    void use() {
        System.out.println("You attacked with the weapon!");
    }
}
