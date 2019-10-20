package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String>array = new ArrayList<> ();
		//2. Add five Strings to your list
		array.add("BOB");
		array.add("is");
		array.add("kind");
		array.add("of");
		array.add("kool");
		//3. Print all the Strings using a standard for-loop
	for (int i = 0; i < array.size(); i++) {
		System.out.println(array.get(i));
		
	}
		//4. Print all the Strings using a for-each loop
		for (String guy:array) {
			System.out.println(guy);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < array.size(); i++) {
			if (i%2==0) {
				System.out.println(array.get(i));
			}
			
		}
		//6. Print all the Strings in reverse order.
		for (int i = array.size()-1; i >=0; i--) {
			System.out.println(array.get(i));
			
		}
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
