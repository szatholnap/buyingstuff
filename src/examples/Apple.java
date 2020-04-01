/**
 * 
 */
package examples;

/**
 * @author user
 *
 */
public class Apple extends Groceries {

	boolean washed = false;
	public boolean isWashed() {
		return washed;
	}

	public void setWashed(boolean washed) {
		this.washed = washed;
	}

	public void decreaseQuality() {
		if(!washed)
			quality = quality - 50;
	}
	
	/**
	 * 
	 */
	public Apple() {
		super();
		type = "Apple";
	}
	
	

}
