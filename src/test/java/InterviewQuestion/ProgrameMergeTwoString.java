package InterviewQuestion;

public class ProgrameMergeTwoString {

	public static void main(String[] args) {

		String s = "race";
		String d = "12";
		String f = "";
		int j = 0;
		for (int i = 0; i < s.length(); i++) {

			try {
				f = f + s.charAt(i) + d.charAt(j);
				j++;

			} catch (Exception e) {

				if (s.length() > d.length()) {
					f = f + s.charAt(i);
				} else {
					f = f + d.charAt(i);
				}
			}
		}
		System.out.println(f);
	}
}
