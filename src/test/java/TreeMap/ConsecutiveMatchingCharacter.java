package TreeMap;

public class ConsecutiveMatchingCharacter {

	public static void main(String[] args) {

		String s = "abbbcdeccbc";int count=0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
				if(count>1) {
					count=0;
					continue;
				}
				System.out.println(s.charAt(i));
			}
		}
	}
}
