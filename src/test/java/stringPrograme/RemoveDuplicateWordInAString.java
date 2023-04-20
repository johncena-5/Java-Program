package stringPrograme;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordInAString {

	public static void main(String[] args) {
		
		
		String s = "i am I AM fine";
		String sh = s.toLowerCase();
		String[] st = sh.split(" ");
		String newString="";
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for(int i=0; i<st.length;i++) {
			set.add(st[i]);
		
		}
		System.out.println(set);

	}

}
