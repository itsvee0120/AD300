import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> isEmpty = str -> str.isEmpty();

        System.out.println("Is empty: " + isEmpty.test("")); // true
        System.out.println("Is empty: " + isEmpty.test("Hello")); // false
    }
}
