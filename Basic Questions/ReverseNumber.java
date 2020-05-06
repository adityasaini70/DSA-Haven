package Basic;

import java.util.Scanner;

public class ReverseNumber {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int ans = 0;
		while(n!=0) {
			ans = ans*10 + n%10;
			n/=10;
		}
		
		System.out.println(ans);
	}
}
