package naveenAutomation;

public class AnagrameWithoutInbuildFunction 
{
    public static boolean isAnnagram(String a,String b)
    {
    	if (a.length()!=b.length()) 
    	{
    		return false;
		}
    	boolean flag=false;
    	for (int i = 0; i < a.length(); i++)
    	{
    		flag=false;
    		for (int j = 0; j < b.length(); j++)
    		{  			
				if (a.charAt(i)==b.charAt(j))
				{
					flag=true;
				}
			}
    		if (flag==false)
    		{
    			break;
			}
		}
    	if (flag==false) {
			return false;
		} else {
			return true;
		}
    	
    }
	public static void main(String[] args) {	
		String s = "race";
		String d = "care";
	System.out.println(isAnnagram(s, d));

	}
}
