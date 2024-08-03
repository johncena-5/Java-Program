package program;

public class CompareTwoStringRemoveDuplicateWords {

	public static void main(String[] args) {

		String s = "This is fun show";
		String s1 = "fun tv show";
		String[] st = s.split(" ");
		String[] s1t = s1.split(" ");
		String rev = "";
		// this is tv

		for (int i = 0; i < st.length; i++) {
			boolean flag = false;
			for (int j = 0; j < s1t.length; j++) {
				if (st[i].equals(s1t[j])) {
					flag = true;
				}
			}
			if (flag == false) {
				rev = rev +" "+ st[i];
			}
		}
		for (int i = 0; i < s1t.length; i++) {
			boolean flag = false;
			for (int j = 0; j < st.length; j++) {
				if (s1t[i].equals(st[j])) {
					flag = true; 
				}
			}
			if (flag == false) {
				rev = rev +" "+ s1t[i];
			}
		}
		System.out.println(rev);
	}
}
