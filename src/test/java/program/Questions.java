package program;

public class Questions {

	public static void main(String[] args) {
		
		String s = "i am selenium";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)!=' ') {
				rev=rev+s.charAt(i);
			}
		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				rev=rev.substring(0, i)+" "+rev.substring(i);
			}
		}
		System.out.println(rev);
	}
}
