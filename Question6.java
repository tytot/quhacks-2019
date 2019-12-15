import java.util.Scanner;
public class Question6 {
	public static void main (String str[]) {
		int userInput1;
		int userInput2;
		String operation;
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an integer: ");
		userInput1 = input.nextInt(); //allows user to input first integer
		System.out.print("Enter an integer: ");
		userInput2 = input.nextInt(); //allows user to input second integer
		System.out.print("Enter an operation (+, -, *, /): ");
		operation = input.next(); //allows user to input desired operation
		if (operation.equals("+")) {
			//if the operation is +, adds two integers
			System.out.print(userInput1 + userInput2);
		} else if (operation.equals("-")) {
			//if the operation is -, subtracts second integer from first
			System.out.print(userInput1 - userInput2);
		} else if (operation.equals("*")) {
			//if the operation is *, multiplies two integers
			System.out.print(userInput1 * userInput2);
		} else if (operation.equals("/")) {
			if (userInput2 == 0) {
				System.out.print("Undefined");
			} else {
				//if the operation is /, divides first integer by second
				System.out.print((double) userInput1 / (double) userInput2);
			}
		}
	}
}