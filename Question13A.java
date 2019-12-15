//Big Bala Brand #13a
import java.util.*;
public class thirteenA {
	public static void main (String args[]) {
		//asks the user for the coordinates and changes their answer into decimal values
		System.out.print("Enter first x coordinate: ");
		Scanner userinput = new Scanner(System.in);
		double oneX = Integer.parseInt(userinput.nextLine());
		System.out.print("Enter first y coordinate: ");
		double oneY = Integer.parseInt(userinput.nextLine());	
		System.out.print("Enter first x coordinate: ");
		double twoX = Integer.parseInt(userinput.nextLine());
		System.out.print("Enter first y coordinate: ");
		double twoY = Integer.parseInt(userinput.nextLine());	
		//uses the slope formula from Algebra two to calculate slope
		double slope = ((twoY - oneY)/(twoX - oneX));
		//if the line is vertical line, the slope will be undefined, so this if statement accounts for that discrepancy
		if (twoX - oneX == 0) {
			System.out.println("Slope is undefined for this line");
		} else {
			//prints out slope
			System.out.println(slope);
		}
	}
	
}
