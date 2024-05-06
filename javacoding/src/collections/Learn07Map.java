package collections;

import java.util.HashMap;
import java.util.Map;

public class Learn07Map {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("three",3);
        numbers.put("four",4);
        numbers.put("five",5);

//        numbers.put("two", 34); //duplicate keys, values are overrided

        /*below code to avoid values getting overrided*/
        if(! numbers.containsKey("two"))
           numbers.put("two", 22);
                /*OR*/

        numbers.putIfAbsent("two", 22);

//        numbers.putIfAbsent();

        System.out.println(numbers);

        /*ITERATING MAP*/ /*D */

//        for(Map.Entry<String, Integer> e: numbers.entrySet()){
//            System.out.println(e);
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }

        /*ITERATING KEYS IN MAP*/
  /*      for(String key : numbers.keySet() ){
            System.out.println(key);
        }

        *//*ITERATING VALUES IN MAP*//*
        for(Integer value : numbers.values()){
            System.out.println(value);
        }*/

        System.out.println(numbers.containsKey("t"));
        System.out.println(numbers.containsValue(30)); //returns booelan value if key presnt or not
        System.out.println(numbers.isEmpty() ); //returns boolean if map is empty or not
    }
}
