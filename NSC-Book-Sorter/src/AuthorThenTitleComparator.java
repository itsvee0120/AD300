import java.util.Comparator;

// Comparator for sorting by Author, then Title
public class AuthorThenTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        // First compare by author
        int authorComparison = book1.getAuthor().compareTo(book2.getAuthor());

        // If authors are the same, compare by title
        if (authorComparison == 0) {
            return book1.getTitle().compareTo(book2.getTitle());
        }

        return authorComparison;
    }
}
