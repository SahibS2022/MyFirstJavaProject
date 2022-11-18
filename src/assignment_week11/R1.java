package assignment_week11;

public class R1 extends Rocket {
	R1() {
		cost = 100000000;/* i.e 100 million */
		currentWeight = 10000;/* i.e 10 Tonnes */
		maxWeight = 18000;/* i.e 18 Tonnes */
	}

	/*
	 * method to check the Launching if its successful using probability equation
	 * for each
	 */
	@Override
	public boolean launch() {
		int randomNumber = (int) Math.floor(Math.random() * 50);
		/* Chance of launch explosion = 5% * (cargo carried / cargo limit) */
		return (5 * (currentWeight / maxWeight)) < randomNumber;// depends on the random number if greater then will
																// return value
	}

	/*
	 * method to check the Landing if its successful using probability equation for
	 * each
	 */
	@Override
	public boolean land() {
		int randomNumber = (int) Math.floor(Math.random() * 50);
		/* Chance of landing crash = 1% * (cargo carried / cargo limit) */
		return (currentWeight / maxWeight) < randomNumber;// depends on the random number if greater then will return
															// value
	}
}
