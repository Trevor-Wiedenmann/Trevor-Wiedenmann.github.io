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
public class ParseForCaps {

	public static final int ERROR_CODE = 1;

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter a filename: ");
		String filename = kbd.nextLine().trim();
		kbd.close();
		File file = new File(filename);
		try {
			Scanner fileScan = new Scanner(file);
			System.out.println("\nContents of \"" + filename + "\":\n");
			while (fileScan.hasNextLine()) {
				String line = fileScan.nextLine();
				Scanner lineScan = new Scanner(line);
				while (lineScan.hasNext()) {
					String token = lineScan.next();
					char ch = token.charAt(0);
					if (Character.isUpperCase(ch)) {
						System.out.print(ch);
					}
				}
				lineScan.close();
			}
			fileScan.close();
		} catch (FileNotFoundException errorObject) {
			System.out.println("File \"" + filename + "\" could not be opened.");
			System.out.println(errorObject.getMessage());
			System.exit(ERROR_CODE);
		}
	}
}