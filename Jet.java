/****************************************************************************
 *
 * Created by: Heejo Suh
 * Created on: Mar 2018
 * Created for: learning
 * 
 * This program is a sub-blueprint of 'Airplane'
 ****************************************************************************/

//Jet is the sub-class of Airplane
//Airplane is the super-class of Jet
public class Jet extends Airplane {
	//Jet inherits all of Airplane's behaviour to use for its own
	
	public static final int MULTIPLIER = 2; 
	//subclass can add its own variables to the ones that it inherits from Airplane 
	
	public Jet() {
		super(); //refers to class this class has inherited behaviour from
		//this calls the constructor of Airplane
	}
	
	public void setSpeed(int speed) {
		//subclass can call superclass's methods, as well as changing its behaviour(OVERRIDING).
		super.setSpeed(speed * MULTIPLIER);
	}
	
	public void accelerate() {
		//subclass can add its own methods to the methods it inherits from superclass
		super.setSpeed(getSpeed() * 2); //can also call it super.getSpeed()
	}
	
	//eventhough not written
	//getSpeed() can be used for Jet since it has inherited it from Airplane
}