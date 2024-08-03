package TreeMap;

public class CheckRange {

	public static void main(String[] args) {

		int a[] = { 5, 1, 2 };
		int b[] = { 5, 1, 2, 4, 3 };
		int count = 0;

		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {

				if (b[i] + b[j] >= 5 && b[i] + b[j] <= 8) {
					count++;
				}
			}
		}

//		System.out.println(count);
		int profit = m();
		System.out.println(profit);
	}

	public static int maxProfit() {

		int a[] = { 7, 2, 1, 5, 3, 6, 4 };

		int sell = Integer.MIN_VALUE;
		int buy = Integer.MAX_VALUE;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > sell) {
				sell = a[i];
			}
			if (a[i] < buy) {
				buy = a[i];
			}
		}
		int profit = sell - buy;
		int d = m();
		System.out.println(d);
		return profit;
		
	}
	
	public static int m() {
		int prices[]= {7,6,5,4,3,2};
		
			  int maxProfit = 0;

			  for(int i=0; i<prices.length; i++) {
			    for(int j=i+1; j<prices.length; j++) {
			      int diff = prices[j] - prices[i];
			      if (diff > maxProfit) {
			        maxProfit = diff;
			      }
			    }
			  }
			  
			  return maxProfit;
	}
}

//int maxProfit = 0;
//int minPrice = prices[0];
//for(int i=1; i<l; i++) {
//  maxProfit = Math.max(maxProfit, prices[i]-minPrice);
//  minPrice = Math.min(minPrice, prices[i]);
//}
//return maxProfit;
