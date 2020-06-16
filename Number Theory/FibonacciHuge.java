import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHugeNaive(long n, long m) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % m;
    }

    // private static long getPisanoSeqLen(long m) {

    //     // https://www.youtube.com/watch?v=Nu-lW-Ifyec : Numberphile Video

    // }

    private static long getFibonacciHugeFast(long n, long m) {

        // Finding Pisano sequence for m
        ArrayList<Long> list = new ArrayList<Long>();
        ArrayList<Long> fib_list = new ArrayList<Long>();

        fib_list.add((long) 0);
        fib_list.add((long) 1);

        list.add(fib_list.get(0) % m);
        list.add(fib_list.get(1) % m);

        int index = 2;
        while (true) {
            if (list.get(index - 1) % m == 0 && list.get(index - 2) % m == 1) {
                break;
            } else {
                list.add((list.get(index - 1) + list.get(index - 2)) % m);
            }
            index += 1;
        }

        long period_len = index - 1;
        long rem = n % period_len;
        return list.get((int) rem);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        // System.out.println(getPisanoSeqLen(m));
        System.out.println(getFibonacciHugeFast(n, m));
        scanner.close();
    }
}
