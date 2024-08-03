package program;

public class SumOfFirstThreeMinElement {

	public static void main(String[] args) {
		
		int a[]= {7,-6,11,9,0,4};
		int fmin=Integer.MAX_VALUE;
		int smin=Integer.MAX_VALUE;
		int tmin=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++) {
			
			if(fmin>a[i]) {
				
				tmin=smin;
				smin=fmin;
				fmin=a[i];
			}else if(smin>a[i]&&a[i]!=fmin) {
				
				tmin=smin;
				smin=a[i];
			}else if(tmin>a[i]&&a[i]!=smin&&a[i]!=fmin) {
				
				tmin=a[i];
			}
		}
		System.out.println(fmin+" "+smin+" "+tmin);
		System.out.println(fmin+smin+tmin);

	}

}
