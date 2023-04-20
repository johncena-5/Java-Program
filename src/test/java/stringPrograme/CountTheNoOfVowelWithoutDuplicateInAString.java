package stringPrograme;

import java.util.LinkedHashSet;

public class CountTheNoOfVowelWithoutDuplicateInAString {

	public static void main(String[] args) {
		
		String s ="Engineer";
		int count=0;
		String st = s.toLowerCase();
		char[] ch = st.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for( int i=0;i<ch.length;i++) {
			
			set.add(ch[i]);
		}
		
		for (Character cha : set) {
			
			if(cha=='a'||cha=='e'||cha=='i'||cha=='o'||cha=='u') {
				
				count++;
			}
		}
            System.out.println("the total no of vowel is without duplicate "+count);
	}

}
