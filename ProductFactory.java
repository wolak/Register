public class ProductFactory{
	/* Simplep Product factory class. 
	 @param product 	character representing the item */
	public static Product factory(Character product){
		if (product == "A".charAt(0)){
			return new ProductA();
		} else if (product == "B".charAt(0)){
			return new ProductB();
		} else if (product == "C".charAt(0)){
			return new ProductC();
		}
		return null;
	}
}