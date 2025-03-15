package lab2.ex4;

public class Person {
    private String name;
    private int age;
    private boolean male;

    public Person(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean male) {
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return male;
    }

    public static void main(String[] args) {
        Person person = new Person("Иван", 30, true);

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.isMale());

        person.setName("Анна");
        person.setAge(25);
        person.setGender(false);

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.isMale());
    }
}
