public class StackUsingLL {

    Node top = null;
    int size;

    private class Node {
        int data;
        Node next = null;;

        Node(int val) {
            this.data = val;
        }
    }

    public void push(int val) {
        Node n = new Node(val);

        if (this.size == 0) {
            this.top = n;
            this.size++;
        } else {
            n.next = this.top;
            this.top = n;
            this.size++;
        }
    }

    public void pop() {

        if (this.size == 0) {
            System.out.println("Empty Stack");
        } else {
            this.top = this.top.next;
            this.size--;
        }

    }

    public Node peek() {
        return this.top;
    }

    public void display() {
        Node temp = this.top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}