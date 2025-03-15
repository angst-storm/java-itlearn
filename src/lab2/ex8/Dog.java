package lab2.ex8;

public class Dog extends Animal {
    private final String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }

    public String breed() {
        return breed;
    }
}
