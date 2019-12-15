import java.util.*;

public class Question12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your number: ");
		double val = (int)Double.parseDouble(scan.nextLine());
		
		ArrayList<Integer> factors = new ArrayList<Integer>(); //stores the integer factors of val
		for (int i = 1; i <= val / 2; i++) { //loops through each int between 1 and val/2 to check if i is a factor
			if (val % i == 0)
				factors.add(i);
			if (factors.size() > 1) { //if there is more than one factor (excluding the number itself), it cannot be prime
				System.out.print("composite");
				break;
			}
		}
		if (factors.size() == 1) //if there is only one factor (excluding the number itself), it cannot be prime
			System.out.print("prime");
	}

}
