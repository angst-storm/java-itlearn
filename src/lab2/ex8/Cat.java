package lab2.ex8;

public class Cat extends Animal {
    private final String foodType;

    public Cat(String name, int age, String foodType) {
        super(name, age);
        this.foodType = foodType;
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }

    public String foodType() {
        return foodType;
    }
}
