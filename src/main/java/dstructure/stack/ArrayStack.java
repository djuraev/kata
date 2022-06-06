package dstructure.stack;

import dstructure.exceptions.StackEmptyException;
import utils.Util;

public class ArrayStack<T> {
    //
    private T[] container;
    private int size;
    private int headPointer;

    public ArrayStack() {
        //
        this.size = 2;
        this.container = (T[]) new Object[size];
        this.headPointer = -1;
    }

    public boolean isEmpty() {
        //
        return headPointer == -1;
    }

    public T pop() {
        //
        if (headPointer == -1) {
            throw new StackEmptyException("Stack is empty.");
        }
        T value = container[headPointer];
        headPointer--;

        return value;
    }

    public boolean push(T value) {
        //
        float loadFactor = (float)(headPointer+1) / (float)size;
        if (loadFactor >= 0.8) {
            System.out.println("=================== Resizing stack size ===================");
            container = (T[]) Util.resizeArray(container, 2);
            size *= 2;
            System.out.println("Current array size: "+container.length);
            System.out.println("============================================================");
        }
        headPointer++;
        container[headPointer] = value;
        return true;
    }

    public boolean search(T value) {
        //
        for (T element: container) {
            if (element.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public T peek() {
        //
        return container[headPointer];
    }
}
