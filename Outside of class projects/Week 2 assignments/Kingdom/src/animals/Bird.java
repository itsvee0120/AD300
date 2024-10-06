package animals;
public class Bird extends Animal implements Flyable{

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public String getEat() {
        return "Mainly eats (fish, Mouse etc.)";
    }

    @Override
    public String getSleep() {
        return "Mainly sleeps during the day.";
    }

    @Override
    public String getType(){return "Bird (Owl)";};

    @Override
    public String makeSound() {
        return name + " Coos Coo Coo!";
    }

    public String preening() {
        return name + " is preening itself.";
    }

    @Override
    public String fly() {
        return name + " can fly.";
    }
}