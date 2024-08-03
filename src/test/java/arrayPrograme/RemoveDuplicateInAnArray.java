package arrayPrograme;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class RemoveDuplicateInAnArray {

	public static void main(String[] args) {


		int []a= {4,5,4,1,5,3,2};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		System.out.println(set);
		m();
	}
	
	public static void m() {
		
		int []a= {4,5,4,1,5,3,2};
		LinkedList<Integer> l= new LinkedList<>();
		for(int i=0;i<a.length;i++) {
			boolean flag = false;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					
					flag=true;
				}
			}
			if(flag==false) {
				l.add(a[i]);
			}
		}
		System.out.println(l);
		
	}
}
