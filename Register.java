import java.util.*;
public class Register implements Supermarket{
	/* Checks out a string of items
	 @param items	string of items to checkout */
	public int checkout(String items){
		/* ArrayList to hold the items(characters) that were already processed */
		ArrayList<Character> processed = new ArrayList<Character>();
		/* number of occurences of each item(character) */
		int numberOfOccurences;
		int total = 0;
		for( int i=0; i<items.length(); i++ ) {
			/* If the item(character) is not in the list of processed items, then process it and add it to the list and update the total */
			if (! processed.contains(items.charAt(i))){
				numberOfOccurences = items.length() - items.replace(""+items.charAt(i), "").length();
				total += processItem(items.charAt(i), numberOfOccurences);
				processed.add(items.charAt(i));
			}
		}
		return total;
	}

	/* Process the cost of the given item based on the number of occurences of that item
	   @param	item 		character representing the item
	   @param	itemCount	number of occurences of the item in the original list of items */
	public int processItem(Character item, int itemCount){
		Product currentItem = ProductFactory.factory(item);
		if (currentItem != null){
			return currentItem.calculateTotal(itemCount);
		} else {
			/* Return 0 if Product was not returned from Product Factory(null was returned)*/
			System.out.println("Pruduct not found in Product Factory: " + item); 
			return 0;
		}
	}
}