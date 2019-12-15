//Big Bala Brand #4
import java.util.*;
public class fourth {
	public static void main (String args[]) {
		for (int i = 0; i<=100; i++) {
			//Ask the user to input their words angrily in all caps
			System.out.print("Enter your words in ALL CAPS: ");
			Scanner userinput = new Scanner(System.in);
			String s = userinput.nextLine();
			//a simple java protocol enables us to change any capital letter to lowercase
			System.out.println(s.toLowerCase());
		}
	}
}
