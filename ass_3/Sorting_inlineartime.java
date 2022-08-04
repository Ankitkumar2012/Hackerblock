package ass_3;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting_inlineartime {
	public static void main(String[] args) {

		int[] arr = { 2, 0, 2, 1, 1, 0, 2, 1, 0, 2, 1, 0 };
		ans(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static int [] ans(int[] arr) {
		int i = 0;
		int st = 0;
		int ed = arr.length - 1;
		while (st <= ed) {
			if (arr[st] == 0) {
				swap(arr, i, st);
				i++;
				st++;
			} else if (arr[st] == 2) {
				swap(arr, ed, st);
				ed--;
			} else {
				st++;
			}
		}
		return arr;

	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int k = arr[i];
		arr[i] = arr[j];
		arr[j] = k;

	}
}
