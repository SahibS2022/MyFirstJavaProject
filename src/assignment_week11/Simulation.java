package assignment_week11;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

	@SuppressWarnings("unchecked")
	protected ArrayList<Item> loadItems() throws Exception {
		ArrayList<Item> loadItemArrayList = new ArrayList();
		Scanner fileScanner = new Scanner(new File("C:\\Users\\Sahib\\Desktop\\phase-1.txt"));
		while (fileScanner.hasNextLine()) {
			Item item = new Item();
			String[] line = fileScanner.nextLine().split("=");
			item.name = line[0];
			item.weight = Integer.parseInt(line[line.length - 1]);
			loadItemArrayList.add(item);
		}
		return loadItemArrayList;
	}

	@SuppressWarnings("unchecked")
	protected ArrayList<Rocket> loadU1(ArrayList<Item> loadItemArrayList) {
		ArrayList<Rocket> rocketOneArrayList = new ArrayList();
		Rocket rocketOne = new R1();/* creating Rocket class reference variable using R1 class */
		for (Item currentItem : loadItemArrayList) {
			if (rocketOne.canCarry(currentItem)) {
				rocketOneArrayList.add(rocketOne);
			} else {
				rocketOne = new R1();
				rocketOneArrayList.add(rocketOne);
			}
		}
		return rocketOneArrayList;
	}

	@SuppressWarnings("unchecked")
	protected ArrayList<Rocket> loadU2(ArrayList<Item> loadItemArrayList) {
		ArrayList<Rocket> rocketTwoArrayList = new ArrayList();
		Rocket rocketTwo = new R2();/* creating Rocket class reference variable using R2 class */
		for (Item currentItem : loadItemArrayList) {
			if (rocketTwo.canCarry(currentItem)) {
				rocketTwoArrayList.add(rocketTwo);
			} else {
				rocketTwo = new R2();
				rocketTwoArrayList.add(rocketTwo);
			}
		}
		return rocketTwoArrayList;
	}

	protected int runSimulation(ArrayList<Rocket> bothRockets) {
		int totalBudget = 0;
		for (Rocket currentRocket : bothRockets) {
			totalBudget += currentRocket.getCost();
			while (!currentRocket.launch() || !currentRocket.land()) {
				totalBudget += currentRocket.getCost();
			}
		}
		return totalBudget;
	}
}
