public class QueueUsingLL {

    Node front;
    Node rear;
    int size = 0;

    private class Node {
        int data;
        Node next = null;

        public Node(int val) {
            this.data = val;
        }
    }

    public void enqueue(int x) {
        Node n = new Node(x);

        if (this.size == 0) {
            this.front = n;
            this.rear = n;
            this.size++;
        } else {
            this.rear.next = n;
            this.rear = n;
            this.size++;
        }
    }

    public void dequeue() {
        if (this.size == 0) {
            System.out.println("Queue empty!");
        } else {
            this.front = this.front.next;
            this.size--;
        }
    }

    public void display() {
        Node t = this.front;

        while (t != null) {
            System.out.print(t.data+" ");
            t = t.next;
        }

        System.out.println();
    }
}
