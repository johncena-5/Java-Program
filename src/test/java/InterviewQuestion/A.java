package InterviewQuestion;

public class A {

	public static void main(String[] args) {

		String s = "hari kumar ravi";
		String newString = "";
		String[] split = s.split(" ");

		for (int i = 0; i < split.length; i++) {

			for (int j = 0; j < split[i].length(); j++) {

				if (j == 0 || j == split[i].length() - 1) {
					newString = newString + String.valueOf(split[i].charAt(j)).toUpperCase();
				} else {
					newString = newString + split[i].charAt(j);
				}
			}
		}

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == ' ') {
				newString = newString.substring(0, i) + " " + newString.substring(i);
			}
		}
		System.out.println(newString);
		
		String s1="hari ravi";
		String[] s2 = s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			String s3 = s2[i];
			for(int j=0;j<s3.length();j++)
			{
				if(j==0||j==s3.length()-1)
				{
					char ch = s3.charAt(j);
					char ch1 = (char) (ch-32);
					System.out.print(ch1);
				}
				else
				{
					System.out.print(s3.charAt(j));
				}
			}
			System.out.print(" ");
		}
	}

}
