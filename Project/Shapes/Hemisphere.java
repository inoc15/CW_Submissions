/**
 * This Class is made to determine the total surface area and volume when given a radius in the main class. 
 * Authored by: Isabelle Inocencio
 */

public class Hemisphere 
{

	//Data Attributes 
	private final double pi=3.14;
	private double rad;
	
	
	
	//Constructor  
	/**
	 * This constructor assigns rad to equal the variable r
	 */
	public Hemisphere (double r)
	{
		rad=r;
	}
	
	
	
	//Functionality 
	/**
	 * returns the radius of the circle object
	 */
	public double getRadius()
	{
		return rad;
	}
	
	/**
	 * Returns the total surface area of the hemisphere using the given formula 3*pi*rad^2
	 */
	public double getTotalSurfaceArea()
	{
		return 3*pi*rad*rad;
	}
	
	/**
	 *returns the volume of the hemisphere using the given formula (2/3)*pi*rad^3
	 */
	public double getVolume()
	{
		return 0.666*pi*rad*rad*rad;
	}
	
	/**
	 * returns the name of the shape when called
	 */
	public static String getShape()
	{
		return "Hemisphere";
	}
	
	
}
