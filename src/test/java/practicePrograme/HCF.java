package practicePrograme;

public class HCF {

	public static void main(String[] args) {

		int a = 15, b = 9;
		int hcf = (a > b) ? a : b;
	
		while(hcf>0) {
			if(hcf%a==0 && hcf%b==0) {
				System.out.println(hcf);
				break;
			}
			hcf++;
		}
	}
}
