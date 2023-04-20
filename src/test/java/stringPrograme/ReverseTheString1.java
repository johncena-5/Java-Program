package stringPrograme;

public class ReverseTheString1 {

	public static void main(String[] args) {
		
		String s = "java";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			System.out.println(s.charAt(i));
		}
		reverse();
		reverse1();
	}
	
	public static void reverse() {
		
		String s="java";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
	
	public static void reverse1() {
		
		String s="java";
		char[] ch = s.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.println(ch[i]);
		}
	}

}
