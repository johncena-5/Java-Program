package browserStack;

import javax.swing.JOptionPane;

public class TakingInputFrompop {

	public static void main(String[] args) {
		
		
		JOptionPane j = new JOptionPane();
		String s = j.showInputDialog("Enter String");
		String newString="";
		for(int i=0;i<s.length();i++) {
			newString=s.charAt(i)+newString;
		}
		
		j.showMessageDialog(null, newString);
		
	}

}
