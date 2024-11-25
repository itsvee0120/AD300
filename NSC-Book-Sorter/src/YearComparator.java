import java.util.Comparator;

public class YearComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return Integer.compare(book2.getYear(), book1.getYear()); // Newer books first
    }
}
