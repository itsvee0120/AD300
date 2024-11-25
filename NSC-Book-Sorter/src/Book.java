import java.util.*;

// Book class
public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int year;

    // Constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    // toString method for displaying book details
    @Override
    public String toString() {
        return String.format("Title: %s, Author: %s, Year: %d", title, author, year);
    }

    // Default sorting by title (implements Comparable interface)
    @Override
    public int compareTo(Book other) {
        return this.title.compareToIgnoreCase(other.title); // Case-insensitive comparison
    }
}

// Comparators for custom sorting
class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getAuthor().compareToIgnoreCase(b2.getAuthor());
    }
}

class YearComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return Integer.compare(b2.getYear(), b1.getYear()); // Newer books first
    }
}

class AuthorThenTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        int authorComparison = b1.getAuthor().compareToIgnoreCase(b2.getAuthor());
        if (authorComparison != 0) {
            return authorComparison;
        }
        return b1.getTitle().compareToIgnoreCase(b2.getTitle());
    }
}

