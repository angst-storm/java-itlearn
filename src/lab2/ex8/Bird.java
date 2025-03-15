package lab2.ex8;

public class Bird extends Animal {
    private final boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Чирик-чирик!");
    }

    public void fly() {
        if (canFly) {
            System.out.println("Птичка улетела.");
        } else {
            System.out.println("Эта птичка не умеет летать.");
        }
    }
}
