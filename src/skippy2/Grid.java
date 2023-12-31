package skippy2;

public class Grid {

	public int size;

	public boolean liesOutside(int x, int y) {
		if (x > size || x < 0 || y < 0 || y > size) {
			return true;
		}
		return false;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean atHome(int x, int y) {
		if (x == size && y == size) {
			return true;
		}
		return false;
	}
}
