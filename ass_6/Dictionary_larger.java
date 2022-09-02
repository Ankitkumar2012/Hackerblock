package ass_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Dictionary_larger {
	public static void main(String[] args) {
		Scanner ak = new Scanner(System.in);
//		String str=ak.nextLine();
		String str = "cab";
		List<String> list = new ArrayList<>();
		ans(str, "", list);
		Collections.sort(list);
		for(int i=0;i<list.size();i++){
            if(str.compareTo(list.get(i))<0){
                System.out.println(list.get(i));
            }
        }

	}

	private static void ans(String str, String ans, List<String> list) {
		// TODO Auto-generated method stub
		if (str.length() == 0) {
			list.add(ans);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			String atr = str.substring(0, i) + str.substring(i + 1);
			char ch = str.charAt(i);
			ans(atr, ans + ch, list);
		}
//		System.out.println(k);
	}

}
