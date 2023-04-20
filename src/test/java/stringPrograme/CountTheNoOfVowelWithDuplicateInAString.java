package stringPrograme;

import java.util.LinkedHashSet;

public class CountTheNoOfVowelWithDuplicateInAString {

	public static void main(String[] args) {

		String s = "Engineer";
		String st = s.toLowerCase();
		int count = 0;
		char[] ch = st.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				count++;
			}

		}
		System.out.println(count);
	}

}
