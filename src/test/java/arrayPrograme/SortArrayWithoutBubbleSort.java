package arrayPrograme;

public class SortArrayWithoutBubbleSort {

	public static void main(String[] args) {
		
		int a []= {1,2,0,4,9};
		int fmin=Integer.MAX_VALUE;
		int b[]=new int[a.length];
		int j=0;
		for(int i=0;i<a.length;i++) {
			
			if(fmin>a[i]) {
				
				fmin=a[i];
				b[j]=fmin;
			}
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		

	}

}
