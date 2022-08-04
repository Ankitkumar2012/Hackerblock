package ass_6;

import java.util.Scanner;

public class Nth_triangle {
	public static void main(String[] args) {
		Scanner ak = new Scanner(System.in);
		int n = ak.nextInt();
		System.out.println(ans(n, 0));
	}

	private static int ans(int n, int a) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return a;
		}
		a = a + n;
		return ans(n - 1, a);
	}

}
