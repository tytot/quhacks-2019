//Big Bala Brand #9

import java.util.*;

public class Question9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first array: ");
		String[] list1 = scan.nextLine().split(", "); //splits the first line by commas and adds the entries to a String array
		System.out.print("Enter the second array: ");
		String[] list2 = scan.nextLine().split(", "); //splits the second line by commas and adds the entries to a String array
		
		for (int i = 0; i < list1.length; i++) { //loops through the first String array
			System.out.print(list1[i] + ", " + list2[i]); //print the ith entry in the first array and the ith entry in the second array
			if (i != list1.length-1) //if we are not on the last index, add a comma to the end
				System.out.print(", ");
		}
	}

}
