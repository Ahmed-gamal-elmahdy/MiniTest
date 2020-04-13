import java.util.Scanner;

public class encryption {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the string :");
		String inputString = input.next();
		System.out.println("Enter Key ");
		int key = keyRange(input.nextInt());
		String finalWord = encryptThis(inputString, key);
		System.out.print(finalWord);

	}

	public static String encryptThis(String word, int key) {
		String output = "";
		for (int i = 0; i < word.length(); i++) {
			String charBin = charToBinary(word.charAt(i));
			//String nan = lengthEncFunction(charBin);
			output += binaryToChar(xorKey(charBin, binaryKey(key + i).substring(1)));
		}
		return output;
	}

	public static String binaryKey(int key) {
		String output = Integer.toBinaryString((1 << 16) | key);
		return output;
	}

	public static String charToBinary(char c) {
		String number = Integer.toBinaryString((1 << 16) | (int) c).substring(1);
		return number;
	}

	public static char binaryToChar(String number) {
		int binaryNumber = Integer.parseInt(number, 2);
		char output = (char) binaryNumber;
		return output;
	}

	public static String xorKey(String binaryNum, String key) {

		String output = "";
		for (int i = 0; i < binaryNum.length(); i++) {
			output += binaryNum.charAt(i) ^ key.charAt(i);
		}
		return output;
	}

	public static String lengthEncFunction(String inputWord) {
		String output = "";
		for (int i = 0; i < inputWord.length(); i++) {
			output += inputWord.charAt(inputWord.length() - 1 - i);
		}
		return output;
	}

	public static int keyRange(int key) {
		while (key > 97) {
			key = key / 3;
		}
		while (key < 10) {
			key *= 5;
		}
		return key;
	}

}