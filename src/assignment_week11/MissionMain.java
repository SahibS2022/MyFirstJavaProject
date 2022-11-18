package assignment_week11;

public class MissionMain {

	public static void main(String[] args) {
		Simulation simulation = new Simulation();
		/* Run simulation for R1 & R2 fleet and display total budget */
		try {
			System.out.println("Total budget for R1 fleet: "
					+ simulation.runSimulation(simulation.loadU1(simulation.loadItems())));
			System.out.println("Total budget for R2 fleet: "
					+ simulation.runSimulation(simulation.loadU2(simulation.loadItems())));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
