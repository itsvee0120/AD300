public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String getEat() {
        return "Mainly eats meat: fish, etc.";
    }

    @Override
    public String getSleep() {
        return "Mainly sleeps at night.";
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows Meow Moew!");
    }

    public void scratch() {
        System.out.println(name + " is scratching the tree.");
    }
}
