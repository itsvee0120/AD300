public class StringOperationExample {
    public static void main(String[] args) {
        // Concatenate two strings
        StringOperation concat = (s1, s2) -> s1 + s2;
        System.out.println("Concatenation: " + concat.apply("Hello ", "World!"));

        // Find the longer string
        StringOperation longerString = (s1, s2) -> s1.length() >= s2.length() ? s1 : s2;
        System.out.println("Longer string: " + longerString.apply("Hello", "World!"));
    }
}
