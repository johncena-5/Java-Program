package arrayPrograme;

public class FirstMinimumNumber {

	public static void main(String[] args) {

		int[] a = { 1, 5, 4, 6, 3 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a[a.length - 5]);
		n();
	}

	public static void n() {

		int[] a = { 1, 5, 4, 6, 3 };
		int min = a[0];
		for (int i = 0; i < a.length; i++) {

			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);

	}
}
