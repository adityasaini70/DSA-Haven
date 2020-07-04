import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class FractionalKnapsack {
    static class vpw_node {
        // Values per weight
        int orig_idx;
        double val;

        vpw_node(int x, double y) {
            this.orig_idx = x;
            this.val = y;
        }
    }

    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;

        // write your code here
        ArrayList<vpw_node> values_per_weight = new ArrayList<>(values.length);

        for (int i = 0; i < values.length; i++) {
            vpw_node temp = new vpw_node(i, (double) values[i] / (double) weights[i]);
            values_per_weight.add(temp);
        }

        Collections.sort(values_per_weight, new Comparator<vpw_node>() {
            @Override
            public int compare(vpw_node X, vpw_node Y) {
                return X.val < Y.val ? 1 : -1;
            }
        });


        for (int i = 0; i < values_per_weight.size(); i++) {

            if (capacity == 0) {
                break;
            }
            int orig_idx = values_per_weight.get(i).orig_idx;
            if (weights[orig_idx] <= capacity) {
                value += values[orig_idx];
                capacity -= weights[orig_idx];
            }
             else {
                value += values_per_weight.get(i).val * capacity;
                capacity = 0;
            }

        }
        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        // System.out.printf("%.4f", getOptimalValue(capacity, values, weights));
        // System.out.println();
        System.out.printf("%.4f", getOptimalValue(capacity, values, weights));
    }
}
