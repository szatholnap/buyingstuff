/**
 * 
 */
package examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author user
 *
 */
public class Person {

	int age;
	String name;
	int health;
	public int getHealth() {
		
		return health;
	}
	public void setHealth(int health) {
		if(this.health < 100) {
			this.health += health;
		}
	}

	String phoneNumber;
	
	List<Groceries> groceries = new ArrayList<Groceries>();
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 1) {
			if(age < 0) {//Direkt van itt dead code.
				System.out.println("You cannot do that");
			}
			else
			{
				this.age = age;
			}
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	public void buyApple() {
		groceries.add(new Apple());
	}
	
	public void buyShampoo() {
		//Copy-paste, ismert (direkt) hiba, kovi verzioban javitando
		groceries.add(new Apple());
	}
	
	public void washApples() {
		for (Groceries item : groceries) {
			if(item instanceof Apple)
				 ((Apple) item).setWashed(true);
		}
	}
	
	public void eatApple() {
		
		Groceries thisApple = new Apple();
		
		for(Groceries item : groceries) {
			if(item instanceof Apple) {
				((Apple) item).decreaseQuality();
				thisApple = (Apple) item;
				groceries.remove(0);
			}
			break;
		}
		if(thisApple.quality > 50) {
			System.out.println("Congrats, you've kept the doctor away");
			setHealth(10);
		}
		else {
			this.health-=20;
			
			if(this.getHealth() <=0)
				System.out.println(getName() + "is ded!");
		}
		System.out.println(getName() + "\'s health: "+ getHealth() + "%");
	}
	
	/**
	 * 
	 */
	public Person() {
		health = 100;
	}
	
	

}
