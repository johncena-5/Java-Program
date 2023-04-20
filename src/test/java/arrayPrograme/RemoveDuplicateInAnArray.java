package arrayPrograme;

import java.util.LinkedHashSet;

public class RemoveDuplicateInAnArray {

	public static void main(String[] args) {


		int []a= {4,5,4,1,5,3,2};
		//System.out.println(a.length);
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for(int i=0;i<a.length;i++) {
			
			set.add(a[i]);
		}
		System.out.println(set);
	}
}
