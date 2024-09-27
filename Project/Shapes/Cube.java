
/**
 * This Class is made to determine the total surface area and volume when given a side length in the main class. 
 * Authored by: Isabelle Inocencio
 */

public class Cube 
{

	//Data attributes
	private double side;
	
	
	
	//constructor 
	/**
	 * This constructor assigns "side" to equal variable s
	 */
	public Cube (double s)
	{
		side=s;
	}
	
	
	
	//functionality 
	/**
	 * This method returns the side length of the cube
	 */
	public double getSideLength()
	{
		return side;
	}
	
	/**
	 * This method returns the total surface area of a cube with the given formula of 6*side^2
	 */
	public double getTotalSurfaceArea()
	{
		return 6*side*side;
	}
	
	/**
	 * This method returns the volume of a cube with the given formula side^3
	 */
	public double getVolume()
	{
		return side*side*side;
	}
	
	/**
	 * returns the name of the shape when called
	 */
	public static String getShape()
	{
		return "Cube";
	}
	
	/**
	 * This turns everything about the circle object into a string so its easier to call
	 */
	public String toString()
	{
		return "This is a Cube with a side length of "+side+" and a total surface area of "+getTotalSurfaceArea()+" and a volume of "+getVolume()+".";
	}
	
}
