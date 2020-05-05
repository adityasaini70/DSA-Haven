package Basic;

import java.util.Scanner;

public class Patterns {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		pat_16(n);
	}

	public static void pat_1(int n) {
		/*
		 * 
		 * * * * * * * * * * * * * * * * * * * * *
		 * 
		 */

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pat_2(int n) {
		/*
		 *
		 * 
		 * * * * * * * * * * *
		 * 
		 */

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pat_3(int n) {
		/*
		 * 
		 * * * * * * * * * * *
		 *
		 * 
		 */

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pat_4(int n) {
//        *
//       **
//      ***
//     ****
//    *****
//   ******
//  *******
// ********
//*********

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public static void pat_5(int n) {
//		*****
//		 ****
//		  ***
//		   **
//		    *

		for (int i = n; i >= 0; i--) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public static void pat_6(int n) {
//		Pattern for n = 5
//		        *****
//				  ****
//				    ***
//				      **
//				        *
		System.out.println("Pattern for n = " + n);

		int spaces = 0;
		int stars = n;

		for (int i = 1; i <= 2 * n - 1; i++) {

			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}

			System.out.println();

			spaces += 2;
			stars--;
		}
	}

	public static void pat_7(int n) {
//		Pattern for n = 10
//				**********
//				*        *
//				*        *
//				*        *
//				*        *
//				*        *
//				*        *
//				*        *
//				*        *
//				**********

		System.out.println("Pattern for n = " + n);
		int spaces = n - 2;

		for (int i = 1; i <= n; i++) {

			if (i == 1 || i == n) {
				for (int j = 1; j <= n; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {

				System.out.print("*");
				for (int j = 1; j <= spaces; j++) {
					System.out.print(" ");
				}

				System.out.println("*");
			}
		}
	}

	public static void pat_8(int n) {
//		Pattern for n = 5
//				*   *
//				 * * 
//				  *  
//				 * * 
//				*   *

		System.out.println("Pattern for n = " + n);

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {

				if (j == i || j == n + 1 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void pat_9(int n) {
//		Pattern for n = 5
//			    *
//			   ***
//			  *****
//			 *******
//			*********

		System.out.println("Pattern for n = " + n);

		int spaces = n - 1;
		int stars = 1;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}

			if (i >= 2) {
				for (int j = 1; j <= stars - 1; j++) {
					System.out.print("*");
				}
			}

			System.out.println();
			spaces--;
			stars++;
		}
	}

	public static void pat_10(int n) {
//		Pattern for n = 5
//				*********
//				 *******
//				  *****
//				   ***
//				    *

		System.out.println("Pattern for n = " + n);

		int spaces = 0;
		int stars = 2 * n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}

			System.out.println();
			spaces++;
			stars -= 2;
		}
	}

	public static void pat_11(int n) {
//		Pattern for n = 5
//			    *
//			   * *
//			  * * *
//			 * * * *
//			* * * * *

		System.out.println("Pattern for n = " + n);

		int spaces = n - 1;
		int stars = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= stars; j++) {
				if (j % 2 != 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
			spaces--;
			stars += 2;
		}
	}

	public static void pat_12(int n) {
//		Pattern for n = 5
//			    *
//			   *!*
//			  *!*!*
//			 *!*!*!*
//			*!*!*!*!*

		System.out.println("Pattern for n = " + n);

		int spaces = n - 1;
		int stars = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= stars; j++) {
				if (j % 2 != 0) {
					System.out.print("*");
				} else {
					System.out.print("!");
				}
			}

			System.out.println();
			spaces--;
			stars += 2;
		}
	}

	public static void pat_13(int n) {
//		Pattern for n = 5
//				*
//				**
//				***
//				****
//				*****
//				****
//				***
//				**
//				*

		System.out.println("Pattern for n = " + n);
		int stars = 1;
		for (int i = 1; i <= 2 * n - 1; i++) {
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}
			System.out.println();
			stars += (i + 1 > n ? -1 : 1);
		}
	}

	public static void pat_14(int n) {
//		Pattern for n = 5
//			    *
//			   **
//			  ***
//			 ****
//			*****
//			 ****
//			  ***
//			   **
//			    *

		System.out.println("Pattern for n = " + n);
		int stars = 1;
		int spaces = n - 1;
		for (int i = 1; i <= 2 * n - 1; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}
			System.out.println();
			stars += (i + 1 > n ? -1 : 1);
			spaces += (i + 1 > n ? 1 : -1);
		}
	}

	public static void pat_15(int n) {
//		Pattern for n = 5
//				*****
//				  ****
//				    ***
//				      **
//				        *
//				      **
//				    ***
//				  ****
//				*****

		System.out.println("Pattern for n = " + n);
		int stars = n;
		int spaces = 0;
		for (int i = 1; i <= 2 * n - 1; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}

			System.out.println();
			stars += (i + 1 > n ? 1 : -1);
			spaces += (i + 1 > n ? -2 : 2);
		}
	}
	
	public static void pat_16(int n) {
//		Pattern for n = 5
//				*****
//				  ****
//				    ***
//				      **
//				        *
//				      **
//				    ***
//				  ****
//				*****

		System.out.println("Pattern for n = " + n);
		int stars = n;
		int spaces = n-1;
		for (int i = 1; i <= 2 * n - 1; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}

			System.out.println();
			stars += (i + 1 > n ? 1 : -1);
			spaces += (i + 1 > n ? 1 : -1);
		}
	}
}
