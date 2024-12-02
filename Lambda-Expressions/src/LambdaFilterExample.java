import java.util.*;

public class LambdaFilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filtering even numbers using lambda expression
        numbers.stream()
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);  // Prints odd numbers
    }
}
