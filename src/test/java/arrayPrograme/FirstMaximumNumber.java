package arrayPrograme;

public class FirstMaximumNumber {

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
		System.out.println(a[a.length - 1]);
		m();
	}

	public static void m() {

		int[] a = { 1, 5, 4, 6, 3 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
