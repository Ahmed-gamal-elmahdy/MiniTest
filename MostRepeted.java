import java.util.Scanner;

public class MostRepeted {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int MaxNum = -1;
		System.out.print("Enter the lenght of arry \n");
		int NumsLength = input.nextInt();
		int[] Nums = new int[NumsLength];
		for (int i = 0; i < (NumsLength); i++) {
			Nums[i] = input.nextInt();
			if (MaxNum <= Nums[i]) {
				MaxNum = Nums[i];
			}
		}
		int[] repeted = new int[MaxNum + 1];
		for (int i = 0; i < NumsLength; i++) {
			repeted[Nums[i]]++;
		}
		int Rmax1 = -1;
		int Rmax2 = -1;
		int max1 = -1;
		int max2 = -1;
		for (int i = 0; i <= MaxNum; i++) {
			if (repeted[i] >= Rmax1) {
				max2 = max1;
				Rmax1 = repeted[i];
				max1 = i;
			} else {
				if (repeted[i] >= Rmax2) {
					max2 = i;
					Rmax2 = repeted[i];

				}
			}
		}
		System.out.print("\n Most Repeted number is " + max1 + " of times " + Rmax1 + "\n Second most repeted is "
				+ max2 + " of times " + Rmax2);

	}
}