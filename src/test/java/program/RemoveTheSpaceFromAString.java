package program;

public class RemoveTheSpaceFromAString {

	public static void main(String[] args) {
		
		String s = "my name is abc";
		
		String str="";
      
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)!=' ') {
			   	str=str+s.charAt(i);
			}
		}
		System.out.println(str);
	}
}
