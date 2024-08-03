package practicePrograme;

public class DuplicateWordInAString {

	public static void main(String[] args) {

		String s = "java is a java Programing java is a";
		String[] st = s.split(" ");


		for (int i = 0; i < st.length; i++) {
			
			int count = 0;
			for (int j = i + 1; j < st.length; j++) {

				if (st[i].equals(st[j])) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(st[i]);
			}
		}
	}
}
