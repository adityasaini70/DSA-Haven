public class QueueClient {
    public static void main(String[] args) {
        QueueUsingLL q  = new QueueUsingLL();

        q.enqueue(10);
        q.enqueue(9);
        q.enqueue(8);
        q.enqueue(6);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.display();

        q.dequeue();
        q.dequeue();

        q.display();

        q.dequeue();
        q.enqueue(90);
        q.display();
    }
}