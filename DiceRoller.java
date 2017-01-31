import java.util.Scanner;

/**
 * Demonstrates the use of a programmer-defined class.
 * 
 * @author Trevor Wiedenmann
 */
public class DiceRoller {
	/**
	 * Creates two Die objects and rolls them once, counts the sum of the dice,
	 * and determines a winner between the user and the computer, or a draw
	 * otherwise
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Declared variables.
		 */
		int numberOfSides = 6;
		PairOfDice dice = new PairOfDice(numberOfSides);
		Scanner kbd = new Scanner(System.in);
		String yes = null;
		int userWins = 0;
		int computerWins = 0;
		int ties = 0;
		/**
		 * Do while loop that rolls two dice, determines sum of two dice, and
		 * determines a winner.
		 */
		do {
			dice.roll();
			System.out.println("Your roll: " + dice.toString());
			dice.roll();
			System.out.println("Computer's roll: " + dice.toString());
			if (dice.getFaceValue1() > dice.getFaceValue2()) {
				System.out.println("User Wins!");
				userWins++;
			} else if (dice.getFaceValue1() < dice.getFaceValue2()) {
				System.out.println("Computer Wins!");
				computerWins++;
			} else {
				System.out.println("Draw!");
				ties++;
			}
			System.out.println("Your wins: " + userWins + " Computer's wins: " + computerWins + " Ties: " + ties);
			System.out.println("Do you want to roll again? (Y)es to continue, anything else to quit.");
			yes = kbd.nextLine().trim();
		} while (yes.toLowerCase().equals("y"));
		kbd.close();
	}

}
