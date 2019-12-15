import java.util.Scanner;
public class Question8 {
	public static void main (String str[]) {
		double userInput;
		int num1 = 1;
		int num2 = 1;
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a positive number: ");
		userInput = Double.parseDouble(input.nextLine()); //allows user to input positive number
		if (userInput >= 2) {
			//automatically outputs first two numbers in sequence if input is >=2
			System.out.print("1, 1");
		} else {
			//automatically outputs first number if input is less than 2
			System.out.print(1);
		}
		for (int i = 1; i < (int) userInput - 1; i ++) {
			//algorithm for Fibonacci sequence
			int temp = num1 + num2;
			num1 = num2;
			num2 = temp;
			System.out.print(", " + temp);
		}
	}
}