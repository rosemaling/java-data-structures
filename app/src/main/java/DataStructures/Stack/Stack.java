package DataStructures.Stack;

public class Stack {
    Node first;

    public boolean isEmpty(){
        return first == null;
    }

    public void push(Object data) {
        if (first == null) {
            first = new Node(data);
        } else {
            Node stored = first;
            first = new Node(data);
            first.next = stored;
        }
    }

    public Object peek() {
        if (isEmpty()){
            return null;
        } else {
            return first.getData();
        }
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        } else if (first.next == null) {
            Object data = first.getData();
            first = null;
            return data;
        } else {
            Object data = first.getData();
            first = first.next;
            return data;
        }
    }
}
