import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Task 1: Initialize a list of integers from 1 to 10
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Task 2: Filter even numbers
        System.out.println("Even Numbers:");
        List<Integer> evenNumbers = StreamExample.filterEvenNumbers(numbers);
        System.out.println(evenNumbers);

        // Task 3: Map numbers to their squares
        System.out.println("\nSquared Numbers:");
        List<Integer> squaredNumbers = StreamExample.mapToSquares(numbers);
        System.out.println(squaredNumbers);

        // Task 4: Map odd numbers to their cubes
        System.out.println("\nCubed Odd Numbers:");
        List<Integer> cubedOddNumbers = StreamExample.mapOddToCubes(numbers);
        System.out.println(cubedOddNumbers);

        // Task 5: Sum of all numbers
        System.out.println("\nSum of Numbers:");
        int sum = StreamExample.sumNumbers(numbers);
        System.out.println(sum);

        // Task 6: Flatten a list of lists
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7)
        );
        System.out.println("\nFlattened List:");
        List<Integer> flattenedList = StreamExample.flattenList(listOfLists);
        System.out.println(flattenedList);

        // Task 7: Group numbers by even and odd
        System.out.println("\nGrouped by Even and Odd:");
        Map<String, List<Integer>> groupedByEvenOdd = StreamExample.groupByEvenOdd(numbers);
        groupedByEvenOdd.forEach((key, value) -> System.out.println(key + ": " + value));

        // Task 8: Filter people older than 25
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 24),
                new Person("Charlie", 28),
                new Person("David", 35),
                new Person("Eve", 22),
                new Person("Jay", 35)
        );
        System.out.println("\nPeople older than 25:");
        List<String> peopleOlderThan25 = StreamExample.filterPeopleOlderThan25(people);
        System.out.println(peopleOlderThan25);

        // Task 9: Find the oldest people
        System.out.println("\nOldest People:");
        List<Person> oldestPeople = StreamExample.findOldestPeople(people);
        oldestPeople.forEach(person -> System.out.println(person.getName() + " (Age: " + person.getAge() + ")"));
    }
}
