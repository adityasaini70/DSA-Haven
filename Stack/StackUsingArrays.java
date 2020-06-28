public class StackUsingArrays {
    int[] data;
    int top = -1;

    public StackUsingArrays(int length) {
        data = new int[length];
    }

    public void push(int val) {
        this.data[++this.top] = val;
    }

    public void pop() {
        this.data[this.top--] = 0;
    }

    public int size() {
        return data.length;
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(this.data[i] + " ");
        }
        System.out.println();
    }
}
