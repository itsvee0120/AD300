import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class BookTest {

    private Book book1;
    private Book book2;
    private Book book3;

    @BeforeEach
    void setUp() {
        // Create some sample books
        book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        book3 = new Book("1984", "George Orwell", 1949);
    }

    @Test
    void testCompareTo_TitleComparison() {
        // Test default comparison (by title)
        assertTrue(book1.compareTo(book2) < 0); // "The Great Gatsby" < "To Kill a Mockingbird"
        assertTrue(book2.compareTo(book1) > 0); // "To Kill a Mockingbird" > "The Great Gatsby"
        assertEquals(0, book1.compareTo(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925))); // Same title
    }

    @Test
    void testAuthorComparator() {
        Comparator<Book> authorComparator = new AuthorComparator();

        // "F. Scott Fitzgerald" < "Harper Lee"
        assertTrue(authorComparator.compare(book1, book2) < 0);
        // "Harper Lee" > "George Orwell"
        assertTrue(authorComparator.compare(book2, book3) > 0);
        // Same author ("George Orwell")
        assertEquals(0, authorComparator.compare(book3, new Book("Animal Farm", "George Orwell", 1945)));
    }

    @Test
    void testYearComparator() {
        Comparator<Book> yearComparator = new YearComparator();

        // "To Kill a Mockingbird" (1960) > "1984" (1949)
        assertTrue(yearComparator.compare(book2, book3) < 0);
        // "1984" (1949) > "The Great Gatsby" (1925)
        assertTrue(yearComparator.compare(book3, book1) < 0);
        // Same year
        assertEquals(0, yearComparator.compare(new Book("Same Year Book", "Author", 1925), new Book("Another Same Year Book", "Author", 1925)));
    }

    @Test
    void testAuthorThenTitleComparator() {
        Comparator<Book> authorThenTitleComparator = new AuthorThenTitleComparator();

        // "F. Scott Fitzgerald" < "Harper Lee"
        assertTrue(authorThenTitleComparator.compare(book1, book2) < 0);
        // "Harper Lee" > "George Orwell"
        assertTrue(authorThenTitleComparator.compare(book2, book3) > 0);
        // Same author and title
        assertEquals(0, authorThenTitleComparator.compare(book1, new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925)));
    }
}
