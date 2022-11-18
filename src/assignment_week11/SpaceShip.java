package assignment_week11;

public interface SpaceShip {

	public boolean launch();

	public boolean land();

	public boolean canCarry(Item item);// passing Item Class as an argument

	public void carry(Item item);// passing Item Class as an argument
}
