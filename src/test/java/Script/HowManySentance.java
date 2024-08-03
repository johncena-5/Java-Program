package Script;

public class HowManySentance {

	public static void main(String[] args) {
		
		
		String s="java's is a clas's";
		String []st = s.split("'");
		int count=0;
		for(int i=0;i<st.length;i++) {
			count++;
//			if(s.charAt(i)==' ') {
//				count++;
//			}
		}
		System.out.println(count);

	}

}
