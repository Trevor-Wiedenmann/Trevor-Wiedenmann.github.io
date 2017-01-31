import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Draws gradients across the width of the panel
 * 
 * @author ?
 */
@SuppressWarnings("serial")
public class GradientLooperFourColors extends JPanel {
	/*
	 * This method draws on the Graphics context. This is where your work will
	 * be.
	 *
	 * (non-Javadoc)
	 * 
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	public void paintComponent(Graphics canvas) {
		// ready to paint
		super.paintComponent(canvas);

		// account for changes to window size
		int width = getWidth(); // panel width
		int height = getHeight(); // panel height

		final int GRADIENT_DIVISIONS = 256;
		final int NUM_GRADIENT_BARS = 1;

//		Color color;
//		int r = 0;
//		int g = 0;
//		int b = 0;
//		int x = 0;
		int rectWidth = (int) Math.ceil((double) width / GRADIENT_DIVISIONS);
		// TODO: Your code goes here

		/**for (int i = 0; i < GRADIENT_DIVISIONS; i++) {
			color = new Color(r, g, b);
			canvas.setColor(color);
			canvas.fillRect(x, 0, rectWidth, height / 4);
			r++;
			g++;
			b++;
			x += rectWidth;
		}
		r = 0;
		g = 0;
		b = 0;
		x = 0;
		for (int i = 0; i < GRADIENT_DIVISIONS; i++) {
			Color color2 = new Color(r, g, b);
			canvas.setColor(color2);
			canvas.fillRect(x, height / 4, rectWidth, height / 4);
			r++;
			x += rectWidth;
		}
		r = 0;
		g = 0;
		b = 0;
		x = 0;
		for (int i = 0; i < GRADIENT_DIVISIONS; i++) {
			Color color3 = new Color(r, g, b);
			canvas.setColor(color3);
			canvas.fillRect(x, height / 2, rectWidth, height / 4);
			g++;
			x += rectWidth;
		}
		r = 0;
		g = 0;
		b = 0;
		x = 0;
		for (int i = 0; i < GRADIENT_DIVISIONS; i++) {
			Color color4 = new Color(r, g, b);
			canvas.setColor(color4);
			canvas.fillRect(x, height * 3 / 4, rectWidth, height / 4);
			b++;
			x += rectWidth;
		}
*/
		int x = 0;
		for (int j = 0; j < 4; j++) {
			x = 0;
			for (int i = 0; i < GRADIENT_DIVISIONS; i++) {
				
				Color color = null;
				switch (j) {
				case 0: // Gray
					color = new Color(i, i, i);
					break;
				case 1: // Red
					color = new Color(i, 0, 0);
					break;
				case 2: // Green
					color = new Color(0, i, 0);
					break;
				case 3: // Blue
					color = new Color(0, 0, i);
					break;
				}
				canvas.setColor(color);
				canvas.fillRect(x, j * (height / 4), rectWidth, height / 4);
				x += rectWidth;
			}
		}

	}

	/**
	 * DO NOT MODIFY Constructor for the display panel initializes necessary
	 * variables. Only called once, when the program first begins.
	 */
	public GradientLooperFourColors() {
		setBackground(Color.black);
		int initWidth = 768;
		int initHeight = 512;
		setPreferredSize(new Dimension(initWidth, initHeight));
		this.setDoubleBuffered(true);
	}

	/**
	 * DO NOT MODIFY Starting point for the program
	 * 
	 * @param args
	 *            unused
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("GradientLooperFourColors");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new GradientLooperFourColors());
		frame.pack();
		frame.setVisible(true);
	}
}
