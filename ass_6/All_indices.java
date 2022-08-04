package ass_6;

import java.util.Scanner;

public class All_indices {
	public static void main(String[] args) {
		Scanner ak = new Scanner(System.in);
		int n = ak.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ak.nextInt();
		}
		int m = ak.nextInt();
		System.out.println(ans(arr, m, arr.length - 1));
	}

	private static int ans(int[] arr, int m, int k) {
		// TODO Auto-generated method stub
		if (k == 0) {
			return -1;
		}
		if (arr[k] == m) {
			return k;
		}
		return ans(arr, m, k - 1);

	}

}
