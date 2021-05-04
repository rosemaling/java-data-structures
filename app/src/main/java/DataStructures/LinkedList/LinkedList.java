package DataStructures.LinkedList;

public class LinkedList {
    private Node head;

    public void add(Object data){
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(data);
    }

    public void prepend(Object data){
        if (head == null) {
            head = new Node(data);
        } else {
            Node newHead = new Node(data);
            newHead.next = head;
            head = newHead;
        }
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public Node getFirst(){
        return head;
    }

    public Node getLast(){
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    public int getLength() {
        int length = 0;
        Node current = head;

        while (current != null){
            length++;
            current = current.next;
        }

        return length;
    }

    public Node get(int index) throws IndexOutOfBoundsException{
        if (index > getLength()) {
            throw new IndexOutOfBoundsException();
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        }
    }

    public int contains(Object data){
        Node current = head;
        int index = 0;
        while (current.getData() != data && current.next != null){
            current = current.next;
            index++;
        }

        if (current.next == null && current.getData() != data) {
            return -1;
        } else {
            return index;
        }

    }

    public void delete(int index) throws IndexOutOfBoundsException {
        if (index > getLength()) {
            throw new IndexOutOfBoundsException();
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

    public void delete(Object data) {
        Node current = head;
        Node previous = head;

        while (current.getData() != data && current.next != null){
            previous = current;
            current = current.next;
        }

        if (current.next == null && current.getData() != data) {
            return;
        } else {
            previous.next = current.next;
        }

    }

}
