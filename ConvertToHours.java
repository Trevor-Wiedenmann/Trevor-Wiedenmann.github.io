import java.util.Scanner;
/**
 * This class converts seconds into hours, minutes, and seconds.
 * 
 * @author Trevor Wiedenmann
 */
public class ConvertToHours 
{
	public static void main(String[] args)
	{
		final int minutesInAnHour = 60;
		final int secondsInAMinute = 60;
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter seconds: ");
		int totalSeconds = kbd.nextInt();
		int seconds = totalSeconds % secondsInAMinute;
		int totalMinutes = totalSeconds / secondsInAMinute;
		int minutes = totalMinutes % minutesInAnHour;
		int hours = totalMinutes / minutesInAnHour;
		System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");
		kbd.close();
		double fHours = (double)totalMinutes / (double)minutesInAnHour;
		System.out.println("Fractional hours: " + fHours);
	}
}
