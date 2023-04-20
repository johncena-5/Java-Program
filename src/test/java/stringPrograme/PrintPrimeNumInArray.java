package stringPrograme;

public class PrintPrimeNumInArray {

	public static void main(String[] args) {

		int a[] = { 1, 3, 2, 4, 6, 5, 9, 7};

		for (int i = 0; i < a.length; i++) {

			int count = 0;
			for (int j = 1; j <=a[i]; j++) {

				if (a[i] % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(a[i]);
			}
		}
	}
}
