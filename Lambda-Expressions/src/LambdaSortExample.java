import java.util.*;

public class LambdaSortExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Alex", "Sophia");

        // Sorting using lambda expression
        names.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted List: " + names);
    }
}
