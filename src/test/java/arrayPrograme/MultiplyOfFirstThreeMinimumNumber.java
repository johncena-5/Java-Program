package arrayPrograme;

public class MultiplyOfFirstThreeMinimumNumber {

	public static void main(String[] args) {
		int[] a = { 1, 5, 4, 6, 3 };
		int mul=1;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
		}
		for(int k=0;k<3;k++) {
			
			mul=mul*a[k];
		}
		System.out.println(mul);

	}

}
