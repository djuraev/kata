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

        Node<T> currentNode = head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(new Node<>(value, null));
        size++;
        return currentNode.getNext();
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
        Node<T> currentNode = head;
        while (currentNode != null) {
            if (currentNode.getValue().equals(value)) {
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    public boolean isEmpty() {
        //
        return head == null || size == 0;
    }

    public void addAt(int index, T value) {
        Node<T> node = new Node<>(value, null);
        if (head == null) {
            this.addToHead(value);
            return;
        }
        this.addAt(index, node);
    }

    public Node<T> addAt(int index, Node<T> node) {
        //
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            this.addToHead(node.getValue());
            return node;
        }

        Node<T> currPtr = head;
        Node<T> prevNode = null;
        int currentIndex = 0;

        while (currPtr.getNext() != null && currentIndex < index) {
            prevNode = currPtr;
            currPtr = currPtr.getNext();
            currentIndex++;
        }

        prevNode.setNext(node);
        node.setNext(currPtr);
        return node;
    }

    public Node<T> reverse() {
        //
        if (head == null) {
            return null;
        }

        if (head.getNext() == null) {
            return head;
        }

        Node<T> curNode = head;
        Node<T> prevNode = null;
        Node<T> nextNode;

        while (curNode != null) {
            nextNode = curNode.getNext();
            curNode.setNext(prevNode);
            prevNode = curNode;
            curNode = nextNode;
        }

        this.head = prevNode;
        return this.head;
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
    public Node<T> delete (int index) {
        //
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> curNode = head;
        Node<T> prevNode = null;

        int currIndex = 0;

        while (curNode != null && currIndex < index) {
            currIndex++;
            prevNode = curNode;
            curNode = curNode.getNext();
        }

        if (prevNode != null) {
            prevNode.setNext(curNode.getNext());
        }
        else {
            head = head.getNext();
        }
        size--;
        return curNode;
    }
}
