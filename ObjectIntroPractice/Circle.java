
/**
 * This class is designed to solve for a circle's circumference and area with a given radius 
 * Authored by Isabelle Inocencio
 */


public class Circle 
{
//Static means it does not depend on a specific object 
	
	//data attributes 
	private final double pi=3.14;
	private double rad;
	
	
	
	//constructor 
	/**
	 * This constructor assigns rad to equal the variable r
	 */
	public Circle (double r)
	{
		rad=r;
	}
	
	
	
	//functionality 
	/**
	 *This method returns the radius of the circle
	 */
	public double getRadius()
	{
		return rad;
	}
	
	/**
	 *This method returns the circumference of the circle with the given radius
	 */
	public double getCirc()
	{
		return 2*pi*rad;
	}
	
	/**
	 * This method returns the area of the circle with the given formula of pi*rad^2
	 */
	public double getArea()
	{
		return pi*rad*rad;
	}
	
	/**
	 * returns the name of the shape when called
	 */
	public static String getShape()
	{
	return "Circle";
	}
	
	/**
	 * is a setter
	 */
	public void setRadius(double r)
	{
		rad=r;
	}

	
	
}
