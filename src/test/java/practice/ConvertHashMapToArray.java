package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ConvertHashMapToArray {

	public static void main(String[] args) {
	
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "java");
		map.put(2, "class");
		map.put(3, "python");
		List<Integer> integer = new ArrayList<>(map.keySet());
		System.out.println(integer);
		List<String> string = new ArrayList<>(map.values());
		System.out.println(string);
		
		
		
	}
}
