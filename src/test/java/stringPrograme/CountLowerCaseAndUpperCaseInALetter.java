package stringPrograme;

public class CountLowerCaseAndUpperCaseInALetter {

	public static void main(String[] args) {
		
		String s = "JaVa";
		int lowercase=0;
		int uppercase=0;
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
				
				lowercase++;
			}else if(s.charAt(i)>='A'&& s.charAt(i)<='Z') {
				uppercase++;
			}
		}
		System.out.println("The number of upper letter "+uppercase);
		System.out.println("The number of lower letter "+lowercase);

	}

}
