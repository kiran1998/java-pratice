package collections;

import java.util.Arrays;

public class Learn09ArraysClass {
    public static void main(String[] args) {
     /*   int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(numbers, 4);

        System.out.println("The index of ele 4 is :"+index);*/

        Integer[] numbers = {10,2 , 43, 46, 78, 199};
        Arrays.sort(numbers);

        for(Integer i: numbers){
            System.out.print(i+" ");
        }

        Arrays.fill(numbers, 1);


        System.out.println(Arrays.toString(numbers));
    }
}
