package dstructure.stack;

import dstructure.linkedlist.DoublyLinkedList;
import dstructure.linkedlist.iNode;

import java.util.EmptyStackException;

public class ListStack<T> {
    //
    private DoublyLinkedList<T> head;

    public ListStack() {
        //
        head = new DoublyLinkedList<>();
    }

    public void push(T value) {
        //
        head.addValueToHead(value);
    }

    public T pop() {
        //
        if (head.size() == 0) {
            throw new EmptyStackException();
        }
        return this.head.removeFromHead();
    }
    public boolean isEmpty() {
        //
        return head.size() == 0;
    }

    public T peek() {
        //
        return head.getHeadValue();
    }

    public boolean search(T value) {
        //
        return head.contains(value);
    }
}
