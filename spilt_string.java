
import java.util.Scanner;

public class spilt_string {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		int rcount = 0, lcount = 0, total = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'R') {
				rcount++;

			}
			if (word.charAt(i) == 'L') {
				lcount++;
			}
			if (rcount == lcount) {
				total++;
				rcount = 0;
				lcount = 0;
			}

		}
		System.out.println(total);
	}

}
