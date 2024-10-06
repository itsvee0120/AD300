package animals;

public class Rabbit extends Animal {

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public String getEat() {
        return "Mainly eats carrots and leafy greens.";
    }

    @Override
    public String getSleep() {
        return "Sleeps during the day and is active at dusk.";
    }

    @Override
    public String getType() {
        return "Rabbit (Holland Lop)";
    }

    @Override
    public String makeSound() {
        return name + " squeaks Squeak Squeak!";
    }

    public String hop() {
        return name + " is hopping around.";
    }
}
