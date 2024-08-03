package browserStack;

public class PrintPrimeUsingRecursion {

	public static void main(String[] args) {

		printPrimesInRange(1, 100);
	}

	public static void printPrimesInRange(int start, int end) {

		if (start <= end) {
			if (isPrime(start, start / 2)) {
				System.out.println(start);
			}
			printPrimesInRange(start + 1, end);
		}

	}

	public static boolean isPrime(int num, int divisor) {

		if (num <= 1) {
			return false;
		}
		if (divisor == 1) {
			return true;
		}
		if (num % divisor == 0) {
			return false;
		}
		return isPrime(num, divisor - 1);
	}

}
