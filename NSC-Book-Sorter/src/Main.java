import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Main class to test sorting
public class Main {
    public static void main(String[] args) {
        // Instantiate a list of books
        List<Book> books = new ArrayList<>();
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("1984", "George Orwell", 1949));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 1813));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        books.add(new Book("Moby Dick", "Herman Melville", 1851));

        // Default sorting by title
        System.out.println("Books sorted by Title:");
        Collections.sort(books); // Uses Comparable
        books.forEach(System.out::println);

        // Sorting by author
        System.out.println("\nBooks sorted by Author:");
        books.sort(new AuthorComparator());
        books.forEach(System.out::println);

        // Sorting by year (newest first)
        System.out.println("\nBooks sorted by Year:");
        books.sort(new YearComparator());
        books.forEach(System.out::println);

        // Sorting by author, then title
        System.out.println("\nBooks sorted by Author, then Title:");
        books.sort(new AuthorThenTitleComparator());
        books.forEach(System.out::println);
    }
}
