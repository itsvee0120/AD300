package animals;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //----------New Objects-------------//
        Dog dog = new Dog("Benji", 7);
        Cat cat = new Cat("Ash", 3);
        Fish fish = new Fish("Goldie", 1);
        Bird bird = new Bird("Frankie", 4);
        Lion lion = new Lion("King", 5);
        Rabbit rabbit = new Rabbit("Moa", 1);
        Elephant elephant = new Elephant("Scott", 3);
        Cheetah cheetah = new Cheetah("Nyx", 2);

        //---------Store Animals in ArrayList -----------//
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(fish);
        animals.add(bird);
        animals.add(lion);
        animals.add(rabbit);
        animals.add(elephant);
        animals.add(cheetah);

        //---------------Loop through the Animals---------------//
        for (Animal animal : animals) {
            animal.displayInfo();  // Display general info for each animal
            System.out.println(animal.getEat());
            System.out.println(animal.getSleep());
            System.out.println(animal.makeSound());

            // Call specific behaviors based on the animal type
            if (animal instanceof Dog) {
                System.out.println(((Dog) animal).fetch());
            } else if (animal instanceof Cat) {
                System.out.println(((Cat) animal).scratch());
            } else if (animal instanceof Fish) {
                System.out.println(((Fish) animal).move());  // Assuming Fish has a move() method
            } else if (animal instanceof Bird) {
                System.out.println(((Bird) animal).preening());
                System.out.println(((Bird) animal).fly());
            } else if (animal instanceof Lion) {
                System.out.println(((Lion) animal).hunt());
            } else if (animal instanceof Elephant) {
                System.out.println(((Elephant) animal).bathe());
            } else if (animal instanceof Cheetah) {
                System.out.println(((Cheetah) animal).sprint());
            } else if (animal instanceof Rabbit) {
                System.out.println(((Rabbit) animal).hop());

            }

            // Additional behaviors for each animal can be added here as needed
            System.out.println();  // Blank line for better readability
        }
    }
}
