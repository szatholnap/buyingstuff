/**
 * 
 */
package examples;

/**
 * @author user
 *
 */
public class MyMain {

	public static void printThis() {
		System.out.println("This");
	}
	public static void printThat() {
		System.out.println("That");
	}
	public static void printDat() {
		System.out.println("That");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person BT = new Person();
		BT.setAge(40);
		BT.setName("Bakota Tibor");
		printThis();
		printThat();
		boolean thereIsAppleAtTheStore = true;
		if(thereIsAppleAtTheStore)
			BT.buyApple();
		for (int i = 0; i < 5; i++) {
			BT.buyApple();
		}
		BT.eatApple();
		BT.eatApple();
		BT.eatApple();
		BT.eatApple();
		BT.washApples();
		BT.eatApple();
		
		for (int i = 0; i < 5; i++) {
			BT.buyApple();
			BT.eatApple();
		}

		}
	

}
