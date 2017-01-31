/**
 * Demonstrates the use of nested for loops.
 *
 * @author Java Foundations
 */
public class Stars
{
	/**
	 * Prints a triangle shape using asterisk (star) characters.
	 * @param args
	 */
	public static void main (String[] args)
	{
		final int MAX_ROWS = 10;

		for(int row = 1; row <= MAX_ROWS; row++)
		{
			for(int space = 10; space >= row; space--)
			{
				System.out.print (" ");
			}
			for(int star = 1; star <= row; star++)
			{
				System.out.print ("*");
			}
			System.out.println();
		}
	}
}