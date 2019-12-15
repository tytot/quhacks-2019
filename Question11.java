import java.util.*;

public class Question11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lowest = 0;
		int highest = 100000; //the highest possible number
		do {
			int range = highest - lowest + 1; //range between the lowest and highest guess
			int guess = (int) ((range*Math.random())+lowest); //picks a random number between the lowest and highest guess
			System.out.println("Guess: " + guess);
			String response = scan.nextLine().toLowerCase(); 
			if (response.equals("higher"))
				lowest = guess+1; //if your number is higher than the guess, increase lowest
			else if (response.equals("lower"))
				highest = guess-1; //if your number is lower than the guess, decrease highest
			else if (response.equals("correct"))
				break;
		} while (true);
	}

}
