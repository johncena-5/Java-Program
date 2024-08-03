package amdocsQuestion;

public class Programe {

	public static void main(String[] args) {
	
		String s="java";
		//print duplicate
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					System.out.println(s.charAt(j));
					break;
				}
			}	
		}
		
		System.out.println("=======================================");
		int count=0;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
		}
		System.out.println(count);
		
		System.out.println("=======================================");
		for(int i=0;i<s.length();i++) {
			boolean flag=false;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					flag=true;
				}
			}
			if(flag==false) {
				System.out.println(s.charAt(i));
			}
		}
	}
}
