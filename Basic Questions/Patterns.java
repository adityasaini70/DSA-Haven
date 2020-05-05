package Basic Questions; 

import java.util.Scanner;

public class Patterns {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		pat_3(n);
	}

	public static void pat_1(int n) {
//		*****
//		*****
//		*****
//		*****
//		*****
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pat_2(int n) {
//		*
//		**
//		***
//		****
//		*****

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pat_3(int n) {
//		*****
//		****
//		***
//		**
//		*
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
		int spaces = n - 1;
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

	public static void pat_17(int n) {
//		Pattern for n = 7
//				*** ***
//				**   **
//				*     *
//				       
//				*     *
//				**   **
//				*** ***

		System.out.println("Pattern for n = " + n);
		int stars = (int) n / 2;
		int spaces = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}

			System.out.println();
			stars += (i + 1 > (int) n / 2 + 1 ? 1 : -1);
			spaces += (i + 1 > (int) n / 2 + 1 ? -2 : 2);
		}
	}

	public static void pat_18(int n) {
//		Pattern for n = 7
//				   *
//				  ***
//				 *****
//				*******
//				 *****
//				  ***
//				   *

		System.out.println("Pattern for n = " + n);
		int stars = 1;
		int spaces = (int) n / 2;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}

			System.out.println();
			stars += (i + 1 > (int) n / 2 + 1 ? -2 : 2);
			spaces += (i + 1 > (int) n / 2 + 1 ? 1 : -1);
		}
	}

	public static void pat_19(int n) {
//		Pattern for n = 7
//		*******
//		*** ***
//		**   **
//		*     *
//		**   **
//		*** ***
//		*******

		System.out.println("Pattern for n = " + n);
		int stars = (int) n / 2;
		int spaces = 1;
		for (int i = 1; i <= n; i++) {

			if (i == 1 || i == n) {
				for (int j = 1; j <= n; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 1; j <= stars; j++) {
					System.out.print("*");
				}

				for (int j = 1; j <= spaces; j++) {
					System.out.print(" ");
				}

				for (int j = 1; j <= stars; j++) {
					System.out.print("*");
				}

				System.out.println();
				stars += (i + 1 > (int) n / 2 + 1 ? 1 : -1);
				spaces += (i + 1 > (int) n / 2 + 1 ? -2 : 2);
			}
		}
	}

	public static void pat_20(int n) {
//		Pattern for n = 7
//				   *
//				  * *
//				 *   *
//				*     *
//				 *   *
//				  * *
//				   *

		System.out.println("Pattern for n = " + n);
		int stars = 1;
		int spaces_1 = (int) n / 2;
		int spaces_2 = 1;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= spaces_1; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <= spaces_2 && i != 1 && i != n; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= stars && i != 1 && i != n; j++) {
				System.out.print("*");
			}

			System.out.println();
			spaces_1 += (i + 1 > (int) n / 2 + 1 ? 1 : -1);

			spaces_2 += (i == 1) ? 0 : (i + 1 > (int) n / 2 + 1) ? -2 : 2;

		}
	}

	public static void pat_21(int n) {
//		Pattern for n = 5
//				*       *
//				**     **
//				***   ***
//				**** ****
//				*********

		System.out.println("Pattern for n = " + n);
		int stars = 1;
		int spaces = 2 * n - 3;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}

			if (i == n) {
				stars -= 1;
			}

			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}

			System.out.println();

			stars++;
			spaces -= 2;
		}
	}

	public static void pat_22(int n) {

//		Pattern for n = 5
//				*********
//				**** ****
//				***   ***
//				**     **
//				*       *

		System.out.println("Pattern for n = " + n);
		int stars = n;
		int spaces = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}

			for (int j = 1; i != 1 && j <= spaces; j++) {
				System.out.print(" ");
			}
			if (i == 1) {
				stars -= 1;
			}
			for (int j = 1; j <= stars; j++) {

				System.out.print("*");
			}

			System.out.println();

			stars -= (i == 1) ? 0 : 1;
			spaces += (i == 1) ? 0 : 2;
		}
	}

	public static void pat_23(int n) {
//		Pattern for n = 5
//			    1
//			   111
//			  11111
//			 1111111
//			111111111

		System.out.println("Pattern for n = " + n);
		int num_shape = 1;
		int num_disp = 1;
		int spaces = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= num_shape; j++) {
				System.out.print(num_disp);
			}

			System.out.println();

			num_shape += 2;
			spaces--;
		}
	}

	public static void pat_24(int n) {
//		Pattern for n = 5
//			    1
//			   222
//			  33333
//			 4444444
//			555555555

		System.out.println("Pattern for n = " + n);
		int num_shape = 1;
		int num_disp = 1;
		int spaces = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= num_shape; j++) {
				System.out.print(num_disp);
			}

			System.out.println();

			num_shape += 2;
			num_disp++;
			spaces--;
		}
	}

	public static void pat_25(int n) {
//		Pattern for n = 5
// 	 	 	 	1	
// 	 	 	2	3	4	
// 	 	5	6	7	8	9	
// 	10	11	12	13	14	15	16	
//17	18	19	20	21	22	23	24	25	

		System.out.println("Pattern for n = " + n);
		int num_shape = 1;
		int num_disp = 1;
		int spaces = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" " + "\t");
			}
			for (int j = 1; j <= num_shape; j++) {
				System.out.print(num_disp + "\t");
				num_disp++;
			}

			System.out.println();

			num_shape += 2;
			spaces--;
		}
	}

	public static void pat_26(int n) {
//		Pattern for n = 5
// 	 	 	 	1	
// 	 	 	1	2	3	
// 	 	1	2	3	4	5	
// 	1	2	3	4	5	6	7	
//1	2	3	4	5	6	7	8	9	

		System.out.println("Pattern for n = " + n);
		int num_shape = 1;
		int spaces = n - 1;
		for (int i = 1; i <= n; i++) {
			int num_disp = 1;

			for (int j = 1; j <= spaces; j++) {
				System.out.print(" " + "\t");
			}
			for (int j = 1; j <= num_shape; j++) {
				System.out.print(num_disp + "\t");
				num_disp++;
			}

			System.out.println();

			num_shape += 2;
			spaces--;
		}
	}

	public static void pat_27(int n) {
//		Pattern for n = 5
// 	 	 	 	1	
// 	 	 	1	2	1	
// 	 	1	2	3	2	1	
// 	1	2	3	4	3	2	1	
//1	2	3	4	5	4	3	2	1	

		System.out.println("Pattern for n = " + n);
		int num_shape = 1;
		int spaces = n - 1;
		for (int i = 1; i <= n; i++) {
			int num_disp = 1;

			for (int j = 1; j <= spaces; j++) {
				System.out.print(" " + "\t");
			}
			for (int j = 1; j <= num_shape; j++) {
				System.out.print(num_disp + "\t");
				num_disp += (j + 1 > (int) (num_shape / 2) + 1) ? -1 : 1;
			}

			System.out.println();

			num_shape += 2;
			spaces--;
		}
	}

	public static void pat_28(int n) {
//		Pattern for n = 5
// 	 	 	 	1	
// 	 	 	2	3	2	
// 	 	3	4	5	4	3	
// 	4	5	6	7	6	5	4	
//5	6	7	8	9	8	7	6	5	

		System.out.println("Pattern for n = " + n);
		int num_shape = 1;
		int spaces = n - 1;
		for (int i = 1; i <= n; i++) {
			int num_disp = i;

			for (int j = 1; j <= spaces; j++) {
				System.out.print(" " + "\t");
			}
			for (int j = 1; j <= num_shape; j++) {
				System.out.print(num_disp + "\t");
				num_disp += (j + 1 > (int) (num_shape / 2) + 1) ? -1 : 1;
			}

			System.out.println();

			num_shape += 2;
			spaces--;
		}
	}

	public static void pat_29(int n) {
//		Pattern for n = 5
// 	 	 	 	1	
// 	 	 	2	0	2	
// 	 	3	0	0	0	3	
// 	4	0	0	0	0	0	4	
//5	0	0	0	0	0	0	0	5

		System.out.println("Pattern for n = " + n);
		int num_shape = 1;
		int spaces = n - 1;
		for (int i = 1; i <= n; i++) {
			int num_disp = i;

			for (int j = 1; j <= spaces; j++) {
				System.out.print(" " + "\t");
			}
			for (int j = 1; j <= num_shape; j++) {
				if (j == 1 || j == num_shape) {
					System.out.print(num_disp + "\t");
				} else {
					System.out.print(0 + "\t");
				}
			}

			System.out.println();

			num_shape += 2;
			spaces--;
		}
	}

	public static void pat_30(int n) {
//		Pattern for n = 5
//				54321
//				54321
//				54321
//				54321
//				54321

		System.out.println("Pattern for n = " + n);
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void pat_31(int n) {
//		Pattern for n = 5
//				5432*
//				543*1
//				54*21
//				5*321
//				*4321

		System.out.println("Pattern for n = " + n);
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (j == i) {
					System.out.print("*");
				} else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}

	public static void pat_32(int n) {
//
//Pattern for n = 5
//1
//2*2
//3*3*3
//4*4*4*4
//5*5*5*5*5
//4*4*4*4
//3*3*3
//2*2
//1

		System.out.println("Pattern for n = " + n);
		int shape = 1;
		int num_disp = 1;
		for (int i = 1; i <= 2 * n - 1; i++) {
			for (int j = 1; j <= shape; j++) {
				if (j % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(num_disp);
				}
			}

			shape += (i + 1) > n ? -2 : 2;
			num_disp += (i + 1) > n ? -1 : 1;
			System.out.println();
		}
	}

	public static void pat_33(int n) {
//		Pattern for n = 5
// 	 	 	 	0	
// 	 	 	4	0	4	
// 	 	3	4	0	4	3	
// 	2	3	4	0	4	3	2	
//1	2	3	4	0	4	3	2	1	

		System.out.println("Pattern for n = " + n);
		int shape = 1;
		int spaces = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" " + "\t");
			}

			int num_disp = spaces + 1, check = 1;
			for (int j = 1; j <= shape; j++) {
				if (check == 1) {
					if (num_disp < n) {
						System.out.print(num_disp + "\t");
						num_disp++;
					} else if (num_disp == n) {
						System.out.print(0 + "\t");
						check = 0;
						num_disp--;
					}
				} else {
					System.out.print(num_disp % (2 * n) + "\t");
					num_disp--;
				}
			}

			spaces--;
			shape += 2;
			System.out.println();
		}
	}
}
