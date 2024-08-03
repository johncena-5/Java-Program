package program;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

public class ExtractNumberInASentance {

	public static void main(String[] args) {
		String s = "i am345 go190ing. i 675 nepal";
		// 1*234*567*8910
		String[] sh = s.split(" ");
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < sh.length; i++) {

			try {
				int b = Integer.parseInt(StringUtils.getDigits(sh[i]));
				list.add(b);
			} catch (Exception e) {

			}
		}
		System.out.println(list);
	}
}
