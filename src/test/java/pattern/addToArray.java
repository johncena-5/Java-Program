package pattern;

import java.util.Arrays;

public class addToArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3 };
		int b[] = { 4, 5, 7, 9 };
		int c[] = new int[a.length > b.length ? a.length : b.length];

		for (int i = 0; i < c.length; i++) {

			try {
				c[i] = a[i] + b[i];
			} catch (Exception e) {

				if (a.length > b.length) {
					c[i] = a[i];
				} else {
					c[i] = b[i];
				}
			}
		}
		System.out.println(Arrays.toString(c));
	}
}
