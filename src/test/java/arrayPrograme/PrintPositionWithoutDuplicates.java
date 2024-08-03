package arrayPrograme;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class PrintPositionWithoutDuplicates {

	public static void main(String[] args) {

		int a[] = { 4, 5, 4, 1, 5, 3, 2 };
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) {

			set.add(a[i]);
		}
		System.out.println(set);
		List<Integer> list = new ArrayList<Integer>(set);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)+" number is present in position of "+ i);
		}
	}
}
