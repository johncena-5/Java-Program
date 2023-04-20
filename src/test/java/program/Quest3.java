package program;

public class Quest3 {

	public static void main(String[] args) {

		String s = "This is fun show";
		String s1 = "fun tv show";
		String[] st = s.split(" ");
		String[] s1t = s1.split(" ");
		String rev = "";
		// this is tv

		for (int i = 0; i < st.length; i++) {
			for (int j = 0; j < s1t.length; j++) {

				if (st[i] != s1t[j]) {

					rev = rev + st[i];

				}
			}
		}
		System.out.println(rev);
	}
}
