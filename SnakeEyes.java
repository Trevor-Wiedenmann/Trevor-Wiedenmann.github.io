import java.util.Scanner;

/**
 * Demonstrates the use of a programmer-defined class.
 * 
 * @author Trevor Wiedenmann
 */
public class SnakeEyes {
	/**
	 * Creates two Die objects and rolls them several times, counting the number
	 * of snake eyes that occur.
	 * 
	 * @param args
	 *            (unused)
	 */
	public static void main(String[] args) {
		Die die1 = null, die2 = null;
		final int ROLLS = 500;
		int num1, num2, count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many sides are on die 1?");
		int dieOneSides = scan.nextInt();
		System.out.println("How many sides are on die 2?");
		int dieTwoSides = scan.nextInt();
		System.out.println("Enter a seed(0 for no seed)");
		int seed = scan.nextInt();
		scan.close();
		if (seed == 0) {
			die1 = new Die(dieOneSides);
			die2 = new Die(dieTwoSides);
		}
		if(seed != 0)
		{
			die1 = new Die(dieOneSides, seed);
			die2 = new Die(dieTwoSides, seed);
		}

		for (int roll = 1; roll <= ROLLS; roll++) {
			num1 = die1.roll();
			num2 = die2.roll();

			// print the value of die1 and die2
			System.out.println("roll " + roll);

			System.out.println("die1 value: " + die1.getFaceValue());
			System.out.println("die2 value: " + die2.getFaceValue());

			System.out.println();

			if (num1 == 1 && num2 == 1) // check for snake eyes
				count++;
		}

		System.out.println("Number of rolls: " + ROLLS);
		System.out.println("Number of snake eyes: " + count);
		System.out.println("Ratio: " + (double) count / ROLLS);
	}
}