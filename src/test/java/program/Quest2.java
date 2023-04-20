package program;

public class Quest2 {

	public static void main(String[] args) {

		String s = "I love programming";
		String st = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			st = st + s.charAt(i);

		}
		String[] hg = st.split(" ");
		for (int i = hg.length - 1; i >= 0; i--) {

			System.out.print(hg[i] + " ");
		}
	}
}
