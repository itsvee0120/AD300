import java.util.Arrays;

public class Stack<T> {
    private Object[] stackArray;  // Array to hold stack elements
    private int size;             // The current number of elements in the stack
    private static final int INITIAL_CAPACITY = 10;

    // Constructor to initialize the stack with default size
    public Stack() {
        stackArray = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    // Push a new item onto the stack
    public void push(T item) {
        // Resize the array if necessary
        if (size == stackArray.length) {
            stackArray = Arrays.copyOf(stackArray, stackArray.length * 2);
        }
        stackArray[size++] = item;
    }

    // Pop an item from the stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        T item = (T) stackArray[--size];
        stackArray[size] = null;  // Avoid memory leak
        return item;
    }

    // Peek at the top item of the stack without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return (T) stackArray[size - 1];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Get the current size of the stack
    public int size() {
        return size;
    }


    public void printStack() {
        for (int i = 0; i < size; i++) {
            System.out.print(stackArray[i] + " ");  // Print each element
        }
        System.out.println();  // New line at the end
    }


}
