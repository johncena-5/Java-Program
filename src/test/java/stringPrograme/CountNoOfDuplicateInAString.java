package stringPrograme;

import java.util.LinkedHashSet;

public class CountNoOfDuplicateInAString {

	public static void main(String[] args) {
		
		String s = "kannada";
		String st = s.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0;i<st.length();i++) {
			
			set.add(st.charAt(i));
		}
		
		System.out.println(st.length()-set.size());     
	}
}
