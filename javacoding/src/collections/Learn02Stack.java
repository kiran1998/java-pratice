package collections;

import java.util.Stack;

public class Learn02Stack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat"); //push()-->adding ele in stack

        System.out.println(animals);

        System.out.println(animals.peek()); //peek()-->returns top or last ele

        System.out.println(animals.pop() ); //pop()--> removes top ele

        System.out.println(animals.peek() );
    }
}
