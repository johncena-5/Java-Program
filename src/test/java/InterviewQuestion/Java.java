package InterviewQuestion;

public class Java {

	public static void main(String[] args) {

		int a[]= {7,6,5,4,3,2,1};
//		int a[] = { 7, 1, 5, 3, 6, 4};
		int profit=0;
		for (int i = 0; i < a.length; i++) {
			for(int j=i+1;j<a.length;j++) {
				 int Cureentprofit = a[j]-a[i];
				 if(Cureentprofit>profit) {
					 profit=Cureentprofit;
				 }
			}
		}
		System.out.println(profit);
//		m();
	}
	
	public static void m() {
		int prices[]= {7,1,5,3,6,4};
		 int globalProfit = 0;
			// the reason prices.length - 1 is because we are using the second for loop to scan every element to the right of i
		  for (int i = 0; i < prices.length ; i++) {
			  // the reason j is i + 1 is because we are scanning all the combinations of the first for loop
		    for (int j = i + 1; j < prices.length; j++) {
		      int currentProfit = prices[j] - prices[i];

		      if (currentProfit > globalProfit) {
		        globalProfit = currentProfit;
		      }
		    }
		  }
		  System.out.println(globalProfit);

	}

}
