package ass_3;

import java.util.Scanner;

public class Book_allocation {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		int t=ak.nextInt();
		while(t-->0) {
			int n=ak.nextInt();
			int m=ak.nextInt();
			int [] page =new int [n];
			for(int i=0; i<page.length; i++) {
				page[i]=ak.nextInt();
			}
			System.out.println(ans(page,m));
		}
	}

	private static int ans(int[] page, int m) {
		int hi = 0;
		for (int i = 0; i < page.length; i++) {
			hi = hi + page[i];
		}
		int lo = 0;
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(page, mid, m) == true) {

				ans = mid;
				hi = mid - 1;

			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}

	public static boolean isitpossible(int[] page, int mid, int m) {
		// TODO Auto-generated method stub
		int student = 1;
		int readpage = 0;
		for (int i = 0; i < page.length;) {
			if (readpage + page[i] <= mid) {
				readpage += page[i];
				i++;
			} else {
				student++;
				readpage = 0;
			}
			if (student > m) {
				return false;
			}
		}

		return true;
		
	}

}
