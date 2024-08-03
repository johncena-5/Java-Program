package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sakir {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,3,4,4,5,6));
		
		List<Integer> unique = list.stream().distinct().collect(Collectors.toList());
		
		unique.forEach(e -> System.out.println(e));
	}
}
