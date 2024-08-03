package arrayPrograme;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class SortTheArray {

	public static void main(String[] args) {

		int[] a = { 6, 1, 7, 9, 0, 1 };
		// this the first way
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		// second way
		TreeSet<Integer> set = new TreeSet<>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
			
		}
		System.out.println(set);
		

	}
}
