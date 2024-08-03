package pattern;

public class Patter {

	public static void main(String[] args) {
		
		int a=5;
		for(int i=1;i<=a;i++) {
			for(int j=i;j<=a;j++) {
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
