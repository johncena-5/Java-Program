package program;

public class ReverseTheStringWithSamePosition {

	public static void main(String[] args) {

		String s = "I love programming class";
		String st = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			st = st + s.charAt(i);

		}
//		System.out.println(st);
		String[] hg = st.split(" ");
		for (int i = hg.length - 1; i >= 0; i--) {

			System.out.print(hg[i]+" ");
		}
	}
}
