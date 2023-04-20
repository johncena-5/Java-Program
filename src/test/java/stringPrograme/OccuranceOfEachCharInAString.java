package stringPrograme;

import java.util.LinkedHashSet;

public class OccuranceOfEachCharInAString {

	public static void main(String[] args) {

		String s = "kannada";
		String st = s.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < st.length(); i++) {

			set.add(st.charAt(i));
		}
			for (Character ch : set) {
				int count = 0;
				for (int j = 0; j < s.length(); j++) {

					if (ch == s.charAt(j)) {
						count++;
					}
				}
				System.out.println(ch + " occurane of letter " + count);
			}

		}

	}


