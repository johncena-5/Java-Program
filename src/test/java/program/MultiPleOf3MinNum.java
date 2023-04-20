package program;

public class MultiPleOf3MinNum {

	public static void main(String[] args) {

		int a[] = {-2,2,3,4,5};
		int fmin = a[0];
		int smin = a[1];
		int tmin = a[2];
		for (int i = 0; i < a.length; i++) {

			if (fmin > a[i]) {

				smin = fmin;
				fmin = a[i];
			} else if (smin > a[i] && a[i] != fmin) {

				tmin = smin;
				smin = a[i];
			} else if (tmin > a[i] && a[i] != smin && a[i] != fmin) {

				tmin = a[i];
			}
		}
		System.out.println(fmin + " " + smin + " " + tmin);
		System.out.println(fmin * smin * tmin);
	}
}
