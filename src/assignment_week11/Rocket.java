package assignment_week11;

public class Rocket implements SpaceShip {
	protected int cost;
	protected int currentWeight;
	protected int maxWeight;

	@Override
	public boolean launch() {
		return true;
	}

	@Override
	public boolean land() {
		return true;
	}

	@Override
	public boolean canCarry(Item item) {
		return (currentWeight + item.getWeight()) <= maxWeight;
	}

	@Override
	public void carry(Item item) {
		currentWeight += item.getWeight();
	}

	protected int getCost() {
		return cost;
	}

}
