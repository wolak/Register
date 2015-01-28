public class ProductB extends Product {
	public int calculateTotal(int itemCount){
		int total = 0;
		int price = 50;
		/* Add the amount of items that are not part of the 5 for the price of 3 to the total */
		total += (itemCount % 5) * price;
		/* Add the amount of items that are part of the 5 for the price of 3 discount to the total*/
		total += (itemCount / 5) * 3 * price;
		return total;
	}

}