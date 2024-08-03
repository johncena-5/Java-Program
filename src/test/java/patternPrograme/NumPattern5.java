package patternPrograme;

public class NumPattern5 {

	public static void main(String[] args) {

		int n = 5;
		int k = 1;
		int y = 2;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print(y);
				} else {
					System.out.print(k);
				}
			}
			System.out.println();
		}
	}
}
