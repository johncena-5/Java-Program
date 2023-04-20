package arrayPrograme;

public class MultipleOf1stThreeMinimumNumberWithoutUsingBBsort {

	public static void main(String[] args) {

		int[] a = { 1, 4, 2, 7, 8 };
		int fmin = Integer.MAX_VALUE;
		int smin = Integer.MAX_VALUE;
		int tmin = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {

			if (fmin > a[i]) {

				smin = fmin;
				fmin = a[i];
			} else if (smin > a[i] && a[i] != fmin) {
				
				tmin=smin;
				smin = a[i];
			}else if(tmin>a[i]&&a[i]!=smin) {
				
				tmin=a[i];
			}
		}
		System.out.println(fmin*smin*tmin);

	}
}
