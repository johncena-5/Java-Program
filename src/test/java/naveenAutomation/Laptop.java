package naveenAutomation;

public class Laptop {

	public static void main(String[] args) {
		
		String s="helloworld";
		//h1e1l1l2o1 w1o2r1l3d1
		String d="";
		int count=1;
		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i)!=' ') {
			if(s.charAt(i)==s.charAt(i+1)) {
				count++;
				
			}else {
				d=d+s.charAt(i)+count;
				count=1;
			}
		}	
	}
		d=d+s.charAt(s.length()-1)+count;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				d=d.substring(0,i)+" "+d.substring(i);
			}
		}
		System.out.println(d);
	}
}
