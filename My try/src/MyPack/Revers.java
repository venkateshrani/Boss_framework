package MyPack;

import java.util.Arrays;

public class Revers {

	public static void main(String[] args) {
		String arg = "selenium web driver";
		String[] str = arg.split(" ");

		for (int i = 0; i <= str.length - 1; i++) {
			String s = str[i];
			String rev = "";
			if (i == 0 || i == str.length - 1) {
				for (int j = s.length() - 1; j >= 0; j--) {
					rev = rev + s.charAt(j);

				}
				str[i] = rev;
			}

		}
		System.out.print(Arrays.toString(str));

	}
}
