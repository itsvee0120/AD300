import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, String> toUpperCase = str -> str.toUpperCase();

        System.out.println(toUpperCase.apply("hello")); // Output: HELLO
    }
}
