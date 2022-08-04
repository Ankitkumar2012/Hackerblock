package ass_3;

import java.util.Scanner;

public class Alex_shopping {
	public static void main(String[] args) {
		Scanner ak = new Scanner(System.in);
		int n = ak.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ak.nextInt();
		}

		int b = ak.nextInt();
		int[] brr = new int[b];
		int[] crr = new int[b];
		for (int i = 0; i < crr.length; i++) {
			brr[i] = ak.nextInt();
			crr[i] = ak.nextInt();
	 	}
		
//		int[] arr = { 100, 200, 400, 100 };
//		int[] brr = { 100, 200, 500, 600, 800 };
//		int[] crr = { 2, 3, 4, 4, 4 };
		ans(arr, brr, crr);
	}

	private static void ans(int[] arr, int[] brr, int[] crr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < brr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				int k = brr[i];
				if (k % arr[j] == 0) {
					count++;
				}
			}
			if (count >= crr[i]) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		
	}

}
