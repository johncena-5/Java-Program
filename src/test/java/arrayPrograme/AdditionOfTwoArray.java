package arrayPrograme;

import java.util.Arrays;

public class AdditionOfTwoArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 5 };
		int b[] = { 2, 3, 4 };
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
