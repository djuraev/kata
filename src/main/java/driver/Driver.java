package driver;

import dstructure.stack.ArrayStack;

public class Driver {
    //
    public static void main(String[] args) {
        ArrayStack<Integer> iStack = new ArrayStack<>();
        iStack.push(10);
        iStack.push(20);
        iStack.push(30);
        iStack.push(40);
        iStack.push(50);
        while (!iStack.isEmpty()) {
            System.out.println(iStack.pop());
        }
    }
}
