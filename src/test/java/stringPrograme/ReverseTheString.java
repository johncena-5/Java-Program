package stringPrograme;

import org.testng.annotations.Test;

public class ReverseTheString {
	
	
	public static void main(String[]args) {
		
		String s = "java";
		
		StringBuffer sb = new StringBuffer(s);
		
		sb.reverse();
		System.out.println(sb);
	}

}
