package driver;

import dstructure.stack.ListStack;

public class Driver {
    //
    public static void main(String[] args) {
        ListStack<Integer> stack = new ListStack<>();
        System.out.println(stack.isEmpty());
        stack.push(100);
        System.out.println(stack.isEmpty());
        stack.push(200);
        System.out.println(stack.isEmpty());
        stack.push(300);
        System.out.println(stack.isEmpty());
        stack.push(400);

        System.out.println("Contains: " + stack.search(1000));
    }
}
