package animals;
public class Move extends Animal {
    public Move(String name, int age) {
        super(name, age);
    }

    @Override
    public String getType(){return "Fish (Gold Fish)";};

    @Override
    public String makeSound() {
        return name + " blows bubbles Blop Blop!";
    }


    public String move() {
        return name + " swims with fins.";
    }
}
