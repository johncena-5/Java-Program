package practicePrograme;

import java.util.ArrayList;
import java.util.TreeSet;

public class InsertNumInArray {

	public static void main(String[] args) {

		String s = "java is 123 class. And this my 546 class. It is a 345.";

//		String sj = s.replace(".", "");
		String sum = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '.') {
				sum = sum + s.charAt(i);
			}
		}
		String[] st = sum.split(" ");

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < st.length; i++) {
			try {
				int a = Integer.parseInt(st[i]);
				list.add(a);
			} catch (Exception e) {

			}
		}
		System.out.println(list);
	}
}
