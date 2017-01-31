import java.util.Random;

public class PairOfDice {

	/**
	 * Instance variables
	 */
	private Die die1, die2;

	/**
	 * @param sides
	 *            provides number of sides to dice
	 */
	public PairOfDice(int sides) {
		die1 = new Die(sides);
		die2 = new Die(sides);
	}

	/**
	 * @param sides
	 *            provides number of sides to dice
	 * @param seed1
	 *            provides a seed to the first die
	 * @param seed2
	 *            provides a seed to the second die
	 */
	public PairOfDice(int sides, long seed1, long seed2) {
		die1 = new Die(sides, seed1);
		die2 = new Die(sides, seed2);
	}

	/**
	 * face value accessor for first die
	 * 
	 * @return first die's face value
	 */
	public int getFaceValue1() {
		return die1.getFaceValue();
	}

	/**
	 * face value accessor for second die
	 * 
	 * @return second die's face value
	 */
	public int getFaceValue2() {
		return die2.getFaceValue();
	}

	/**
	 * face value accessor
	 * 
	 * @return total face value
	 */
	public int getTotal() {
		return die1.getFaceValue() + die2.getFaceValue();
	}

	/**
	 * rolls two dice
	 * 
	 * @return random face value from both dice
	 */
	public int roll() {
		return die1.roll() + die2.roll();
	}

	/**
	 * Returns a string representation of two dice.
	 */
	public String toString() {
		return (die1.getFaceValue() + die2.getFaceValue()) + " (" + die1.getFaceValue() + " + " + die2.getFaceValue()
				+ ")";
	}
}
