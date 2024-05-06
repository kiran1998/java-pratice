package collections;

import java.util.*;

public class Learn10CollectionClass {
    public static void main(String[] args) {

        List<Student>  list = new ArrayList<>();
        list.add(new Student("Anuj", 2));
        list.add(new Student("Ramesh", 4));
        list.add(new Student("Shivam", 3));
        list.add(new Student("Anuj", 1));

        list.add(new Student("Shivam", 3));
        list.add(new Student("Anuj", 2));



        Collections.sort(list); //to sort student list, we need to implement comparable for student class


        /*List<Integer> list = new ArrayList<>();

        list.add(32);
        list.add(12);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        System.out.println("minimum ele in list: "+ Collections.min(list));
        System.out.println("maximum ele in list: "+ Collections.max(list));
        System.out.println("fre of ele 9 is : "+ Collections.frequency(list, 9));

        Collections.sort(list); //sorts the entire list

        System.out.println(list);

        Collections.sort(list, Comparator.reverseOrder() );

        System.out.println(list);*/
    }
}
