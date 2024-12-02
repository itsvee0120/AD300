import java.util.function.Function;

public class FunctionCompositionExample {
    public static void main(String[] args) {
        // Add 1 and multiply by 10
        Function<Integer, Integer> add1 = x -> x + 1;
        Function<Integer, Integer> multiplyBy10 = x -> x * 10;

        // Composing functions
        Function<Integer, Integer> addThenMultiply = add1.andThen(multiplyBy10);
        System.out.println(addThenMultiply.apply(5));  // Output: 60 (5 + 1 = 6, 6 * 10 = 60)
    }
}
