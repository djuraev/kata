package dstructure.linkedlist;

public class Node<T> {
    //
    private T value;
    private Node<T> next;

    public Node(T value, Node<T> next) {
        //
        this.value = value;
        this.next = next;
    }

    public Node() {
        //
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object ob) {
        //
        if (this == ob) {
            return true;
        }
        if (!(ob instanceof Node)) {
            return false;
        }
        Node<T> node = (Node<T>) ob;
        return node.getValue().equals(this.getValue());
    }
}
