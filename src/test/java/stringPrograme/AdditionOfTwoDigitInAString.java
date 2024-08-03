package stringPrograme;

public class AdditionOfTwoDigitInAString {

	public static void main(String[] args) {
		
		
		String s = "a11b12c2";
		String g ="";
		int sum=0;
		boolean flag=false;
		for(int i=0;i<s.length();i++) {
			
			if(Character.isDigit(s.charAt(i))) {
				g=g+s.charAt(i);
				flag=true;
			}else {
				if(flag) {
					g=g+"-";
					flag=false;
				}
			}
		}
		String[] d = g.split("-");

		for(int i=0;i<d.length;i++) {
			int a = Integer.parseInt(d[i]);
			sum=sum+a;
		}
		System.out.println(sum);
	}

}
