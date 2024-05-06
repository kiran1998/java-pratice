package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Learn08TreeMap {
    public static void main(String[] args) {

        Map<Integer, String> numbers = new TreeMap<>();

        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        numbers.put(4, "Four");
        numbers.put(5, "Five");

        System.out.println(numbers);
        System.out.println(numbers.containsValue("one"));
        System.out.println(numbers.isEmpty()); //returns booelan value if treemap is empty
        System.out.println(numbers.remove(3)); //accepts key and removes that key
    }
}
