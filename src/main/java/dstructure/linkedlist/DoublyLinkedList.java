package dstructure.linkedlist;


import dstructure.exceptions.EmptyListException;

public class DoublyLinkedList<T> {
    //
    private iNode<T> headNode;
    private iNode<T> tailNode;
    private int size;

    public DoublyLinkedList() {
        size = 0;
        headNode = new iNode<>();
        tailNode = new iNode<>();
        headNode.setNextNode(tailNode);
        tailNode.setPreviousNode(headNode);
    }

    public void addValueToHead(T value) {
        //
        iNode<T> node = new iNode<>(value, null, null);
        this.addNodeToHead(node);
    }

    public void addNodeToHead(iNode<T> node) {
        //
        iNode<T> nextNode = headNode.getNextNode();
        node.setNextNode(nextNode);
        nextNode.setPreviousNode(node);
        headNode.setNextNode(node);
        size++;
    }

    public void addValueToTail(T value) {
        //
        iNode<T> node = new iNode<>(value, null, null);
        this.addNodeToTail(node);
    }

    public void addNodeToTail(iNode<T> node) {
        //
        iNode<T> previousNode = tailNode.getPreviousNode();
        node.setPreviousNode(previousNode);
        previousNode.setNextNode(node);
        tailNode.setPreviousNode(node);
        size++;
    }

    public void print() {
        //
        iNode<T> currentNode = headNode.getNextNode();
        while (currentNode != null) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNextNode();
        }
    }

    public int size() {
        //
        return size;
    }

    public void insertAt(int index, T value) {
        //
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        iNode<T> currentNode = headNode.getNextNode();
        iNode<T> previousNode = headNode;
        int currentIndex = 0;
        while (currentIndex < index) {
            currentIndex++;
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }

        iNode<T> node = new iNode<>(value, null, null);

        node.setPreviousNode(previousNode);
        previousNode.setNextNode(node);
        currentNode.setPreviousNode(node);
        node.setNextNode(currentNode);
    }

    public T removeFromHead() {
        if (headNode.getNextNode() == tailNode || size == 0) {
            throw new EmptyListException("List is empty.");
        }
        size--;
        iNode<T> node = headNode.getNextNode();
        headNode = headNode.getNextNode();
        return node.getValue();
    }

    public T getHeadValue() {
        //
        return headNode.getNextNode().getValue();
    }

    public T getTailValue() {
        //
        return tailNode.getPreviousNode().getValue();
    }

    public boolean contains(T value) {
        //
        iNode<T> currentNode = this.headNode.getNextNode();
        while (currentNode.getNextNode() != null) {
            if (currentNode.getValue().equals(value)) {
                return true;
            }
            currentNode = currentNode.getNextNode();
        }
        return false;
    }
}
