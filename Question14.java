//Big Bala Brand #14
import java.util.Scanner;
public class fourteen {
	public static void main (String args[]) {
		//sets the value of the items
		double pizza = 2.5;
		double chips = 1;
		double coffee = 1.5;
		//asks user for all the items they want to order and converts to decimal value
		System.out.println("NEXT UP!");
		System.out.println("Enter how many pizza slices you would like to buy: ");
		Scanner userinput = new Scanner(System.in);
		double pizzaVal = Integer.parseInt(userinput.nextLine());
		System.out.println("Enter how many bags of chips you would like to buy: ");
		userinput = new Scanner(System.in);
		double chipsVal = Integer.parseInt(userinput.nextLine());	
		System.out.println("Enter how many cups of coffee you would like to buy: ");
		userinput = new Scanner(System.in);
		double coffeeVal = Integer.parseInt(userinput.nextLine());
		//multiplies amount of items with their price and adds everything up
		double total = ((pizzaVal*pizza)+(chipsVal*chips)+(coffeeVal*coffee));
		System.out.print("Here's your total: " + total);
		
	}
}

