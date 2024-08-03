package TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {

		String s = "app appium appointment";
		String[] d = s.split(" ");

		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[j].contains(d[i])) {
					System.out.println(d[i]);
					break;
				}
			}
		}
	}
}
