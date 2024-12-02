public class Main {
    public static void main(String[] args) {
        // Box for different types
        System.out.println("\nTesting print Static vs print Wildcard:");
        // Box examples
        Box<Integer> intBox = new Box<>();
        intBox.set(42);

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.14);

        Box<String> strBox = new Box<>();
        strBox.set("Generics");

        // Using static method (requires specific type)
        System.out.println("Using static method:");
        Box.printBox(intBox);  // Box contains: 42
        Box.printBox(doubleBox);  // Box contains: 3.14


        // Using wildcard method (more flexible)
        System.out.println("\nUsing wildcard method:");
        intBox.printBoxWildcard(intBox);  // Box contains: 42
        doubleBox.printBoxWildcard(doubleBox);  // Box contains: 3.14

        // Wildcard method doesn't work for non-Number types
        // strBox.printBoxWildcard(strBox); // This will not compile because String is not a subtype of Number

        // This will not compile:
        //NumberBox<String> stringBox = new NumberBox<>();

        System.out.println("\nTesting Processors:");
        // Testing StringProcessor
        StringProcessor processor = new StringProcessor();
        String input = "Generics";
        String output = processor.process(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + output);

        System.out.println("\nTesting Book Library:");
        Library<String> bookLibrary = new Library<>();
        bookLibrary.addItem("The Great Gatsby");
        bookLibrary.addItem("1984");
        bookLibrary.addItem("To Kill a Mockingbird");

        bookLibrary.printItems();
        System.out.println("\nFinding '1984': " + bookLibrary.findItemByName("1984"));


        System.out.println("\nList after remove '1984':");
        bookLibrary.removeItem("1984");
        bookLibrary.printItems();

        System.out.println("\nDVD items added:");
        // DVD library
        Library<String> dvdLibrary = new Library<>();
        dvdLibrary.addItem("Inception");
        dvdLibrary.addItem("The Matrix");
        dvdLibrary.printItems();
    }
    }

