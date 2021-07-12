package knightingale_HIT;

public class PyramidExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (j<=1) {
				for (int m = 5 - j; m >= i; m--) {
					System.out.print(" ");
				}}
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
