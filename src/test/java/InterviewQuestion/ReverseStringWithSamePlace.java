package InterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseStringWithSamePlace {

	public static void main(String[] args) {

		String s = "mohan123rohit456";
		String a = "";
		List<Character> l = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				a = a + s.charAt(i);
			} else {
				StringBuffer sb = new StringBuffer(a);
				char[] t = sb.reverse().toString().toCharArray();
	
				for (int j = 0; j < t.length; j++) {
					l.add(t[j]);
				}
				l.add(s.charAt(i));
				a = "";
			}
		}
		System.out.println(l);
	}
}
