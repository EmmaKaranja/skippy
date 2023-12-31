package skippy2;

import java.util.Random;

public class Dice {

	public static int counter = 0;
	public static int northStat = 0;
	public static int southStat = 0;
	public static int westStat = 0;
	public static int eastStat = 0;

	public String roll() {
		counter++;
		Random rand = new Random();
		int upperbound = 4;
		int num = rand.nextInt(upperbound);
		switch (num) {
		case 0:
			northStat++;
			return "north";
		case 1:
			southStat++;
			return "south";
		case 2:
			westStat++;
			return "west";
		case 3:
			eastStat++;
			return "east";
		default:
			northStat++;
			return "north";
		}
	}

	public String stats() {
		float northVal = (float) northStat / counter * 100;
		float southVal = (float) southStat / counter * 100;
		float westVal = (float) westStat / counter * 100;
		float eastVal = (float) eastStat / counter * 100;
		return String.format("North %.2f | South %.2f | West %.2f| East %.2f", northVal, southVal, westVal, eastVal);
	}

	public int getCounter() {
		return counter;
	}
}
