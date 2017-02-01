/**
 * CS 121 Lab: Conditionals and Loops 2
 * @author CS121 Instructors
 * @author YOUR NAME HERE
 */
public class GoingLoopy
{
	public static void main(String[] args)
	{
		/*
		 * TODO: Print multiples of 7 between 0 and 100 using a while loop
		 *
		 * 1. Use a while loop to evaluate every integer from 0 to 100
		 *    to see which are evenly divisible by 7.
		 * 2. Print each multiple of 7 and keep track of the number of
		 *    multiples of 7 as you go. (Use the numMultiples variable initialized
		 *    below to keep track of the number of multiples.)
		 */
		System.out.println("Multiples of 7 between 0 and 100 (using while loop):");

		int numMultiples = 0; // Keeps track of the number of integers evenly divisible by 7.
		int count = 0;
		/*------------------ Your code goes here ------------------*/

		while (count < 100)
		{
			if(count%7 == 0){
				System.out.print(numMultiples + " ");
				numMultiples++;

			}
			count++;
		}

		/*---------------------------------------------------------*/

		// Prints the total number of multiples of 7.
		System.out.println("total: " + numMultiples);
		System.out.println();

		/*
		 * TODO: Print multiples of 7 between 0 and 100 using a for loop
		 *
		 * 1. Use a for loop to accomplish exactly the same task as in the previous
		 *    while loop.
		 */
		System.out.println("Multiples of 7 between 0 and 100 (using for loop):");

		numMultiples = 0; // Keeps track of the number of integers evenly divisible by 7.

		/*------------------ Your code goes here ------------------*/

		for(count = 0; count <= 100; count++){
			if (count % 7 == 0)
			{
				System.out.print(count + " ");
				numMultiples++;
			}
		}
			
		
		/*---------------------------------------------------------*/

		// Prints the total number of multiples of 7.
		System.out.println("total: " + numMultiples);
		System.out.println();

		/*
		 * TODO: Print multiples of 7 between 0 and 100 using a do-while loop
		 *
		 * 1. Use a do-while loop to accomplish exactly the same task as in the previous
		 *    while and for loops.
		 */
		System.out.println("Multiples of 7 between 0 and 100 (using do loop):");

		numMultiples = 0; // Keeps track of the number of integers evenly divisible by 7.
		count = 0;

		/*------------------ Your code goes here ------------------*/
		
		do
		{
			if (count % 7 == 0)
		{
				System.out.print(count + " ");
				numMultiples++;
		}		
				count++;
		} while(count < 100);
		

		/*---------------------------------------------------------*/

		// Prints the total number of multiples of 7.
		System.out.println("total: " + numMultiples);
		System.out.println();

		/*
		 * TODO: Print a 2-dimensional table of values using a nested for loop
		 *
		 * 1. The outer loop will iterate from 1 to MAX_ROWS rows.
		 * 2. The inner loop will iterate from 1 to MAX_COLS columns.
		 * 3. Print each value in the table as the product of the row and column numbers.
		 *    (rowNumber x columnNumber).
		 */

		final int MAX_ROWS = 5;
		final int MAX_COLS = 10;

		System.out.println("Multiplication table:");
		/*------------------ Your code goes here ------------------*/

		 for (int i = 1; i <= MAX_ROWS; i++) {
	         System.out.print(i + " ");
	         for (int j = 1; j <= MAX_COLS; j++) {
	            System.out.print(i*j + " ");
	         }
	         System.out.println();
	      }

		/*---------------------------------------------------------*/

		System.out.println();
	}
}