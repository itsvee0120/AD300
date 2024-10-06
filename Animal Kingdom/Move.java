public class Move extends Animal {
    public Move(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " blows bubbles Blop Blop!");
    }


    public void move() {
        System.out.println(name + " swims with fins.");
    }
}
