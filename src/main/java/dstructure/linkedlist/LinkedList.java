package dstructure.linkedlist;

public class LinkedList<T> {
    //
    private Node<T> head;
    private int size;

    public LinkedList() {
        //
    }

    public Node<T> add(T value) {
        //
        if (head == null) {
            head = new Node<>(value, null);
            size = 1;
            return head;
        }

        Node<T> currNode = head;
        while (currNode.getNext() != null) {
            currNode = currNode.getNext();
        }

        currNode.setNext(new Node<>(value, null));
        size++;
        return currNode.getNext();
    }

    public Node<T> addToHead(T value) {
        //
        if (head == null) {
            head = new Node<>(value, null);
            size = 1;
            return head;
        }
        head = new Node<>(value, head);
        size++;
        return head;
    }

    public int getSize() {
        if (isEmpty()) {
            return 0;
        }
        return size;
    }

    public boolean contains(T value) {
        //
        if (isEmpty()) {
            return false;
        }
        Node<T> currPtr = head;
        while (currPtr != null) {
            if (currPtr.getValue().equals(value)) {
                return true;
            }
            currPtr = currPtr.getNext();
        }
        return false;
    }

    public boolean isEmpty() {
        //
        return head == null;
    }

    public void addAt(int index, T value) {
        Node<T> node = new Node<>(value, null);
        this.addAt(index, node);
    }

    public Node<T> addAt(int index, Node<T> node) {
        //
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> currPtr = head;
        int currentIndex = 0;

        while (currPtr.getNext() != null && currentIndex < index-1) {
            currPtr = currPtr.getNext();
            currentIndex++;
        }
        node.setNext(currPtr.getNext());
        currPtr.setNext(node);
        return node;
    }

    public void printContent() {
        //
        if (isEmpty()) {
            return;
        }
        Node<T> currPtr = head;
        while (currPtr != null) {
            System.out.println(currPtr.getValue());
            currPtr = currPtr.getNext();
        }
    }
}
