package stringPrograme;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String s="ava";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s)) {
			System.out.println("given string is palindrome");
		}else {
			System.out.println("given string is not a palindrom");
		}

	}

}
