package animals;

public class Cheetah extends Animal {

    public Cheetah(String name, int age) {
        super(name, age);
    }

    @Override
    public String getEat() {
        return "Mainly eats small to medium-sized ungulates.";
    }

    @Override
    public String getSleep() {
        return "Sleeps for about 12 hours a day.";
    }

    @Override
    public String getType() {
        return "Cheetah (Acinonyx jubatus)";
    }

    @Override
    public String makeSound() {
        return name + " makes a unique chirping sound!";
    }

    public String sprint() {
        return name + " is sprinting at high speed!";
    }
}
