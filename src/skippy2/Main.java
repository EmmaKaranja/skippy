//package skippy2;
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		int gridsize = 7;
//		int size = gridsize - 1;
//
//		Grid board = new Grid();
//		board.setSize(size);
//
//		Kangaroo skippy = new Kangaroo();
//		skippy.goToStart();
//
//		System.out.println(skippy.position());
//		do {
//			String direction = skippy.hop();
//			skippy.move(direction);
//			if (board.liesOutside(skippy.getX(), skippy.getY()) == true) {
//				System.out.println("Hopped beyond boundary " + skippy.position());
//				switch (direction) {
//				case "north":
//					skippy.move("south");
//					break;
//				case "south":
//					skippy.move("north");
//					break;
//				case "west":
//					skippy.move("east");
//					break;
//				case "east":
//					skippy.move("west");
//					break;
//				default:
//					System.out.println("System error");
//					break;
//				}
//			} else {
//				System.out.println(skippy.position());
//			}
////		} while (skippy.getX() != size || skippy.getY() != size);
//		} while (!board.atHome(skippy.getX(), skippy.getY()));
//		String hops = String.format("Finished in %d hops!!!", skippy.numOfHops());
//		System.out.println(hops);
//		System.out.println(skippy.stats());
//	}
//}
