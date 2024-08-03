package practicePrograme;

import java.util.LinkedHashSet;

public class FrequencyOfArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 2, 5 };
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {

			set.add(a[i]);
		}

		for (Integer obj : set) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {

				if (obj == a[i]) {

					count++;
				}
			}
			System.out.println(obj + " is present in array " + count +" times");
		}
	}
}
