package animals;

public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public String getEat() {
        return "Mainly eats meat (zebras, wildebeests, etc.)";
    }

    @Override
    public String getSleep() {
        return "Sleeps for 16 to 20 hours a day.";
    }

    @Override
    public String getType() {
        return "Lion (Panthera leo)";
    }

    @Override
    public String makeSound() {
        return name + " roars Roar!";
    }

    public String hunt() {
        return name + " is hunting for prey.";
    }
}
