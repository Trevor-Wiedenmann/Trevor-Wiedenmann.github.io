import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * Animated program with a ball bouncing off the program boundaries
 * @author mvail
 * @author Trevor Wiedenmann
 */
public class BouncyBall extends JPanel
{
	private final int INIT_WIDTH = 600;
	private final int INIT_HEIGHT = 400;
	private final int DELAY = 100; // milliseconds between Timer events
	private Random rand = new Random(); //random number generator
	private int x, y; //anchor point coordinates
	private int xDelta, yDelta, sizeDelta; //change in x and y from one step to the next
	private final int DELTA_RANGE = 20; //range for xDelta and yDelta
	private final int RADIUS = 10; //circle radius
	int r = rand.nextInt(255);
	int gr = rand.nextInt(255);
	int b = rand.nextInt(255);
	int sizeChange = 0;

	/**
	 * Draws a filled oval with random color and dimensions.
	 *
	 * @param g Graphics context
	 * @return none
	 */
	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();

		//clear canvas
		g.setColor(getBackground());
		g.fillRect(0, 0, width, height);

		//CALCULATE NEW X
		x += xDelta;
		//TODO: needs more to stay in-bounds
		if (x <= 0) {
			xDelta = -xDelta;
			x = 0;
		} else if (x+RADIUS*2 >= width) {
			xDelta = -xDelta;
			x = width - RADIUS * 2;
		}

		//CALCULATE NEW Y
		y += yDelta;
		//TODO: needs more to stay in-bounds
		if(y <= 0) {
			yDelta = -yDelta;
			y = 0;
		} else if (y+RADIUS*2 >= height) {
			yDelta = -yDelta;
			y = height - RADIUS * 2;
		}

		sizeChange += sizeDelta;
		if(sizeChange > 10 || sizeChange < -10){
			sizeDelta = -sizeDelta;
		}
		
		//NOW PAINT THE OVAL
		g.setColor(new Color(r, gr, b));
		g.fillOval(x, y, 2*RADIUS + sizeChange, 2*RADIUS + sizeChange);

		//Makes the animation smoother
		Toolkit.getDefaultToolkit().sync();
	}

	/**
	 * Constructor for the display panel initializes
	 * necessary variables. Only called once, when the
	 * program first begins.
	 * This method also sets up a Timer that will call
	 * paint() with frequency specified by the DELAY
	 * constant.
	 */
	public BouncyBall()
	{
		setPreferredSize(new Dimension(INIT_WIDTH, INIT_HEIGHT));
		this.setDoubleBuffered(true);
		setBackground(Color.black);

		rand = new Random(); //instance variable for reuse in paint()
		
		//initial ball location within panel bounds
		x = INIT_WIDTH / 2;
		y = INIT_HEIGHT / 2;
		//TODO: replace centered starting point with a random
		// position anywhere in-bounds - the ball should never
		// extend out of bounds, so you'll need to take RADIUS
		// into account
		if(x >= 0 || x <= INIT_WIDTH) {
			x = rand.nextInt(INIT_WIDTH);
		}
		
		if(y >= 0 || y <= INIT_HEIGHT) {
			y = rand.nextInt(INIT_HEIGHT);
		}

		//deltas for x and y
		xDelta = rand.nextInt(+DELTA_RANGE);
		yDelta = rand.nextInt(+DELTA_RANGE);
		sizeDelta = 1;
		//TODO: replace with random deltas from -DELTA_RANGE/2
		// to +DELTA_RANGE/2
		
		//Start the animation - DO NOT REMOVE
		startAnimation();
	}

	/**
	 * Create an animation thread that runs periodically
	 * DO NOT MODIFY
	 */
	private void startAnimation() {
		ActionListener taskPerformer = new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				repaint();
			}
		};
		new Timer(DELAY, taskPerformer).start();
	}

	/**
	 * Starting point for the BouncyBall program
	 * DO NOT MODIFY
	 * @param args unused
	 */
	public static void main (String[] args)
	{
		JFrame frame = new JFrame ("Bouncy Ball");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new BouncyBall());
		frame.pack();
		frame.setVisible(true);
	}

}