package yesithv.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

/**
 * STREAMS:
 * Don't change the original data structure, only provide the result
 * Intermediate: filter(), map(), sorted()
 * Terminal: forEach(), collect(), match(), count(), reduce()
 * Short circuit: anyMatch(), findFirst()
 */
public class Fundamentals {
    public static void main(String[] args) {

        // Empty Stream
        Stream<String> streamEmpty = Stream.empty();
        streamEmpty.forEach(s -> System.out.println("s = " + s));

        // Stream of Collection
        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();
        streamOfCollection.forEach(System.out::println);

        // Stream of Array
        Stream<String> streamOfArray = Stream.of("x", "y", "z");
        String[] array = {"a", "b", "c"};
        Stream<String> streamOfArrayFull = Arrays.stream(array);

        //
    }
}
