package animals;
public class Fish extends Move {

    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public String getEat() {
        return "Mainly eats micro organisms, other fish, etc.";
    }

    @Override
    public String getSleep() {
        return "Can sleep at night or during the day.";
    }
}
