import java.util.*;
import java.io.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
        int count = 0;
        int[] fuel = new int[stops.length]; // Signifies the distance that can be covered from i'th stop
        for (int i = 0; i < stops.length - 1; i++) {
            if (i == 0) {
                fuel[i] = tank - stops[i];
            } else {
                int distance = stops[i] - stops[i - 1];
                fuel[i] = fuel[i - 1] - distance;
            }

            if (stops[i + 1] - stops[i] > tank + fuel[i]) {
                return -1;
            } else if (stops[i + 1] - stops[i] > fuel[i]) {
                fuel[i] = tank;
                count++;
            }

        }

        // Handling last index
        int f_idx = stops.length - 1;
        int distance = stops[f_idx] - stops[f_idx - 1];
        fuel[f_idx] = fuel[f_idx - 1] - distance;
        if (dist - stops[f_idx] > tank + fuel[f_idx]) {
            return -1;
        } else if (dist - stops[f_idx] > fuel[f_idx]) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];

        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
    }
}
