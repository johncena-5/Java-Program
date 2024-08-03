package InterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapDigit {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int index=3;
//		int b[]=new int[a.length];
//		int j=0;
//		for(int i=index;i<a.length;i++) {
//			b[j]=a[i];
//			j++;
//		}
//		for(int i=0;i<index;i++) {
//			b[j]=a[i];
//			j++;
//		}
//		
//		System.out.println(Arrays.toString(b));

	
	
	//==================
	for(int i=0;i<index;i++) {
		int k, f;
		f=a[0];
	for ( k = 0; k < a.length-1; k++) {
		a[k]=a[k+1];
	}
	a[k]=f;
	}
	
	System.out.println(Arrays.toString(a));
	}

}
