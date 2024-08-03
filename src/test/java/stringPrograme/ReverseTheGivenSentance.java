package stringPrograme;

public class ReverseTheGivenSentance {

	public static void main(String[] args) {

		m1();
	}

	public static void m1() {
		String s = "java class is going on";
		String[] st = s.split(" ");
		for (int i = s.length()-1; i>=0; i--) {
             System.out.print(s.charAt(i));
			
		}
	}
}
