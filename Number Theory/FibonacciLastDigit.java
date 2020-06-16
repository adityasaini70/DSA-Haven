import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % 10;
    }
    private static long getFibonacciLastDigitFast(int n) {
        long [] arr = new long[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2;i<arr.length;i++){
          arr[i] = (arr[i-1] + arr[i-2])%10;
        }
        return arr[n];
      }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long c = getFibonacciLastDigitFast(n);
        System.out.println(c);
    }
}

