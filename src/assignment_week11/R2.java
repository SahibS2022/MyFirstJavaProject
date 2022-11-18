package assignment_week11;

public class R2 extends Rocket {
	R2() {
		cost = 120000000;/* i.e 120 million */
		currentWeight = 18000;/* i.e 18 Tonnes */
		maxWeight = 29000;/* i.e 29 Tonnes */
	}

	/*
	 * method to check the Launching if its successful using probability equation
	 * for each
	 */
	@Override
	public boolean launch() {
		int randomNumber = (int) Math.floor(Math.random() * 50);
		/* Chance of launch explosion = 4% * (cargo carried / cargo limit) */
		return (4 * (currentWeight / maxWeight)) < randomNumber;// depends on the random number if greater then will
																// return value
	}

	/*
	 * method to check the Landing if its successful using probability equation for
	 * each
	 */
	@Override
	public boolean land() {
		int randomNumber = (int) Math.floor(Math.random() * 50);
		/* Chance of landing crash = 8% * (cargo carried / cargo limit) */
		return (8 * (currentWeight / maxWeight)) < randomNumber;// depends on the random number if greater then will
																// return value
	}
}
