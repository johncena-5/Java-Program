package practice;

import javax.swing.JOptionPane;

public class UserProvideInput {

	public static void main(String[] args) {

		String s = "";
		s = JOptionPane.showInputDialog("Enter your name");
		String d = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			d = d + s.charAt(i);
		}
		JOptionPane.showMessageDialog(null, " Output string ==>> " + d);
	}
}
