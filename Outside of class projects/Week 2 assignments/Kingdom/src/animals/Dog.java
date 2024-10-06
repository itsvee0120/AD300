package animals;
public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String getEat() {
        return "Mainly eats meat (beef, etc.)";
    }

    @Override
    public String getSleep() {
        return "Mainly sleeps at night.";
    }

    @Override
    public String getType(){return "Dog (Yorkie)";};

    @Override
    public String makeSound() {
        return name + " barks Woof Woof!";
    }

    public String fetch() {
        return name + " is fetching the ball.";
    }
}
