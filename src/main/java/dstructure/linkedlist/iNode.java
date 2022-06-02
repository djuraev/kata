package dstructure.linkedlist;

public class iNode<T> {
    //
    private iNode<T> nextNode;
    private iNode<T> previousNode;
    private T value;

    public iNode(T value, iNode<T> nextNode, iNode<T> previousNode){
        //
        this.nextNode = nextNode;
        this.previousNode = previousNode;
        this.value = value;
    }

    public iNode() {
        //
    }

    public iNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(iNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public iNode<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(iNode<T> previousNode) {
        this.previousNode = previousNode;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
