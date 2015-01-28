/* A simple test of the Register and Products.*/
class RegisterTester {
    public static void main(String[] args) {
    	Register register = new Register();
        /* Test each product and make sure the cost of 1 element is the expected price. Ensure the cost of 5 "B" is 150 */
        System.out.println(new ProductA().calculateTotal(1) == 20);
        System.out.println(new ProductB().calculateTotal(1) == 50);
        System.out.println(new ProductB().calculateTotal(5) == 150);
        System.out.println(new ProductC().calculateTotal(1) == 30);
    	/* Test given example*/
    	System.out.println(register.checkout("ABBACBBAB") == 240);
    	/* Test empty string*/
    	System.out.println(register.checkout("") == 0);
    	/* Test unknown products*/
    	System.out.println(register.checkout("DD") == 0);
    	/* Test a mix of unknown products and known */
    	System.out.println(register.checkout("DDAACBB") == 170);
    }
}