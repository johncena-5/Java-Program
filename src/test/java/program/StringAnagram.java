package program;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class StringAnagram {

	public static void main(String[] args) {

		String s = "Mohan";
		String t = "ohanM";

		String st = s.toLowerCase();
		String str = t.toLowerCase();

		char[] ch = st.toCharArray();
		char[] ch1 = str.toCharArray();

		if (ch.length == ch1.length) {

			Arrays.sort(ch1);
			Arrays.sort(ch);
			if (Arrays.equals(ch, ch1)) {
				System.out.println("anagram");
			} else {
				System.out.println("not anagram");
			}
		} else {
			System.out.println("not anagram");
		}
	}
}
