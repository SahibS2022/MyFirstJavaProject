
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maxCapacity = 5;
		for (int myCapacity = 1; myCapacity <= maxCapacity; myCapacity++) {
			System.out.println("I have drink "+myCapacity+" ,So I can drink more");
			if (myCapacity == maxCapacity) {
				System.out.println("Now I have reached the maximum capacity");
				break;
			}
		}

	}

}
