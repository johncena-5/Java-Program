package sample;

public class Practice {

	public static void main(String[] args) {

		int x=994;
		int rem=0;
		while(x>0) {
			
			rem = x%10;
			x=x/10;
		}
		System.out.println(rem);
	}
}
