package knightingale_HIT;

public class ReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				if (j>=5) {
					for (int m = 1; m <= i; m++) {
					System.out.print(" ");
					}
				}
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
