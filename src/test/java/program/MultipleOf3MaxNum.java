package program;

public class MultipleOf3MaxNum {

	public static void main(String[] args) {
		
		
		int a[]= {0,-2,-3,-4,-5};
		int fmax=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		int tmax=Integer.MIN_VALUE;
				
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>fmax) {
				
				tmax=smax;
				smax=fmax;
				fmax=a[i];
			}else if(a[i]>smax&&a[i]!=smax) {
				
				tmax=smax;
				smax=a[i];
			}else if(a[i]>tmax&&(a[i]!=smax||a[i]!=fmax)) {
				
				tmax=a[i];
			}
		}
		System.out.println(fmax+" "+smax+" "+tmax);

	}

}
