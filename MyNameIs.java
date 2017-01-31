import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * A simple application to test use of String, Math, DecimalFormat and NumberFormat classes.
 *
 * @author CS121 instructors (starter code)
 * @author Trevor Wiedenmann
 */
public class MyNameIs {

	/**
	 * @param args (unused)
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("First name: ");
		String firstName = keyboard.nextLine();

		System.out.print("Last name: ");
		String lastName = keyboard.nextLine();

		System.out.print("Enter a number: ");
		double n1 = keyboard.nextDouble();

		System.out.print("Enter another number (between 0 and 1): ");
		double n2 = keyboard.nextDouble();
		
		DecimalFormat fmt = new DecimalFormat("0.##");

		System.out.println("\nHi, my name is " + firstName + " " + lastName + ".");

		System.out.println("\nYou'll find me under " + lastName + ", " + firstName);
		
		System.out.println("\nMy name badge:  " + lastName + ", " + firstName);
		
		NumberFormat fmt2 = NumberFormat.getPercentInstance();
		
		System.out.println(fmt2.format(n2) + " of " + n1 + " is " + fmt.format(n1 * n2));
		
		System.out.println(n2 + " raised to the power of " + n1 + " is " + fmt.format(Math.pow(n1, n2)));
	}

}
