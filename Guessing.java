import java.util.*;

/**
 * Demonstrates the use of a block statement in an if-else.
 *
 * @author Java Foundations
 */
public class Guessing
{
	/**
	 * Plays a simple guessing game with the user.
	 * @param args
	 */
	public static void main(String[]args)
	{
		final int MAX = 10;
		int answer, guess;

		Scanner scan = new Scanner(System.in);
		Random generator = new Random();

		answer = generator.nextInt(MAX) + 1;
		
		do
		{
			System.out.print("I'm thinking of a number between 1 and "
					+MAX + ". Guess what it is: ");
			guess = scan.nextInt();
			if(guess < 0 || guess > MAX) {
				System.out.println("That number is out of range. Guess again.");
			}
			
			if (guess == answer)
			{
				System.out.println("You got it! Good guessing!");
			}
			else
			{
				if (guess < answer) {
					System.out.println("Lower than the answer. Guess again.");
				}
				if (guess > answer) {
					System.out.println("Higher than the answer. Guess again.");
				}
			}
		} while(guess != answer);
		scan.close();
	}
}