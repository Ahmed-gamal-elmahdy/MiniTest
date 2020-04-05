import java.util.Scanner;

/*
 * Ahmed gamal
 * Bn:3 sec:1
 * ahmedabbs9@gmail.com
 */

public class maxSpan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter the lenght of the arry .");
		int arryLength = input.nextInt();
		int[] arry = new int[arryLength];

		int maxSpan = 0;
		for (int i = 0; i < arryLength; i++) {
			System.out.println("Please enter the next number ");
			arry[i] = input.nextInt();
		}

		int j,span;
		for (int i = 0; i < arryLength; i++) {
			for (j = arryLength - 1; arry[j] != arry[i]; j--) {
				
			}
			if (arry[j] == arry[i]) {
				if (maxSpan < (j - i + 1)) {
					maxSpan = j - i + 1;
				}
			}

		}
		System.out.print("MaxSpan = " + maxSpan);

	}
}