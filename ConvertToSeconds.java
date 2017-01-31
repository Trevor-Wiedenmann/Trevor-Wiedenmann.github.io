import java.util.Scanner;
/**
 * This class converts hours, minutes, and seconds into seconds.
 * 
 * @author Trevor Wiedenmann
 */
public class ConvertToSeconds 
{
	public static void main(String[] args)
	{
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter hours: ");
		int hours = kbd.nextInt();
		System.out.println("Enter minutes: ");
		int minutes = kbd.nextInt();
		System.out.println("Enter seconds: ");
		int seconds = kbd.nextInt();
		int totalSeconds = ((hours * 60 * 60) + (minutes * 60) + seconds);
		System.out.println(totalSeconds + " seconds");
		kbd.close();
	}
}
