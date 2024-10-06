package animals;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String getEat() {
        return "Mainly eats meat (fish, etc.)";
    }

    @Override
    public String getSleep() {
        return "Mainly sleeps at night.";
    }

    @Override
    public String getType(){return "Cat (Persian)";};

    @Override
    public String makeSound() {
        return name + " meows Meow Meow!";
    }

    public String scratch() {
        return name + " is scratching the tree.";
    }
}
