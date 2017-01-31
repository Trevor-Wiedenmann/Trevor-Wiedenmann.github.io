import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author trevor.wiedenmann
 *
 */
public class UpDown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Up Down");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new UpDownPanel());

		frame.pack();
		frame.setVisible(true);
	}

}
