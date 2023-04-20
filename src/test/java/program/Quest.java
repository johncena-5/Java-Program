package program;

public class Quest {

	public static void main(String[] args) {
		
		String s = "my name is abc";
		String[] st = s.split(" ");
		String str="";
//        for(int i=0;i<st.length;i++) {
//        	System.out.print(st[i]);
//        }
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)!=' ') {
			   	str=str+s.charAt(i);
			}
		}
		System.out.println(str);
	}

}
