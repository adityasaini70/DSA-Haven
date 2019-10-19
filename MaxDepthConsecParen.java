/* modules imported */
import java.util.Stack;
import java.util.Scanner;
import java.lang.Math;

public class MaxDepthConsecParen {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		for (int i = 1; i <= n; i++) {
			String s = scn.next();
			System.out.println(func(s));
		}
	}

	public static int func(String s) {
		/* To compute the depth of parenthesis
		 * For example: consider (h(e(l(l(o))))) in input, will
		 * return 5 as depth because of 5 pairs of ()
		 * another example as (h(e(l(l(o)) will return -1 because
		 * parenthesis are open!
		 *
		 * Returns: depth (int); -1 if parenthesis are not closed
		 */

		Stack<Character> stk = new Stack<Character>();
		int count = 0, idx = 0;
		while (idx < s.length()) {
			char c = s.charAt(idx++);
			if (c == '(') {
				stk.push('(');
				count = Math.max(count, stk.size());
			} else if (c == ')') {
				if (stk.isEmpty()) {
					return -1;
				} else {
					stk.pop();
				}
			}
		}
		if (!stk.isEmpty()) {
			return -1;
		} else {
			return count;
		}
	}
}
