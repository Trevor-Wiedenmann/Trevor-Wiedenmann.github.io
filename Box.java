import java.text.DecimalFormat;

/**
 * 
 */

/**
 * @author trevor.wiedenmann
 *
 */
public class Box {
	
	private double width;
	private double height;
	private double depth;
	private boolean full;
	
	public Box(double width, double height, double depth)
	{
				this.width = width;
				this.height = height;
				this.depth = depth;
				this.full = false;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public double getDepth()
	{
		return depth;
	}
	
	public void setDepth(double depth)
	{
		this.depth = depth;
	}
	
	public boolean getFull()
	{
		return full;
	}
	
	public void setFull()
	{
		this.full = true;
	}
	
	public void setEmpty()
	{
		this.full = false;
	}
	
	public double volume()
	{
		return (depth * width * height);
	}
	
	public double surfaceArea()
	{
		return ((depth * width) + (width * height) + (depth * height)) * 2; 
	}
	
	public String toString()
	{
		DecimalFormat fmt = new DecimalFormat("0.##");
		String s = "A";
		if(this.full==true)
			s += " full ";
		else
			s += "n empty ";
		return (s + fmt.format(depth) + " x " + fmt.format(width) + " x " + fmt.format(height) + " box");
	}

}
