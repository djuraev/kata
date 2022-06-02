package driver;

import dstructure.linkedlist.DoublyLinkedList;

public class Driver {
    //
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        dll.addValueToHead(1);
        dll.addValueToHead(2);
        dll.addValueToHead(3);
        dll.addValueToTail(1);
        dll.addValueToTail(2);
        dll.addValueToTail(3);
        dll.insertAt(5, 199);
        dll.print();
    }
}
