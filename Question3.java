//Big Bala Brand #3
import java.util.*;
public class third {
	public static void main (String args[]) {
		//allows the program to run for three different people
		for (int i = 0; i<3; i++) {
			System.out.print("Enter your name so my boy Fred knows who you are: ");
			//allows the user to input a name and assigns it to variable s
			Scanner userinput = new Scanner(System.in);
			String s = userinput.nextLine();
			//utlizing the user's input we create a sentence saying Hello to that person
			System.out.println("Hello, " + s + "!");
		}
	}
}
