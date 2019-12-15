import java.util.Scanner;
import java.util.StringTokenizer;

public class Question16 {
	
	//each letter in the alphabet is represented by a prime number in the indices array
	static int[] indices = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the two strings (separated by a space): ");
		StringTokenizer st = new StringTokenizer(scan.nextLine());
		//both strings are converted to uppercase char arrays
		char[] s1 = st.nextToken().toUpperCase().toCharArray();
		char[] s2 = st.nextToken().toUpperCase().toCharArray();
		
		if (s1.length != s2.length) //if lengths are not equals, they cannot be anagrams
			System.out.print("no");
		else {
			int total1 = calculateNum(s1);
			int total2 = calculateNum(s2);
			//a product of prime numbers can only equal a product of the same prime numbers
			//because the indices array is composed from prime numbers, two strings are anagrams iff their two prime number products are equals
			if (total1 == total2)
				System.out.print("yes");
			else
				System.out.print("no");
		}
	}
	
	//calculateNum converts each char to an int between 0 and 25 inclusive.
	//each int is used to get the corresponding prime numbers from the indices array, which are multiplied together and returned
	static int calculateNum(char[] chars) {
		int total = 1;
		for (char c : chars) {
			int ascii = (int)c - 65;
			total *= indices[ascii];
		}
		return total;
	}
}
