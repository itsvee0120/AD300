import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {

    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    public static List<Integer> mapToSquares(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    public static List<Integer> mapOddToCubes(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n * n)
                .collect(Collectors.toList());
    }

    public static int sumNumbers(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, Integer::sum);
    }

    public static List<Integer> flattenList(List<List<Integer>> listOfLists) {
        return listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    public static Map<String, List<Integer>> groupByEvenOdd(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));
    }

    public static List<String> filterPeopleOlderThan25(List<Person> people) {
        return people.stream()
                .filter(p -> p.getAge() > 25)
                .map(Person::getName)
                .collect(Collectors.toList());
    }

    public static List<Person> findOldestPeople(List<Person> people) {
        int maxAge = people.stream()
                .mapToInt(Person::getAge)
                .max()
                .orElse(-1);
        return people.stream()
                .filter(person -> person.getAge() == maxAge)
                .collect(Collectors.toList());
    }
}
