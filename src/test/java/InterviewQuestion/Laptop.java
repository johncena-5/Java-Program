package InterviewQuestion;

public class Laptop {

	public static void main(String[] args) {

		String s = "abcdefg";
		int start = 0;
		int end=s.length();
		System.out.println(s);
		for (int i = 0; i < s.length(); i++) {

			if(i%2==0) {
				start++;
				String sub = s.substring(start,end);
				System.out.println(sub);
			}else {
				end--;
				String sub = s.substring(start,end);
				
				System.out.println(sub);
			}
		}
	}
}
