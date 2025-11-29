package streamAPI;

//Lambda, Lambda method inference,
// Stream, sorting, filter, map, Collectors

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {
//        Walkable obj = (steps, isEnabled) -> {
//            System.out.println("Walking fast "+ steps + " steps.");
//            return 2*steps;
//        };
//
//        int answer = obj.walk(4, true);
//        System.out.println("Twice the number of steps is: "+ answer);

        List<String> fruits = List.of("Banana", "Apple", "Kiwi", "Mango");
        Stream<String> stream = fruits.stream();

//        stream.forEach((fruit) -> {
//            System.out.println(fruit);
//        });
        // stream once used is closed and cannot be used again, so the same thing above cannot be done again
        // this is used for chain pattern where stream is created everytime for different kind of operations to be carried on it
        // this is to prevent memory leaks as stream gets destroyed once its been used

//        Set<Integer> fruitsList = fruits
//                .stream()
//                .map(fruit -> fruit.length())
//                .collect(Collectors.toSet());
//
//        System.out.println(fruitsList);

        Map<String, Integer> fruitsList = fruits
                .stream()
                .collect(Collectors.toMap(
                        fruit -> fruit,
                        String::length
                ));

        System.out.println(fruitsList);

//        stream
//                .filter(fruit -> fruit.length() < 5)
//                .sorted()
//                .map(fruit -> fruit.length())// this changed the flow as fruit became an int here helping us avoid multiple variable and function declarations
//                .map(fruitLength -> 2*fruitLength)
//                .forEach(System.out::println);
    }

//    interface Walkable {
//        int walk(int steps, boolean isEnabled);
//    }
}