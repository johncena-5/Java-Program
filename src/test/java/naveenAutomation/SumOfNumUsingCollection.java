package naveenAutomation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumUsingCollection {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		
		Optional<Integer> reduce = list.stream().reduce((a,b)-> a+b);
		System.out.println(reduce.get());
	}

}
