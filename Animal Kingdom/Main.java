import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //----------New Objects-------------//
        Dog dog = new Dog("Benji", 7);
        Cat cat = new Cat("Ash", 3);
        Fish fish = new Fish("Goldie", 1);
        Bird bird = new Bird("Frankie", 4);

        //---------Store Animals in ArrayList -----------//
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(fish);
        animals.add(bird);

        //---------------Loop through the Animals---------------/
        for (Animal animal : animals) {
            animal.displayInfo();
            System.out.println(animal.getEat());
            System.out.println(animal.getSleep());
            animal.makeSound();


            if (animal instanceof Dog) {
                ((Dog) animal).fetch();
            } else if (animal instanceof Cat) {
                ((Cat) animal).scratch();
            } else if (animal instanceof Fish) {
                ((Move) animal).move();
            } else if (animal instanceof Bird) {
                ((Bird) animal).preening();
                ((Bird) animal).fly();
            }

            System.out.println();
        }
    }
}
