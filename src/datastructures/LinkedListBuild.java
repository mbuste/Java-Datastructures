package datastructures;

/**
 *
 * @author Moses
 */
public class LinkedListBuild {

    private Node first;
    private Node last;
    Node node;

    public class Node {

        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setNext(Node node) {
            this.next = node;
        }

        public int getValue() {
            return this.value;
        }

        public Node getNode() {
            return this.next;
        }

        public void Node(int value, Node node) {
            this.value = value;
            this.next = node;
        }

    }

    public LinkedListBuild(int num) {
        node = new Node(num);
    }

    public void addLast(int num) {
        node = new Node(num);
        if (first == null) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }
    
    public void addFirst(int num){
        node = new Node(num);
        if (first == null) {
            first = last= node;
        } else {
            node.next = first;
            first= node;
        }
        
    }

}
