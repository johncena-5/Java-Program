package arrayPrograme;

import java.util.Arrays;

public class SortArrayWithoutBubbleSort {

	public static void main(String[] args) {

		int a[]= {1,6,3,0,-1};
		for(int i=1;i<a.length;i++) {
			int current=a[i];
			int j=i-1;
			while(j>=0&&a[j]>current) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=current;
		}
		System.out.println(Arrays.toString(a));
	}
}
