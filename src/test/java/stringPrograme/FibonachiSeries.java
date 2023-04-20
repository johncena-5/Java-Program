package stringPrograme;

public class FibonachiSeries {

	public static void main(String[] args) {
		
		int sum=0,num=5;
		int n=0,n1=1;
		for(int i=0;i<num;i++) {
			
			sum=n+n1;
			System.out.println(sum);
			n=n1;
			n1=sum;
		}

	}

}
