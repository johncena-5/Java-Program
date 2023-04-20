package stringPrograme;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharInString {

	public static void main(String[] args) {
	
		
		String s = "Kannada";
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(int i=0;i<s.length()-1;i++) {
			
			set.add(s.charAt(i));
		}
		System.out.println(set);
	}

}
