package arrayPrograme;

import java.util.LinkedHashSet;

public class CountDuplicateInAnArray {

	public static void main(String[] args) {

		int[] a = { 4, 5, 4, 1, 5, 3, 2 };
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) {

			set.add(a[i]);
		}

		for (Integer f : set) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {

				if (f == a[i]) {

					count++;
				}
			}
			if(count>1)
			System.out.println(" number " + f + " repeating  " + count + " times ");
		}
	}
}
