package collections;
import java.util.Iterator;
import java.util.List;
/*why to use arraylist
    Imagine class which had 30 students and we stored indivdual student names in the array
    if new student enters the class there will be difficulty in storing the stud name
* array's drawbacks
* 1.fixed size
* 2.we can update array size but its not scalable
*/

import java.util.ArrayList;

public class Learn01ArrayList {

    public static void main(String[] args) {

        List<String> names = new ArrayList();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        for (String name : names) {
            System.out.println(name);
        }

        /*creating arraylist of student names*/

/**
        ArrayList<String> studentNames = new ArrayList<String>(); //this declaration creates empty array

        //after adding first ele arraylist automatically makes its size of 10 ele
        studentNames.add("Rakesh");

        // if size its n
        // after trying filling n+1 ele then size becomes ---> n + n/2 + 1;


        //add() --> adds ele at the end of list

        List<Integer> list = new ArrayList<Integer>();
    /**    list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.add(4);
        System.out.println(list);

        //below line for adding ele in particular index
        list.add(1,50);
        System.out.println(list);

        //Adding ele list from another list
        List<Integer> newList = new ArrayList<Integer>();
        newList.add(151);
        newList.add(152);

        list.addAll(newList);

        System.out.println(list);

        System.out.println("getting elements from particular index");

        System.out.println(list.get(1));

    */

        /*System.out.println("List method to remove elements below");

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println(list);
        */
        //iterating ele in list using for loop
//        for (int i = 0; i < list.size(); i++) { //size()--> tells how many ele in list
//            System.out.println("ele in list: "+list.get(i));
//        }

        //for each loop
       /* for (Integer ele: list) {
            System.out.println("ele in list: "+ele);
        }

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            System.out.println("iterator :"+it.next() );
        }*/

//        list.set(0, 10); //set method updates ele in that positon
//
//        System.out.println(list.contains(10)); //return boolean value if ele present in list or not
//
//        System.out.println(list);

    /*         System.out.println("List method to remove elements below");

       list.remove(1); //remove ele using its idx pos

        System.out.println("After removing 1st index ele :"+list);

        list.remove(Integer.valueOf(3)); //pass type of ele and that inside of it

        System.out.println("list after removing ele 3: "+list);

        list.clear(); // This will remove all ele from list

        System.out.println(list);
     */



    }






}
