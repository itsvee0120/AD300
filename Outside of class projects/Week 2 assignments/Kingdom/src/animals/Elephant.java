package animals;

public class Elephant extends Animal {

    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public String getEat() {
        return "Mainly eats grass, fruits, and bark.";
    }

    @Override
    public String getSleep() {
        return "Sleeps for about 4 to 5 hours a night.";
    }

    @Override
    public String getType() {
        return "Elephant (Loxodonta africana)";
    }

    @Override
    public String makeSound() {
        return name + " trumpets Trumpet!";
    }

    public String bathe() {
        return name + " is bathing in a waterhole.";
    }
}
