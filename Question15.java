import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//read data
		System.out.print("Enter the key: ");
		int key = Integer.parseInt(scan.nextLine());
		System.out.print("Enter the number of words: ");
		int numWords = Integer.parseInt(scan.nextLine());
		String[] strs = new String[numWords];
		for (int i = 0; i < numWords; i++) {
			System.out.print("Enter word: ");
			strs[i] = scan.nextLine();
		}
		
		for (String word : strs) { //loops through each word inputed
			char[] wordArr = word.toCharArray();
			char[] newArr = wordArr.clone();
			for (int i = 0; i < wordArr.length; i++) { //loops through each char in the word
				char character = wordArr[i];
				//gets the ascii code for each char (using a cast to int), adds the key, then converts back to char
				int newIndex = (int)character + key;
				if (newIndex > 90)
					newIndex -= 26;
				newArr[i] = (char)newIndex;
			}
			System.out.println(new String(newArr));
		}
	}

}
