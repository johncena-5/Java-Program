package mock;

import java.util.Arrays;
import java.util.Stack;
import java.util.TreeSet;

public class SeprateZeroAndOne {

	public static void main(String[] args) {
		
	
		
		int a[]= {0,1,0,1,0,1};
		int fmin=a[0];
		int b[]=new int[a.length];
		int j=0;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==0) {
				
				b[j]=a[i];
				j++;
			}	
		}
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==1) {
				b[j]=a[i];
				j++;
			}
		}
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("=============*****************==============");
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
