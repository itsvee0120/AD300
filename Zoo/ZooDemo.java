import java.util.ArrayList;

public class ZooDemo {
    public static void main(String[] args) {

        // Instantiate new objects
        Lion lion = new Lion("Maddie");
        Elephant elephant = new Elephant("Del");
        Monkey monkey = new Monkey("Robin");

        // Instantiate an Arraylist
        //Add animals in the array list
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(lion);
        zoo.add(elephant);
        zoo.add(monkey);

        // Loop through the Zoo collection
        for(Animal animals : zoo){

            System.out.println(animals.getName() + " makes a sound like this: ");
            animals.makeSound();
            System.out.println();

            System.out.println(animals.getName() + " can make multiple sounds like this:");
            animals.makeSound(3);
            System.out.println();
            System.out.println();

        }


    }


}