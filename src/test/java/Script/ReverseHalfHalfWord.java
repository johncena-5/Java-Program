package Script;

public class ReverseHalfHalfWord {

	public static void main(String[] args) {
		
		String s = "sachin";//casnih
		String sf="";
		String sd="";
		for(int i=0;i<s.length();i++) {
			
			if(i>2) {
				sf=sf+s.charAt(i);
			}else {
				sd=sd+s.charAt(i);
			}
		}
		
		for(int i=sf.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		for(int i=sd.length()-1;i>=0;i--) {
			System.out.print(sf.charAt(i));
		}
		
		String s1=s.substring(0, 3);
		String s2=s.substring(3, 6);
		for(int i=s1.length()-1;i>=0;i--)
		{
		//	System.out.print(s1.charAt(i));
		}
		for(int i=s2.length()-1;i>=0;i--)
		{
		//	System.out.print(s2.charAt(i));
		}

	}

}
