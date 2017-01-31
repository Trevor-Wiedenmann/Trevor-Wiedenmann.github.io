import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author trevor.wiedenmann
 *
 */
public class ParseAndRewrap {

	public static final int ERROR_CODE = 1;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter a filename: ");
		String filename = kbd.nextLine().trim();
		System.out.println("Please enter the maximum number of characters in a single line: ");
		/**
		 * length variable keeps track of current line length
		 */
		int length = kbd.nextInt();
		kbd.close();
		File file = new File(filename);
		try {
			Scanner fileScan = new Scanner(file);
			/**
			 * The new string will be built here
			 */
			System.out.println();
			System.out.println(filename + " reformatted with a maximum line length of " + length + ":");
			System.out.println();
			/**
			 * When the target length is reached, a new line will be printed
			 */
			int longest = 0;
			int shortest = 1000;
			String output = "";
			while (fileScan.hasNextLine()) {
				String line = fileScan.nextLine();
				Scanner lineScan = new Scanner(line);
				while (lineScan.hasNext()) {
					String token = lineScan.next();
					if ((output.length() + token.length()) < length) {
						output += token + " ";
					} else if ((output.length() + token.length()) == length) {
						output += token;
						System.out.println(output);
						output = "";
					} else {
						System.out.println(output);
						output = token + " ";
					}
				}
				lineScan.close();
			}
			fileScan.close();
			System.out.println(output);
			if(output.length() > longest)
			{
				longest = length;
			}
			if(output.length() < shortest)
			{
				shortest = output.length();
			}
			/**
			 * to keep track of the longest and shortest lines, a longest and
			 * shortest variable will be called These variables need to be
			 * updated when a text file is reformatted
			 */
			System.out.println();
			System.out.println("Longest line: " + longest);
			System.out.println("Shortest line: " + shortest);
		} catch (FileNotFoundException errorObject) {
			System.out.println("File \"" + filename + "\" could not be opened.");
			System.out.println(errorObject.getMessage());
			System.exit(ERROR_CODE);
		}

	}
}
