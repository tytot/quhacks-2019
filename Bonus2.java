import java.util.*;

public class Bonus2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numDucks = Integer.parseInt(scan.nextLine());
		int[] ducks = new int[numDucks];
		StringTokenizer st = new StringTokenizer(scan.nextLine());
		for (int i = 0; i < numDucks; i++)
			ducks[i] = Integer.parseInt(st.nextToken());
		
		int[] sorted = ducks.clone();
		Arrays.parallelSort(sorted); //end array
		
		int moves = 0;
		while (!equals(ducks, sorted)) { //loops while ducks are not sorted
			int index = numDucks - 1;
			while (ducks[0] < ducks[index]) { //starts by looking at the last duck and going backwards
				if (ducks[index-1] > ducks[index]) { //if the duck before the current duck is higher, put the first duck between those two ducks
					index--;
					break;
				}
				index--;
			}
			int[] newDucks = ducks.clone();
			for (int i = 0; i < index; i++)
				newDucks[i] = ducks[i+1];
			newDucks[index] = ducks[0]; //move ducks
			moves++;
			ducks = newDucks;
		}
		System.out.println(moves);
	}
	
	//test if two arrays are equal
	static boolean equals(int[] arr1, int[] arr2) {
		boolean equal = true;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i])
				equal = false;
		}
		return equal;
	}
}
