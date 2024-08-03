package amdocsQuestion;

public class OpenBracketSHouldClose {

	public static void main(String[] args) {

		String s = "}{";
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == '{' && s.charAt(j) == '}') {
					flag = true;
				}else if(s.charAt(i)=='(' && s.charAt(j)==')') {
					flag=true;
				}else if(s.charAt(i)=='[' && s.charAt(j)==']') {
					flag=true;
				}else if(s.charAt(i)=='}') {
					
				}
			}
		}
		System.out.println(flag);
	}
}
