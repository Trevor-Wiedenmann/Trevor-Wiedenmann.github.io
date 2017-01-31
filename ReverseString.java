import java.util.Scanner;

/**
 * 
 */

/**
 * @author trevor.wiedenmann
 *
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String reverse = kbd.nextLine().trim();
		System.out.println("Your string: " + reverse);
		StringBuilder input1 = new StringBuilder();
		  input1.append(reverse);
		  input1=input1.reverse(); 
		  for (int i=0;i<input1.length();i++)
		  System.out.print(input1.charAt(i));
		  kbd.close();
		 }
}
