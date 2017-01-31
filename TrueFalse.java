import java.util.Arrays;

/**
 * 
 */

/**
 * @author trevor.wiedenmann
 *
 */
public class TrueFalse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] flags = new boolean[10];
		flags[0] = true;
		flags[1] = false;
		flags[2] = true;
		flags[3] = false;
		flags[4] = true;
		flags[5] = false;
		flags[6] = true;
		flags[7] = false;
		flags[8] = true;
		flags[9] = false;
		System.out.println("length: " + flags.length);
		System.out.println("contents: " + Arrays.toString(flags));		
	}
	public static boolean[] copyArray(boolean[] flags)
	{
		boolean[] flags2 = new boolean[flags.length];
		for(int i = 0; i < flags.length; i++)
		{
			flags2[i] = flags[i];
		}
		return flags2;
	}

}
