package Script;

public class MergeArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3 };
		int b[] = { 4, 5, 6, 7 };

		int c[] = new int[a.length + b.length];

		int j = 0;
		for (int i = 0; i < a.length; i++) {

			c[j] = a[i];
			j++;
		}
		for (int i = 0; i < b.length; i++) {

			c[j] = b[i];
			j++;
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
