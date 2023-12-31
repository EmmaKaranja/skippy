package skippy2;

public class Kangaroo {

	private int xCoord;
	private int yCoord;

	private Dice die = new Dice();

	public void goToStart() {
		xCoord = 0;
		yCoord = 0;
	}

	public int getX() {
		return xCoord;
	}

	public int getY() {
		return yCoord;
	}

	public String hop() {
		return die.roll();
	}

	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}

	public boolean atHome(int size) {
		if (xCoord == size && yCoord == size) {
			return true;
		}
		return false;
	}

	public void move(String direction) {
		if (direction.equals("north")) {
			yCoord++;
		}
		if (direction.equals("south")) {
			yCoord--;
		}
		if (direction.equals("east")) {
			xCoord++;
		}
		if (direction.equals("west")) {
			xCoord--;
		}
	}

	public String position() {
		return String.format("(%d, %d)", xCoord, yCoord);
	}

	public String stats() {
		return die.stats();
	}

	public int numOfHops() {
		return die.getCounter();
	}
}
