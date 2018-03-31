/****************************************************************************
 *
 * Created by: Heejo Suh
 * Created on: Mar 2018
 * Created for: learning
 * 
 * This program uses stack to create jets
 *     got from
 *     https://sites.google.com/a/ocsb.ca/teh-2017-ics4ur-1/unit-2/unit-2-06
 *
 ****************************************************************************/

public class FlyTest {
	public static void main(String[] args) {
		
		Airplane biplane = new Airplane();
		
		biplane.setSpeed(212);
		System.out.println(biplane.getSpeed());
		
		Jet boeing = new Jet();
		boeing.setSpeed(422);
		System.out.println(boeing.getSpeed());
		
		int x = 0;
		while (x < 4) {
			boeing.accelerate();
			System.out.println(boeing.getSpeed());
			if (boeing.getSpeed() > 5000) {
				biplane.setSpeed(biplane.getSpeed() * 2);
			} else {
				boeing.accelerate();
			}
			x++;
		}
		System.out.println(biplane.getSpeed());
	}
}