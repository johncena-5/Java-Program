package stringPrograme;

import java.util.LinkedHashSet;

public class PositionOfEachCharInAStringWithoutDupt {

	public static void main(String[] args) {
		
		String s = "Kannada";
		String st = s.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0;i<st.length();i++) {
			set.add(st.charAt(i));
			
		}
		for (Character ch : set) {
			for(int i=0;i<s.length();i++) {
				
				if(ch==st.charAt(i)) {
					
					System.out.println(ch +" "+(i));
					break;
				}
			}
		}

	}

}
