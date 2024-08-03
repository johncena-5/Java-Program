package practicePrograme;

public class PrintArrayWhichIsPresentInEvenIndex {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		for(int i=0;i<a.length;i++) {
			
			if(i%2==0) {
				System.out.println(a[i]);
			}
		}
	}
}
