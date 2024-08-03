package program;

import java.util.LinkedHashSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintCountOfCharacter {

	public static void main(String[] args) {

		String s = "aeexxxyyyy";

		LinkedHashSet<Character> set = new LinkedHashSet<>();

		for (int i = 0; i < s.length() - 1; i++) {

			set.add(s.charAt(i));
		}

		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i)) {
					count++;
				}
			}
			System.out.print(ch + " " + count);
		}
	}
}
