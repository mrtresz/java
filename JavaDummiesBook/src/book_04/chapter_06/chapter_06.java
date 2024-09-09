package book_04.chapter_06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;


public class chapter_06 {
//    Using Bulk Data Operations with Collections (STREAMS)

//    Streams bring functional programming to java, and are supported started in java 8;
//    The advantages of stream:
//            -they make you a more efficient programmer,
//            -they make use of lambda expressions,
//            -ParallelStreams make it very easy to multi-thread operations

//    A stream pipeline consists of a source, followed by zero or more intermediate operations; and a terminal operation

//    Stream Source - streams can be created from Collections, Lists,Sets, int ,long , doubles,arrays,lines of a file;

//    Stream operations are either intermediate or terminal;
//          -Intermediate operations such as filter, map ,sort return a stream so we can chain multiple intermediate operations
//          -Terminal operations such as forEach, collect or reduce are either void or return a non-stream result;

    public static void main(String[] args) throws IOException {
//        1. Integer Stream
//        IntStream
//                .range(1,10)
//                .forEach(x -> System.out.println(x));

//        IntStream
//                .range(1,10)
//                .skip(5)
//                .forEach(x -> System.out.println(x));
//        System.out.println();

//        System.out.println(
//                IntStream
//                        .range(1,5)
//                        .sum()
//
//        );

//        4.Stream.of , sorted, FindFirst
//        Stream.of("John", "Amari", "Mary")
//                .sorted()
//                .findFirst()
//                .ifPresent(System.out::println);

//        5.Stream from Array, sort, filter, and print.
//        String[] names = {"Amanda", "Amahle","Kabelo","Bafana","Samantha","albert","Harry","Samkelo","Tony"};
//        Arrays.stream(names)
//                .filter(x -> x.startsWith("S"))
//                .sorted()
//                .forEach(System.out::println);

//        6.average of squares of an int array
//        Arrays.stream(new int[] {2,4,6,8,10})
//                .map(x -> x * x)
//                .average()
//                .ifPresent(System.out::println);

//        7.Stream from List, filter and print
//        List<String> people = Arrays.asList("Amanda", "Amahle","Kabelo","Bafana","Samantha","albert","Harry","Samkelo","Tony");
//        people
//                .stream()
//                .map(String::toLowerCase)
//                .filter(x -> x.startsWith("a"))
//                .forEach(System.out::println);

//        8.Stream rows from text file, sort,filter and print
//        Stream<String> bands = Files.lines(Paths.get("bands.txt"));
//        bands
//                .sorted()
//                .filter(x -> x.length() > 13)
//                .forEach(System.out::println);
//        bands.close();





    }


}
