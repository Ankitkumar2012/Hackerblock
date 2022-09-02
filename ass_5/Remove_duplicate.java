package ass_5;

public class Remove_duplicate {
	public static void main(String[] args) {
		int [] arr= {1,2,2,4,5,3,3,2};
		arr=ans(arr);
		for(int K:arr) {
			System.out.print(K+" ");
		}
	}

	private static int[] ans(int[] arr) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0; i<arr.length; i++) {
			int d=0;
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					d++;
				}
			}
			if(d==0) {
				arr[count]=arr[i];
			 	count++;
			}
		}
		System.out.println(count);
		return arr;
	} 

}
