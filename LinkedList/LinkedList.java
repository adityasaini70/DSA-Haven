public class LinkedList {
    private int length = 0;
    private Node head;
    private Node tail;

    private class Node {
        int data = 0;
        Node next = null;

        Node(int val) {
            this.data = val;
        }
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public Node getHeadNode() {
        return this.head;
    }

    public int getHeadNodeData() {
        return this.head.data;
    }

    public Node getTailNode() {
        return this.tail;
    }

    public int getTailNodeData() {
        return this.tail.data;
    }

    // Add data to front -->> O(1)
    public void PushFront(int val) {
        Node newNode = new Node(val);
        if (this.isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node temp = this.head;

            this.head = newNode;
            newNode.next = temp;
        }
        this.length++;
    }

    // Remove data from front -->> O(1)
    public void PopFront() {
        if (this.isEmpty()) {
            System.out.println("List is Empty");
        }

        else if (this.length == 1) {
            this.tail = null;
            this.head = null;
            this.length--;
        }

        else {
            this.head = this.head.next;
            this.length--;
        }
    }

    // Add data to back -->> O(1)
    public void PushBack(int val) {
        Node newNode = new Node(val);

        if (this.isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node temp = this.tail;
            temp.next = newNode;
            this.tail = newNode;
        }
        this.length++;
    }

    // Remove data from front -->> O(length)
    public void PopBack() {
        if (this.isEmpty()) {
            System.out.println("List is Empty");
        }

        else if (this.length == 1) {
            this.tail = null;
            this.head = null;
            this.length--;
        }

        else {
            Node temp = this.head;
            while (temp.next != this.tail) {
                temp = temp.next;
            }
            this.tail = temp;
            temp.next = null;
        }
    }

    public void Display() {
        if (this.isEmpty()) {
            System.out.println("List is Empty");
        } else {
            Node temp = this.head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        System.out.println();
    }

}
