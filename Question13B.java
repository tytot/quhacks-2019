//Big Bala Brand #13a and #13b
import java.util.*;
public class thirteenB {
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
		//used the standard linear equation y = mx - b and isolated b the y intercept and plugged in the values we know
		double yintercept = (twoY-(slope*twoX));
		
		if (twoX - oneX == 0 && oneX == 0) {
			//special case in that the line is vertical and crosses the origin
			System.out.println("all points on this line are y intercepts");
		} else if (twoX - oneX == 0 ){
			//special case in that line is vertical and does not cross origin
			System.out.println("there are no y intercepts");
		} else {
			//normal case
			System.out.println(yintercept);
		}
	}
}
