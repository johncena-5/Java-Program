package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class CollectionTest {

	public static void main(String[] args) {

//		ArrayList a = new ArrayList();
//		a.add(10);
//		a.add(976);
//		a.add(75);
//		a.add(262);
//		a.add(826);
//		a.add(875);
//		a.add(192);
//		a.add(725);
//		a.add(0);
//		System.out.println(a);
//		Collections.sort(a);
//		System.out.println(a);
//		
//		List ab = new ArrayList();
//		ab.add('q');
//		ab.add('w');
//		ab.add('f');
//		Collections.sort(ab);
//		System.out.println(ab);
//		
//		
//		Stack stack = new Stack();
//		stack.push("add");
//		stack.push(10);
//		System.out.println(stack);
//		
//		LinkedList list = new LinkedList();
//		list.add("hello");
//		list.add("java");
//		list.add("class");
//		Collections.sort(list);
//		System.out.println(list);

//		PriorityQueue s = new PriorityQueue<>();
//		s.add(34);
//		s.add(45);
//		s.add(10);
//		s.add(76);
//		s.peek();
//		System.out.println(s);
//		s.poll();
//		System.out.println(s);

//		HashSet set = new HashSet();
//		set.add("java");
//		set.add("java");
//		set.add("class");
//		System.out.println(set);
//		ArrayList a = new ArrayList(set);
//		a.add("java");
//		a.add("main");
//		System.out.println(a);
//		
//		ArrayList list = new ArrayList<>();
//		list.add("java");
//		list.add(10);
//		list.add('v');
//		list.add(29);
//		list.add(null);
//		list.add(17.09);
//		for(int i=0; i<list.size();i++) {
//			
//			Object obj = list.get(i);
//			if(obj instanceof Double) {
//				
//				System.out.println(obj);
//			}
//		}
		
//		TreeSet tree = new TreeSet();
//		tree.add("java");
//		tree.add("class");
//		tree.add("boy");
//        tree.add("roy");
//        System.out.println(tree);
		
//		Hashtable<Integer, String> map = new Hashtable<>();
//		map.put(1, "sunil");
//		map.put(2, "bye");
//		map.put(3, "hii");
//		System.out.println(map);
//		
//		for (Entry<Integer, String> str : map.entrySet()) {
//			
//			String key = str.getValue();
//		    Integer value = str.getKey();
//			ArrayList m = new ArrayList();
//			
//			m.add(value);
//			m.add(key);
//			System.out.println(m);
//		}
		
		
		LinkedHashMap<Integer, String> map1 = new LinkedHashMap();
		map1.put(5, "mohan");
		map1.put(2, "rohan");
		map1.put(3, "sohan");
		
		System.out.println(map1);
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "java");
		map.put(25, "python");
		map.put(33, "selenium");
		
		System.out.println(map);
	}
}
