package InterviewQuestion;

import java.util.Arrays;

public class ArrayPrograme {

	public static void main(String[] args)  {

		int a[] = { 3, 4, 5, 6, 7 };
		int input = 1;
		int j=0;
		int b[]=new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (i>=input) {
				b[j]=a[i];
				j++;
			}
		}
		for(int i=0;i<input;i++) {
			b[j]=a[i];
			j++;
		}
			System.out.println(Arrays.toString(b));	
	}
}
