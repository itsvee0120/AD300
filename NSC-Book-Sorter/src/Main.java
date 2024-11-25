import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Main class to test sorting
public class Main {
    public static void main(String[] args) {
        // Instantiate a list of books with the same authors for testing
        List<Book> books = new ArrayList<>();

        // Books by Harper Lee (out of alphabetical order)
        books.add(new Book("Go Set a Watchman", "Harper Lee", 2015));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));

        // Books by George Orwell (out of alphabetical order)
        books.add(new Book("Animal Farm", "George Orwell", 1945));
        books.add(new Book("1984", "George Orwell", 1949));

        // Books by Jane Austen (out of alphabetical order)
        books.add(new Book("Pride and Prejudice", "Jane Austen", 1813));
        books.add(new Book("Sense and Sensibility", "Jane Austen", 1811));

        // Books by F. Scott Fitzgerald (out of alphabetical order)
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        books.add(new Book("Tender Is the Night", "F. Scott Fitzgerald", 1934));

        // Books by Herman Melville (out of alphabetical order)
        books.add(new Book("Bartleby the Scrivener", "Herman Melville", 1853));
        books.add(new Book("Moby Dick", "Herman Melville", 1851));

        Collections.shuffle(books); // Randomized the books list order

        // Display books in random order before sorting
        System.out.println("Books in random order:");
        books.forEach(System.out::println);

        // Sorting by title (default sorting using Comparable)
        System.out.println("\nBooks sorted by Title:");
        Collections.sort(books); // Uses Comparable (sorting by title)
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
