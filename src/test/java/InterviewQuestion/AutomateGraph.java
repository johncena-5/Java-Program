package InterviewQuestion;

public class AutomateGraph {

	  int j=12;  
	    void add()  
	    {  
	        j=j+12;  
	        System.out.println("J="+j);  
	    }  
	    public void finalize()  
	    {  
	        System.out.println("Object is garbage collected");  
	    }  
	    public static void main(String[] args) {  
	        new AutomateGraph().add();  
	        System.gc();  
	        new AutomateGraph().add();  
	    }  
	}  
	      

