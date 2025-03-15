package lab2.ex8;

public abstract class Animal {
    private final String name;
    private final int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void makeSound();

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Барон", 5, "Бернский Зенненхунд");
        dog.makeSound();
        System.out.println(dog.name());
        System.out.println(dog.breed());

        Cat cat = new Cat("Гав", 1, "Котлета");
        cat.makeSound();
        System.out.println(cat.foodType());

        Bird bird = new Bird("Кеша", 2, true);
        bird.makeSound();
        bird.fly();
    }
}
