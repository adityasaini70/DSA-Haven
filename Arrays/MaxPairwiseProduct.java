import java.util.*;
import java.io.*;
// Gives the max pair wise prodct of a given array
// Input:  10
//         7 5 14 2 8 8 10 1 2 3
// Output: 140

// Starter code taken from course : Algorithmic Toolbox by UC San Diego on Coursera

public class MaxPairwiseProduct {

    //Naive implementaion. Time complexity = O(n^2)
    static long getMaxPairwiseProduct(int[] numbers) {
        long max_product = 0;
        int n = numbers.length;

        for (int first = 0; first < n; ++first) {
            for (int second = first + 1; second < n; ++second) {
                max_product = Math.max(max_product, numbers[first] * numbers[second]);
            }
        }

        return max_product;
    }
 
    //Efficient implementaion. Time complexity = O(n)
    static long getMaxPairwiseProductFast(int[] numbers) {
        long max_product = 0;
        int n = numbers.length;

        long max_1 = -1;
        int max_1_idx = -1;
        long max_2 = -1;

        for (int idx = 0; idx < n; idx++) {
            if (numbers[idx] > max_1) {
                max_1 = numbers[idx];
                max_1_idx = idx;
            }
        }

        for (int idx = 0; idx < n; idx++) {
            if (numbers[idx] > max_2 && idx!= max_1_idx) {
                max_2 = numbers[idx];
            }
        }
        max_product = max_1 * max_2;
        return max_product;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProductFast(numbers));
        // System.out.println(getMaxPairwiseProduct(numbers));

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
