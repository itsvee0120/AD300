import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
            // Task 2: Initialize a list of integers from 1 to 10
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            // Task 3: Intermediate Operations
            // Filter out even numbers and print them
            System.out.println("Even Numbers:");
            numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .forEach(System.out::println);


            // Map the list of numbers to their squares and print the squared values.
            System.out.println("Squared Numbers:");
            numbers.stream()
                    .map(n -> n * n)
                    .forEach(System.out::println);

            // Filter out odd numbers and map them to their cubes
            System.out.println("\nCubed Odd Numbers:");
            numbers.stream()
                    .filter(n -> n % 2 != 0)
                    .map(n -> n * n * n)
                    .forEach(System.out::println);


            // Task 4: Terminal Operations
            // Use the reduce method to sum all the numbers
            int sum = numbers.stream()
                    .reduce(0, Integer::sum);
            System.out.println("\nSum of Numbers: " + sum);

            // Use the collect method to gather all even numbers into a new list
            List<Integer> evenNumbers = numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .collect(Collectors.toList());
            System.out.println("\nEven Numbers Collected: " + evenNumbers);


            // Task 5: Advanced Stream Operations
            // Use the flatMap method to flatten a list of lists into a single list
            List<List<Integer>> listOfLists = Arrays.asList(
                    Arrays.asList(1, 2, 3),
                    Arrays.asList(4, 5),
                    Arrays.asList(6, 7)
            );
            List<Integer> flattenedList = listOfLists.stream()
                    .flatMap(List::stream)
                    .collect(Collectors.toList());
            System.out.println("\nFlattened List: " + flattenedList);

            // Use the groupingBy collector to group numbers by even and odd
            Map<String, List<Integer>> groupedByEvenOdd = numbers.stream()
                    .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd")); //key is Even or Odd

            System.out.println("\nGrouped by Even and Odd:");
            groupedByEvenOdd.forEach((key, value) -> System.out.println(key + ": " + value));


            // Task 6: Stream with Custom Objects
            // Create a list of Person objects
            List<Person> people = Arrays.asList(
                    new Person("Alice", 30),
                    new Person("Bob", 24),
                    new Person("Charlie", 28),
                    new Person("David", 35),
                    new Person("Eve", 22),
                    new Person("Jay", 35)
            );

            // Filter out people older than 25 and print their names
            System.out.println("\nPeople older than 25:");
            people.stream()
                    .filter(p -> p.getAge() > 25)
                    .map(Person::getName)
                    .forEach(System.out::println);

            // Find the oldest person in the list
            Person oldestPerson = people.stream()
                    .max(Comparator.comparingInt(Person::getAge))
                    .orElse(null);
            System.out.println("\nOldest Person: " + (oldestPerson != null ? oldestPerson.getName() + " is " + oldestPerson.getAge() + " years old" : "None"));

            // Option 2
            int maxAge = people.stream()
                    .mapToInt(Person::getAge)
                    .max()
                    .orElse(-1); // Default to -1 if the list is empty

            List<Person> oldestPeople = people.stream()
                    .filter(person -> person.getAge() == maxAge)
                    .collect(Collectors.toList());

            System.out.println("\nOldest People:");
            oldestPeople.forEach(person -> System.out.println(person.getName() + " (Age: " + person.getAge() + ")"));


        }

    }
