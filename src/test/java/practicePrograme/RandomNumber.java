package practicePrograme;

import java.util.Random;

import net.bytebuddy.utility.RandomString;

public class RandomNumber {

	public static void main(String[] args) {

		Random r = new Random();
		int num = r.nextInt(100);
		System.out.println(num);
		
//		RandomString j = new RandomString();
		String make = RandomString.make(3);
		System.out.println(make);
		

	}
}
