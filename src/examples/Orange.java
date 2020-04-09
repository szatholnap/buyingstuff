/**
 * 
 */
package examples;

/**
 * @author user
 *
 */
public class Orange extends Groceries {

	boolean washed = false;
	public boolean isWashed() {
		return washed;
	}

	public void setWashed(boolean washed) {
		this.washed = washed;
	}

	public void decreaseQuality() {
		if(!washed)
			quality = quality - 60;
	}
	
	/**
	 * 
	 */
	public Orange() {
		super();
		type = "Apple";
	}
	
	

}
