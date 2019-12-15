import java.util.*;

public class Bonus1 {

	static int singles = 0;
	static int pairs = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter board: ");
		char[] row1 = scan.nextLine().toCharArray();
		char[] row2 = scan.nextLine().toCharArray();
		char[] row3 = scan.nextLine().toCharArray();
		char[][] entries = {row1, row2, row3};
		
		for (int i = 0; i < 3; i++) {
			checkTTT(entries[i][0],entries[i][1],entries[i][2]); //check rows
			checkTTT(entries[0][i],entries[1][i],entries[2][i]); //check columns
		}
		//check diagonals
		checkTTT(entries[0][0],entries[1][1],entries[2][2]);
		checkTTT(entries[2][0],entries[1][1],entries[0][2]);
		
		System.out.println(singles);
		System.out.print(pairs);
	}
	
	//adds 1 to singles or pairs if the chars correspond
	static void checkTTT(char a, char b, char c) {
		if (a == b && b == c)
			singles++;
		else if ((a == b && b != c) || (a == c && a != b) || (b == c && a != b))
			pairs++;
	}
}
