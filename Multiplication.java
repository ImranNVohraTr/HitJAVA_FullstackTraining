package knightingale_HIT;
import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Let us multiply two numbers.");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int first = scan.nextInt();
		System.out.println("Enter the second number: ");
		int second = scan.nextInt();
		int product = first*second;
		System.out.println("The product of the numbers is: " + product + ".");
	}

}
