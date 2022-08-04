package ass_3;

import java.util.Scanner;

public class Help_ramu {
	public static void main(String[] args) {
//		int [] arr= {1,3,7,19};
//		int c1=1;
//		int c2=3;
//		int c3=7;
//		int c4=19;
		// int [] rik= {2,5};
		// int [] cab= {4,4,4};
		Scanner ak = new Scanner(System.in);
		int n = ak.nextInt();
		while (n-- > 0) {
			int[] arr = new int[4];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = ak.nextInt();
			}

			int x = ak.nextInt();
			int y = ak.nextInt();
			int[] rik = new int[x];
			int[] cab = new int[y];
			for (int i = 0; i < rik.length; i++) {
				rik[i] = ak.nextInt();
			}
			for (int j = 0; j < cab.length; j++) {
				cab[j] = ak.nextInt();
			}

			System.out.println(ans(arr, rik, cab));
		}

	}

	private static int ans(int[] arr, int[] rik, int[] cab) {
		// TODO Auto-generated method stub
		int csum = 0;
		int rsum = 0;
		for (int i = 0; i < rik.length; i++) {
			rsum += Math.min(rik[i] * arr[0], arr[1]);
		}
		rsum = Math.min(arr[2], rsum);
		// System.out.println(rsum);

		for (int i = 0; i < cab.length; i++) {
			csum += Math.min(cab[i] * arr[0], arr[1]);
		}
		csum = Math.min(arr[2], csum);
		// System.out.println(csum);

		int m = csum + rsum;
		int sol = Math.min(arr[3], m);
		return sol;

	}

}
