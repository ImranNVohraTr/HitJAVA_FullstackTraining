package knightingale_HIT;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int num = scan.nextInt();
		
		if (num%2 == 0)
			System.out.println("The number you entered is an even number.");
		else
			System.out.println("The number you entered is an odd number.");
	}

}
