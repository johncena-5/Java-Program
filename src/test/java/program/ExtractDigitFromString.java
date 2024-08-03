package program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExtractDigitFromString {

	public static void main(String[] args) {

		String s = "87jna768va c89las921s";
		String g = "";
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				g = g + s.charAt(i);
				flag = true;
			} else {
				if (flag) {
					g = g + "-";
					flag = false;
				}
			}
		}
		List<Integer> l = new ArrayList<>();
		String[] d = g.split("-");
		for (int i = 0; i < d.length; i++) {
			int a = Integer.parseInt(d[i]);
			l.add(a);
		}
		System.out.println(l);
		int max = Integer.MIN_VALUE;
		for(int i=0;i<l.size();i++) {
			if(l.get(i)>max) {
				max=l.get(i);
			}
		}
		System.out.println(max);
	}
}
