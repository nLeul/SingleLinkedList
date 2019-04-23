package linked_list.single;

public class Node<T extends Comparable <T>> {

    private T data;
    private Node<T> nextNode;

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
