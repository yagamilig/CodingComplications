//Solution to problem #118A: String Task on the Code Forces problem set

package difficulty1000;

import java.util.Scanner;
import java.util.ArrayList;

public class Problem118A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String string = input.nextLine();
		//put input string into an ArrayList as individual characters in order to do various checks and transformations
		ArrayList<String> array = new ArrayList<String>();
		for (int i = 0; i < string.length(); i++) {
			array.add(string.substring(i, i+1));
		}

		//checks if current character in the ArrayList is a vowel or consonant in order to do the correct transformation
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).matches("a|e|i|o|u|y|A|E|I|O|U|Y")) {
				array.remove(i);
				i--;
			}
			else {
				if (Character.isUpperCase(array.get(i).charAt(0))) {
					array.set(i, array.get(i).toLowerCase());
				}
				array.add(i, ".");
				i++;
			}
		}

		//prints out the entire edited ArrayList out in the same line as opposed to printintg a string for the answer
		for (int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i));
		}
	}

}
