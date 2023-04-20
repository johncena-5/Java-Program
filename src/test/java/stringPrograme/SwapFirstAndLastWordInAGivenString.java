package stringPrograme;

public class SwapFirstAndLastWordInAGivenString {

	public static void main(String[] args) {
		
		
		String s = "java class is going on";
		String[] sh = s.split(" ");
		
		//swap the words
		String temp = sh[0];
		sh[0]=sh[sh.length-1];
		sh[sh.length-1]=temp;
		
		for(int i=0;i<sh.length;i++) {
			System.out.print(sh[i]+" ");
		}
		
	}

}
