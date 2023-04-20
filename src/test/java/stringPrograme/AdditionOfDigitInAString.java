package stringPrograme;

public class AdditionOfDigitInAString {

	public static void main(String[] args) {
		
		String s ="b2c1d5";
		int sum = 0;
		
		for(int i=0;i<s.length();i++) {
		
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				
				int a = Character.getNumericValue(s.charAt(i));
				
				sum=sum+a;
			
			}
		}
		System.out.println(sum);
	}
}
