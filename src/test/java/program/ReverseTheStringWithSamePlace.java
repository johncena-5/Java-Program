package program;

public class ReverseTheStringWithSamePlace {

	public static void main(String[] args) {
		
		String s = "java class is going on";
//		String d = "";
//		for(int i=s.length()-1;i>=0;i--) {
//			d=d+s.charAt(i);
//		}
//		String[] st = d.split(" ");
//		for(int i=st.length-1;i>=0;i--) {
//			System.out.print(st[i]+" ");
//		}
		String st []= s.split(" ");
		String d="";
		for(int i=0;i<st.length;i++) {
			for(int j=st[i].length()-1;j>=0;j--) {
				d=d+st[i].charAt(j);
			}
		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				d = d.substring(0, i)+" "+d.substring(i);
			}
		}
		System.out.println(d);
        
	}

}
