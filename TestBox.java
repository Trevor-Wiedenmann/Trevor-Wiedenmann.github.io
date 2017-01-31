import java.util.ArrayList;
import java.util.Random;

/**
 * 
 */

/**
 * @author trevor.wiedenmann
 *
 */
public class TestBox {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		ArrayList<Box> boxes = new ArrayList<Box>();
		Box smallBox = new Box(4.0, 5.0, 2.0);
		smallBox.toString();
		System.out.println(smallBox);
		System.out.println("smallBox's width = " + smallBox.getWidth());
		System.out.println("smallBox's height = " + smallBox.getHeight());
		System.out.println("smallBox's depth = " + smallBox.getDepth());
		System.out.println("smallBox's volume = " + smallBox.volume());
		System.out.println("smallBox's surface area = " + smallBox.surfaceArea());
		System.out.println("smallBox reports its full status as: " + smallBox.getFull());
		smallBox.setWidth(2);
		smallBox.setHeight(3);
		smallBox.setDepth(1);
		System.out.println("smallBox's width = " + smallBox.getWidth());
		System.out.println("smallBox's height = " + smallBox.getHeight());
		System.out.println("smallBox's depth = " + smallBox.getDepth());
		System.out.println("smallBox's volume = " + smallBox.volume());
		System.out.println("smallBox's surface area = " + smallBox.surfaceArea());
		System.out.println("smallBox reports its full status as: " + smallBox.getFull());
		for(int i = 0; i < 5; i++)
		{
			double randwidth = rand.nextInt(100);
			double randheight = rand.nextInt(100);
			double randdepth = rand.nextInt(100);
			Box randomBox = new Box(randwidth, randheight, randdepth);
			boxes.add(randomBox);
			System.out.println("Box " + i + ": " + randomBox);
		}
		double largest = boxes.get(0).volume();
		Box biggestBox = boxes.get(0);
		for(Box box: boxes)
		{
			if(box.volume() > largest)
			{
				largest = box.volume();
				biggestBox = box;
			}
		}
		System.out.println("Largest Box: " + biggestBox + " with volume " + biggestBox.volume() + " and surface area " + biggestBox.surfaceArea());
	}

}
