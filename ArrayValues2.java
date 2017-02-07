/**
 * 
 */

/**
 * @author trevor.wiedenmann
 *
 */
public class ArrayValues2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NROWS = 3;
		final int NCOLS = 5;
		final int MAXVAL = 10;

		int[][] grid = new int[NROWS][NCOLS];

		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				grid[row][col] = row + col;
				if (grid.length > MAXVAL) {
					grid[row][col] = row++;
				}
			}
		}
	}
}