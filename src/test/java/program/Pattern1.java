package program;

public class Pattern1 {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=n;i>0;i--) {
			for(int j=n-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
