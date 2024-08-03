package stringPrograme;

public class PrimeNumBetween1to100 {

	public static void main(String[] args) {

		int a = 100;

		for (int i = 1; i < a; i++) {
			int count = 0;
			for (int j = 1; j < a; j++) {

				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);

			}
		}
	}
}
