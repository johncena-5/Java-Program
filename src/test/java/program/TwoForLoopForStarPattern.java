package program;

public class TwoForLoopForStarPattern {

	public static void main(String[] args) {
		
		 String s="india";
		 for (int i = 1; i <= 5; i++) {
	            for (int j = 1; j <= 5; j++) {
	                if (j <= 5 - i) {
	                    System.out.print(" ");
	                } else {
	                    System.out.print(s.charAt(5-j));
	                }
	            }
	            System.out.println();
		 }
	}
}
