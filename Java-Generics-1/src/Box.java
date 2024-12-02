public class Box<T> {
    private T t; // T stands for Type

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    // Static generic method
    public static <U> void printBox(Box<U> box) {
        System.out.println("Box contains: " + box.get());
    }

    // Non-static method using wildcard
    public void printBoxWildcard(Box<? extends Number> box) {
        System.out.println("Box contains: " + box.get());
    }
}


// NumberBox class restricted to numbers
class NumberBox<N extends Number> extends Box<N> {
    // Additional functionality can be added for numeric types
}

// Generic interface Processor
interface Processor<T> {
    T process(T input);
}

// Implementation for Strings
class StringProcessor implements Processor<String> {
    @Override
    public String process(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
