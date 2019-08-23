package j01.procedural;

public class Exercise1b {
	public static void main(String[] args) {
		int x = 1;
		while (x < 10) {
			x = x + 1;
			if (x > 3) {
				System.out.println("big x");
			}
		}

		int y = 5;
		while (y > 1) {
			y = y - 1;
			if (y < 3) {
				System.out.println("small ");
			}
		}

		int z = 5;
		while (z > 1) {
			z = z - 1;
			if (z < 3) {
				System.out.println("small x");
			}
		}

	}

}
