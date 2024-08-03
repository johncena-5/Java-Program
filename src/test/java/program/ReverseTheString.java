package program;

public class ReverseTheString {

	public static void main(String[] args) {
		
		String s = "my name is ok";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			System.out.print(s.charAt(i));
		}

	}

}
