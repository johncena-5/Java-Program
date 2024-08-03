package stringPrograme;

public class ReverseFirstAndLastTwoWordsInAGivenString {

	public static void main(String[] args) {
		
		String s = "java class is going on";
		String []st = s.split(" ");
		String d="";
		for(int i=0;i<st.length;i++) {
			if(i==0||i==st.length-1) {
				for(int j=st[i].length()-1;j>=0;j--) {
					d=d+st[i].charAt(j);
				}
			}
		}
		System.out.println();
		
		
		
		
		
		

	}

}
