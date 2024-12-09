import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class StreamExampleTest {

    @Test
    void testFilterEvenNumbers_NormalCase() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> expected = Arrays.asList(2, 4, 6);
        assertEquals(expected, StreamExample.filterEvenNumbers(numbers));
    }

    @Test
    void testMapToSquares_NormalCase() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(1, 4, 9);
        assertEquals(expected, StreamExample.mapToSquares(numbers));
    }

    @Test
    void testMapOddToCubes_NormalCase() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> expected = Arrays.asList(1, 27);
        assertEquals(expected, StreamExample.mapOddToCubes(numbers));
    }

    @Test
    void testSumNumbers_NormalCase() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int expected = 15;
        assertEquals(expected, StreamExample.sumNumbers(numbers));
    }

    @Test
    void testFlattenList_NormalCase() {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5)
        );
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, StreamExample.flattenList(listOfLists));
    }

    @Test
    void testGroupByEvenOdd_NormalCase() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Map<String, List<Integer>> expected = Map.of(
                "Even", Arrays.asList(2, 4),
                "Odd", Arrays.asList(1, 3, 5)
        );
        assertEquals(expected, StreamExample.groupByEvenOdd(numbers));
    }

    @Test
    void testFilterPeopleOlderThan25_NormalCase() {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 24),
                new Person("Charlie", 28)
        );
        List<String> expected = Arrays.asList("Alice", "Charlie");
        assertEquals(expected, StreamExample.filterPeopleOlderThan25(people));
    }

    @Test
    void testFindOldestPeople_MultipleOldest() {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 30)
        );
        List<Person> oldestPeople = StreamExample.findOldestPeople(people);
        List<String> expectedNames = Arrays.asList("Alice", "Charlie");
        List<String> actualNames = new ArrayList<>();
        for (Person person : oldestPeople) {
            actualNames.add(person.getName());
        }
        assertEquals(expectedNames, actualNames);
    }

    // Edge Cases
    @Test
    void testFilterEvenNumbers_EmptyList() {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, StreamExample.filterEvenNumbers(numbers));
    }

    @Test
    void testFlattenList_EmptyList() {
        List<List<Integer>> listOfLists = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, StreamExample.flattenList(listOfLists));
    }

    @Test
    void testFindOldestPeople_NoPeople() {
        List<Person> people = new ArrayList<>();
        List<Person> expected = new ArrayList<>();
        assertEquals(expected, StreamExample.findOldestPeople(people));
    }
}
