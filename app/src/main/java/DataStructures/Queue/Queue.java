package DataStructures.Queue;

public class Queue {
    Node front;

    public boolean isEmpty() {
        return front == null;
    }

    public void add(Object data){
        Node addition = new Node(data);
        if (isEmpty()){
            front = addition;
        } else {
            Node current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = addition;
        }
    }
}
