import java.util.*;

public class Question17 {

	//a 2d array that represents the conjugation table provided
	static String[][] conjugations = {{"o","o","o"},{"as","es","es"},{"a","e","e"},{"amos","emos","imos"},{"ais","eis","is"},{"an","an","en"}};
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the sentence you want to conjugate: ");
		String sentence = scan.nextLine();
		do {
			int openP = sentence.indexOf('(');
			if (openP == -1)
				break;
			int comma = sentence.indexOf(',');
			int closeP = sentence.indexOf(')');
			String verb = sentence.substring(openP+1, comma); //get verb
			String subject = sentence.substring(comma+2, closeP); //get subject
			int s; //to represent the first index used to access the array
			if (subject.equals("yo"))
				s = 0;
			else if (subject.equals("tu"))
				s = 1;
			else if (subject.equals("usted")||subject.equals("ella")||subject.equals("el"))
				s = 2;
			else if (subject.equals("nosotros"))
				s = 3;
			else if (subject.equals("vosotros"))
				s = 4;
			else
				s = 5;
			String end = verb.substring(verb.length()-2);
			int v; //to represent the second index used to access the array
			if (end.equals("ar"))
				v = 0;
			else if (end.equals("er"))
				v = 1;
			else
				v = 2;
			
			String conj = conjugations[s][v]; //access the corresponding conjugation based on the verb and subject
			String root = verb.substring(0, verb.length()-2);
			String newVerb = root + conj; //set the new verb with the new conjugation
			sentence = sentence.substring(0,openP) + newVerb + sentence.substring(closeP+1); //update the sentence to replace the parentheses with the new verb
		} while (true);
		System.out.print(sentence);
	}

}
