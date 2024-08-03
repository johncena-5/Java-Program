package stringPrograme;

public class PrintEveryCharacterAndTheirSquenceInAscendingOrder {

	public static void main(String args[]) {

		String d = "Hello World";
		String s="";
		for(int i=0;i<d.length();i++) {
			if(d.charAt(i)!=' ') {
				s=s+d.charAt(i);
			}
		}
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					if (i < j) {
						break;
					}
					count++;
				}
			}
			System.out.print(s.charAt(i) + "" + count+" ");
		}
	}
}
