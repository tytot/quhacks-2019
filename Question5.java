import java.util.Scanner;
public class Question5 {
	public static void main (String str[]) {
		double userInput = 0;
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a positive number: ");
		userInput = Double.parseDouble(input.nextLine()); //allows user to input an integer
		for (int i = 2; i <= (int) userInput; i += 2) {
			System.out.print(i + " ");
			//for loop that outputs all even integers from 2 to the user's number
		}
	}
}