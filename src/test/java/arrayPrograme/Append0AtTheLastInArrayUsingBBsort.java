package arrayPrograme;

public class Append0AtTheLastInArrayUsingBBsort {

	public static void main(String[] args) {
		
		int []a= {0,4,0,0,5,0};
		int []b= new int [a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int k=0;
		for(int i=a.length-1;i>0;i--) {
			b[k]=a[i];
			k++;
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]);
		}
	}
}
