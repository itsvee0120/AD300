import java.util.ArrayList;
import java.util.List;

// Generic Library class
class Library<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public T findItemByName(String name) {
        for (T item : items) {
            if (item.toString().contains(name)) {
                return item;
            }
        }
        return null;
    }

    public void printItems() {
        System.out.println("Library items:");
        for (T item : items) {
            System.out.println("-" + item);
        }
    }
}
