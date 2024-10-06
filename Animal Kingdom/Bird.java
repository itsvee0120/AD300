public class Bird extends Animal implements Flyable{

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public String getEat() {
        return "Mainly eats: fish, worms etc.";
    }

    @Override
    public String getSleep() {
        return "Mainly sleeps during the day.";
    }

    @Override
    public void makeSound() {
        System.out.println(name + " Coos Coo Coo!");
    }

    public void preening() {
        System.out.println(name + " is preening itself.");
    }

    @Override
    public void fly(){
        System.out.println(name + " can fly.");
    }
}
