package practicePrograme;

public class NeonNum {

	public static void main(String[] args) {

		int a = 9;
		int y = a * a;
		int sum = 0;
		int rem = 0;
		while (y > 0) {
			rem = y % 10;
			sum = sum + rem;
			y = y / 10;
		}
		if (sum == a) {
			System.out.println("neon");
		}
	}
}
