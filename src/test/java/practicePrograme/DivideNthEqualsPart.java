package practicePrograme;

public class DivideNthEqualsPart {

	public static void main(String[] args) {
		
		String s = "abcabcbca";
		String a="",b="",c="";
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='a') {
				a=a+s.charAt(i);
			}else if(s.charAt(i)=='b') {
				b=b+s.charAt(i);
			}else {
				c=c+s.charAt(i);
			}
		}
		System.out.println(a+"\n"+b+"\n"+c);

	}

}
