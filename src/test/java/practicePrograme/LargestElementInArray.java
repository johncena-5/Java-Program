package practicePrograme;

public class LargestElementInArray {

	public static void main(String[] args) {

		int a[] = { -2,-2, 0, 3, 4, 5 };
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {

				max = a[i];
			}
		}
		System.out.println(max);
		m();
	}
	
	public static void m() {
		int a[] = { -2,-2, 22, 3, 4, 5 };
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i]<min) {

				min = a[i];
			}
		}
		System.out.println(min);
	}
}
