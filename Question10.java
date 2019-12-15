import java.util.*;

public class Question10 {

	static String[] inputs = {"Rock", "Paper", "Scissors"}; //static array of possible inputs and outputs
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		System.out.print("Player: ");
		String next = scan.nextLine().toLowerCase();
		for (int i = 0; i < 3; i++) { //loop to find the index of the inputs array that the input matches
			if (next.equals(inputs[i].toLowerCase()))
				input = i;
		}
		int response = (int) (3*Math.random());
		System.out.println("Computer: " + inputs[response]); //chooses a random computer response from the inputs array
		
		if (input == response)
			System.out.print("Tie"); //tie if the player and the computer pick the same thing
		else {
			if ((input+1) % 3 == response) 
				//if the player's move's index is one less than the computer's, the computer won
				//player: rock, computer: paper
				//player: paper, computer: scissors
				//player: scissors, computer: rock
				System.out.print("Computer won");
			else
				System.out.print("Player won");
		}
	}

}
