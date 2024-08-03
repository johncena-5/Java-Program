package practicePrograme;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t = " java is a programing language ";
		String s = t.trim();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				System.out.print(s.charAt(i));
			}
		}

		
	}

}
