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
		Person bati = new Person();
		bati.setAge(40);
		bati.setName("Bakota Tibor");
		printThis();
		printThat();
		boolean thereIsAppleAtTheStore = true;
		if(thereIsAppleAtTheStore) {
			bati.buyApple();
		}
		for (int i = 0; i < 5; i++) {
			bati.buyApple();
		}
		bati.eatApple();
		bati.eatApple();
		bati.eatApple();
		bati.eatApple();
		bati.washApples();
		bati.eatApple();
		
		for (int i = 0; i < 5; i++) {
			bati.buyApple();
			bati.eatApple();
		}

		}
	

}
