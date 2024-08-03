package program;

public class CountTheSimilarCharacter {

	public static void main(String[] args) {

		String s = "AAbACCCdEEAA";
		String d = "";
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;

			} else {
				d = d + s.charAt(i) + count;
				count = 1;
			}
		}

		d = d + s.charAt(s.length() - 1) + count;
		System.out.println(d);
	}
}
