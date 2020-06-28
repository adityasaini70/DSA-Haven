public class LinkedListClient {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        System.out.println(l.isEmpty());
        // l.PushFront(3);
        l.PushBack(2);
        l.PushBack(3);
        l.PushBack(9);
        // l.PushBack(12);
        l.PushFront(39876);
        System.out.println(l.isEmpty());
        l.Display();
        l.PopBack();
        l.Display();
        l.PopFront();
        l.Display();
    }
}