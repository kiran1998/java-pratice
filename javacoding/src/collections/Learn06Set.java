package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Learn06Set {
    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(new Student("Anuj", 2));
        studentSet.add(new Student("Ramesh", 4));
        studentSet.add(new Student("Shivam", 3));
        studentSet.add(new Student("Anuj", 2));

        System.out.println(studentSet);
        /*why hashset unable to differenciate unique ele on above student
        * set takes it as a unique ele
        * because repaeated ele are of different objects and hashset unable to understant it*/



        /**

//        Set<Integer> set = new HashSet<Integer>();
//        Set<Integer> linkedset = new LinkedHashSet<Integer>();
        Set<Integer> set = new TreeSet<Integer>();
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

        set.add(65);
        set.add(65);
        set.add(65);
        set.add(65);
        set.add(65);
        set.add(65);
        System.out.println(set);
        set.remove(65); //removes ele 54 from the set
        System.out.println(set);

        System.out.println(set.contains(100)); //return boolean val if ele pre in set or not

        System.out.println(set.isEmpty()); //returns boolean if set is empty or not

        System.out.println(set.size()); //return count of ele presetn in set

        set.clear(); //remves all ele from the set

        System.out.println(set);
*/
    }
}
