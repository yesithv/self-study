package yesithv.java8.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntermediateOperations {
    public static void main(String[] args) {
        // List of list of names
        List<List<String>> listOfList = Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream"));

        // Create a set to hold intermediate results
        Set<String> intermediateResults = new HashSet<>();

        var finalResult = listOfList.stream()
                // Flattens the nested lists into a single stream of strings.
                .flatMap(list -> list.stream()) // (List::stream)
                // Filter elements starts with S
                .filter(word -> word.startsWith("S"))
                // Sort elements
                .sorted()
                // Inspect or Add elements, without modify
                .peek(word -> intermediateResults.add(word))
                // Remove duplicate elements
                .distinct()
                // Transform element to uppercase
                .map(String::toUpperCase)
                // Collect the final result into a list
                .collect(Collectors.toList());

        // Print intermediate Results:
        System.out.println("Intermediate result = ");
        intermediateResults.forEach(System.out::println);

        // Print final Result
        System.out.println("Final Result = " + finalResult);
        finalResult.forEach(s -> System.out.println(s));

        https://www.geeksforgeeks.org/stream-in-java/
        https://www.digitalocean.com/community/tutorials/java-8-stream

    }
}
