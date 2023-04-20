package stringPrograme;

public class SegregateAlphaNumAndSpecialChar {

	public static void main(String[] args) {
		
		String s = "a2B*C5?d";
		String alp="";
		String num="";
		String spl="";
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				
				alp=alp+s.charAt(i);
			}else if(Character.isDigit(s.charAt(i))) {
			num=num+s.charAt(i);
			}else {
				spl=spl+s.charAt(i);
			}
			
		}
		System.out.println(alp+" "+num+" "+spl);

	}

}
