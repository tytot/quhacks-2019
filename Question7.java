import java.util.Scanner;
public class Question7 {
	public static void main (String str[]) {
		int userInput1;
		int userInput2;
		int lcm;
		int gcd = 1;
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an integer: ");
		userInput1 = input.nextInt(); //allows user to input first integer
		System.out.print("Enter an integer: ");
		userInput2 = input.nextInt(); //allows user to input second integer
		if (userInput1 < 0) { //checks if first input is negative
			userInput1 *= -1;
		}
		if (userInput2 < 0) { //checks if second input is negative
			userInput2 *= -1;
		}
		lcm = userInput1 * userInput2;
		if (userInput1 == 0 || userInput2 == 0) { //if either input is zero, outputs zero
			System.out.print("LCM: " + 0);
		} else {
			if (userInput1 > userInput2) {
				if (userInput1 % userInput2 == 0) {
					/*if the first integer is greater, and it is a multiple of the second,
					 * then it automatically outputs the first integer
					 */
					System.out.print("LCM: " + userInput1);
				} else {
					for (int i = 1; i < userInput2; i ++) {
						/*this loop checks whether every integer from 1 to the lower input
						 * is a multiple of both inputs, and if it is, it sets the GCD (greatest
						 * common divisor) to that integer
						 */
						if ((userInput1 % i == 0) && (userInput2 % i == 0)) {
							gcd = i;
						}
					}
					System.out.print("LCM: " + (userInput1 * userInput2 / gcd));
				}
			} else if (userInput2 > userInput1) {
				if (userInput2 % userInput1 == 0) {
					/*if the second integer is greater, and it is a multiple of the first,
					 * then it automatically outputs the second integer
					 */
					System.out.print("LCM: " + userInput2);
				} else {
					for (int i = 1; i < userInput1; i ++) {
						/*this loop checks whether every integer from 1 to the lower input
						 * is a multiple of both inputs, and if it is, it sets the GCD (greatest
						 * common divisor) to that integer
						 */
						if ((userInput1 % i == 0) && (userInput2 % i == 0)) {
							gcd = i;
						}
					}
					System.out.print("LCM: " + (userInput1 * userInput2 / gcd));
				}
			} else {
				System.out.print("LCM: " + userInput1);
			}
		}
	}
}