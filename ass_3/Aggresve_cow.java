package ass_3;

import java.util.Arrays;
import java.util.Scanner;

public class Aggresve_cow {
	public static void main(String[] args) {
		Scanner ak = new Scanner(System.in);
		int nos = ak.nextInt();
		int a = ak.nextInt();
		int[] arr = new int[nos];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ak.nextInt();
		}
		// int [] arr= {1,2,4,8,9};
		// int a=3;
		Arrays.sort(arr);
		System.out.println(mindis(arr, a));

	}

	public static int mindis(int[] arr, int a) {
		int ans = 0;
		int x = 0;
		int y = arr.length - 1;
		while (x <= y) {
			int mid = (x + y) / 2;
			if (isitpossible(mid, arr, a)) {
				ans = mid;
				x = mid + 1;
			} else {
				y = mid - 1;
			}
		}
		return ans;
	}

	private static boolean isitpossible(int mid, int[] arr, int a) {
		// TODO Auto-generated method stub
		int pc = 1;
		int lp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - lp >= mid) {
				pc++;
				lp = arr[i];
			}
			if (pc >= a)
				return true;
		}
		return false;
	}

}
