import java.util.Scanner;

public class encryption {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the string :");
		String inputString = input.next();
		System.out.println("Enter Key ");
		int key = input.nextInt();
		String binaryKey = Integer.toBinaryString((1<<8)|key).substring(1);
		String finalWord = "";
		finalWord = encryptThis(inputString, binaryKey);
		System.out.print(finalWord);
		


}


	public static String encryptThis(String word, String key) {
		String output = "";
		for (int i = 0; i < word.length(); i++) {
			String charBin = charToBinary(word.charAt(i));
			output += binaryToChar(xorKey(charBin, key));
		}
		return output;
	}

	public static void decryptThis(String word, int key) {

	}

	public static String charToBinary(char c) {
		String number = Integer.toBinaryString( (1<<8)|(int) c).substring(1);
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

}