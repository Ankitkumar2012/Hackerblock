package ass_6;

import java.util.Scanner;

public class Odd_even_recursion {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		ans(n);
	}

	private static void ans(int n) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return;
		}
		if (n % 2 != 0)
			System.out.println(n);
		ans(n - 1);
		if (n % 2 == 0)
			System.out.println(n);
	}

}
