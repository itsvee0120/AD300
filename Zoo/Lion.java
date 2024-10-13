public class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void makeSound() {
        System.out.print(" Roar");
    }
}
