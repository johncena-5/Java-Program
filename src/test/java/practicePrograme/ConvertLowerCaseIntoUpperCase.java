package practicePrograme;

public class ConvertLowerCaseIntoUpperCase {

	public static void main(String[] args) {
		
		
		String s = "JavA";
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				
			System.out.print(Character.toLowerCase(s.charAt(i)));
				
			}else {
				System.out.print(Character.toUpperCase(s.charAt(i)));
			}
		}

	}

}
