public abstract class Animal {

    // Instance variable
    protected String name;

    // Constructor to set name
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method that return nothing
    public abstract void makeSound();

    // Overloading makeSound
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            makeSound();
        }
    }

    // getter method
    public String getName() {
        return name;
    }


}


