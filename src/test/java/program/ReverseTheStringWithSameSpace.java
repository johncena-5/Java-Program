package program;

public class ReverseTheStringWithSameSpace {

	//print all the possible substring
	public static void main(String[] args) {
		
		String s="india";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
//			System.out.println(s.substring(i, j));
			}
		}
//		m();
		n();
//		j();
		
	}
	
	//reverse the string with same space
	public static void m() {
		
		String s="My name is Raja";
		String rev="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ')
			rev=s.charAt(i)+rev;
		}
		
		System.out.println(rev);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				rev = rev.substring(0, i) + " " + rev.substring(i);
			}
		}
		System.out.println(rev);
	}
	
	//print all the possible substring with length two
	public static void n() {
		String s="india";
		for(int i=0;i<s.length()-1;i++) {
			System.out.println(s.substring(i, i+2));
		}
	}
	//reveres the string without using loop
	public static void j() {
		
		String s="java";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
	}
}
