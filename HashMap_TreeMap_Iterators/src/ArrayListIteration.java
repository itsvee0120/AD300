import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ArrayListIteration {

    public static void main(String[] args) {
        // Creating a list with random numbers
        ArrayList<Integer> numbers = generateRandomNumbers(10);

        // Iteration and calculations
        int sum = calculateSum(numbers);
        System.out.println("Total sum: " + sum);

        // Removing even numbers
        List<Integer> numbersAfterRemoval = removeEvenNumbers(numbers);
        System.out.println("ArrayList after removing even numbers: " + numbersAfterRemoval);

        // Adding new elements
        List<Integer> numbersAfterAddition = addElementsBasedOnCondition(numbersAfterRemoval);
        System.out.println("ArrayList after adding new elements: " + numbersAfterAddition);
    }

    public static ArrayList<Integer> generateRandomNumbers(int size) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            numbers.add(rand.nextInt(100)); // Random integers between 0 and 99
        }
        return numbers;
    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static List<Integer> removeEvenNumbers(List<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        return numbers;
    }

    public static List<Integer> addElementsBasedOnCondition(List<Integer> numbers) {
        List<Integer> tempList = new ArrayList<>();
        for (int num : numbers) {
            if (num % 3 == 0) {
                tempList.add(99);
            }
        }
        numbers.addAll(tempList);
        return numbers;
    }
}
