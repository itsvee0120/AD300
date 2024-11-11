import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListIterationTest {

    @Test
    public void testCalculateSum() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int sum = ArrayListIteration.calculateSum(numbers);
        assertEquals(15, sum, "The sum should be 15.");
    }

    @Test
    public void testRemoveEvenNumbers() {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        List<Integer> result = ArrayListIteration.removeEvenNumbers(numbers);
        assertEquals(List.of(1, 3, 5), result, "Even numbers should be removed.");
    }

    @Test
    public void testAddElementsBasedOnCondition() {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 6));
        List<Integer> result = ArrayListIteration.addElementsBasedOnCondition(numbers);
        assertEquals(List.of(1, 2, 3, 4, 6, 99, 99), result, "The number 99 should be added when the number is divisible by 3.");
    }

    @Test
    public void testEmptyList() {
        List<Integer> numbers = new ArrayList<>();
        int sum = ArrayListIteration.calculateSum(numbers);
        assertEquals(0, sum, "The sum of an empty list should be 0.");

        List<Integer> result = ArrayListIteration.removeEvenNumbers(numbers);
        assertEquals(new ArrayList<>(), result, "The list should still be empty after removing even numbers.");

        List<Integer> resultAfterAdd = ArrayListIteration.addElementsBasedOnCondition(numbers);
        assertEquals(new ArrayList<>(), resultAfterAdd, "The list should remain empty after adding elements.");
    }

    @Test
    public void testListWithOnlyEvenNumbers() {
        List<Integer> numbers = new ArrayList<>(List.of(2, 4, 6, 8));
        List<Integer> result = ArrayListIteration.removeEvenNumbers(numbers);
        assertEquals(new ArrayList<>(), result, "All even numbers should be removed.");

        List<Integer> resultAfterAdd = ArrayListIteration.addElementsBasedOnCondition(numbers);
        assertEquals(List.of(), resultAfterAdd, "New elements (99) should be added when divisible by 3.");
    }

    @Test
    public void testListWithOnlyOddNumbers() {
        List<Integer> numbers = new ArrayList<>(List.of(1, 3, 5, 7, 9));
        List<Integer> result = ArrayListIteration.removeEvenNumbers(numbers);
        assertEquals(List.of(1, 3, 5, 7, 9), result, "No numbers should be removed if they are all odd.");

        List<Integer> resultAfterAdd = ArrayListIteration.addElementsBasedOnCondition(numbers);
        assertEquals(List.of(1, 3, 5, 7, 9, 99, 99), resultAfterAdd, "New elements (99) should be added for numbers divisible by 3.");
    }
}
