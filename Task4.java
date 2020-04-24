import java.util.Scanner;
import java.lang.Math;
/*
 * Ahmed gamal
 * Bn:3 sec:1
 * ahmedabbs9@gmail.com
 */

public class Task4 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please Choose a problem:");
		System.out.println();
		System.out.println("Type 1 To Find The Smallest Number Among Three Numbers");
		System.out.println("Type 2 To Calculate The Area Of A Triangle");
		System.out.println("Type 3 To Check Whether A String Is A Valid Password.");
		System.out.println(
				"Type 4 To Compute The Future Investment Value At A Given Interest Rate For A Specified Number Of Years.");
		int probNumber = input.nextInt();
		switch (probNumber) {
		case 1:
			probelmOne();
			break;
		case 2:
			problemTwo();
			break;
		case 3:
			problemThree();
		case 4:
			problemFour();
		}

	}

	public static void probelmOne() {
		System.out.println("Please Enter The three numbers;");
		int[] nums = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the next number");
			nums[i] = input.nextInt();
		}
		int smallestNumber = getSmallest(nums);
		System.out.println("The Smallest Number is " + smallestNumber);
	}

	public static int getSmallest(int[] numbersArry) {
		int smallest = numbersArry[0];
		for (int i = 1; i < 3; i++) {
			if (numbersArry[i] < smallest) {
				smallest = numbersArry[i];
			}
		}

		return smallest;
	}

	public static void problemTwo() {
		System.out.println("Please Enter The length of the three sides of the triangle");
		double[] nums = new double[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the length of the next side");
			nums[i] = input.nextDouble();
		}
		double areaOfTriangle = getArea(nums);
		System.out.println("The area of the triangle is " + areaOfTriangle);
	}

	public static double getArea(double[] sides) {
		double area;
		double p = 0;
		for (int i = 0; i < 3; i++) {
			p += sides[i];
		}
		p = p / 2;

		area = Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
		return area;
	}

	public static void problemThree() {
		System.out.println("Please enter password !");
		String password = input.next();
		passwordIsValid(password);
	}

	public static void passwordIsValid(String pass) {
		int passLength = pass.length();
		int condSpecial = 0;
		if (passLength < 10) {
			System.out.print("Invalid Password (Too Short)");
			System.exit(0);

		} else {
			for (int i = 0; i < passLength; i++) {
				char passChar = pass.charAt(i);
				if (passChar == '!' || passChar == '#' || passChar == '$' || passChar == '%' || passChar == '^'
						|| passChar == '@') {
					condSpecial = 1;
				} else {
					if (((int) passChar > 96 && (int) passChar < 123) || ((int) passChar > 47 && (int) passChar < 58)
							|| ((int) passChar > 64 && (int) passChar < 91)) {

					} else {
						System.out.println("Invalid Password (unallowed Charachters");
						System.exit(0);
					}

				}

			}
			if (condSpecial > 0) {
				System.out.println("Valid Password ");
			}
		}

	}
	public static void problemFour() {
		double startMoney,rateOfInterest,numberOfYears;
		System.out.println("Please enter the invested amount ");
		startMoney=input.nextDouble();
		System.out.println("Please enter the rate of interest . example: if 10% ---> insert 10");
		rateOfInterest=input.nextDouble();
		System.out.print("Please enter the number of years");
		numberOfYears=input.nextDouble();
		easyBank(startMoney,rateOfInterest,numberOfYears);
		
	}
	public static void easyBank(double money,double rate,double years) {
		System.out.println();
	for(int i=0;i<(int)years;i++) {
		System.out.print(i+" ");
		money=money+money*(rate/100);
		System.out.print(money);
		System.out.println();
	}
	}
}