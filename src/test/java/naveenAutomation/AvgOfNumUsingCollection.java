package naveenAutomation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AvgOfNumUsingCollection {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		
		OptionalDouble average = list.stream().mapToInt(e-> e).average();
		System.out.println(average.getAsDouble());
		
		
	}

}
