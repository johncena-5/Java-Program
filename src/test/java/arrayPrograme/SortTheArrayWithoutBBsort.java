package arrayPrograme;

public class SortTheArrayWithoutBBsort {

	public static void main(String[] args) {

		int[] a = { 1, 5, 4, 6, 3 };
		int min=a[0];
		int []b=new int[a.length];
		for (int i = 0; i < a.length; i++) {
			
			if(min>a[i]) {
				b[i]=a[i];	
			}
			System.out.println(b[i]);
		}
		
	}
}
