package Basic;

public class DecimalSystemConversion {
	public static void main(String[] args) {
		System.out.println(converter(32, 10, 2));
		System.out.println(converter(100000, 2, 10));
	}

	public static int converter(int n, int source, int destination) {
		// Converts number from base = source to base = destination

		int ans = 0;
		int multiplier = 0;
		while (n != 0) {
			ans += (n % destination) * Math.pow(source, multiplier);
			n /= destination;
			multiplier++;
		}
		return ans;

	}
}
