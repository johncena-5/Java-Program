package Script;

import org.testng.annotations.Test;

public class Str {

	@Test
		public void java_$java() {
		String s = "Dhoni is good player";
		String name = "sachin";
		String word = "";
		
		
		String [] w = s.split(" ");
		for(int i=0; i<w.length;i++) {
			
			if(w[i].equalsIgnoreCase("is")) {
				word = word+name+" ";
			}else {
				
				word = word+w[i]+" ";
			}		
		}
		System.out.println(word);
		
	}
}
