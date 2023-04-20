package arrayPrograme;

public class Append0AtTheLastInArrayUsingBBsort {

	public static void main(String[] args) {
		
		int []a= {0,4,0,0,5,0};
		int []b=new int[a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==0) {
					
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]); 
		}
	}
}
