/**
 * This Class is made to determine the total surface area and volume when given a radius in the main class. 
 * Authored by: Isabelle Inocencio
 */

public class Sphere 
{

	//Data Attributes 
	private final double pi=3.14;
	private double rad;
	
	
	
	//Constructor 
	/**
	 * This constructor assigns rad to equal the variable r
	 */
	public Sphere (double r)
	{
		rad=r;
	}
	
	
	
	//Functionality 
	/**
	 *This method returns the radius of the sphere 
	 */
	public double getRadius()
	{
		return rad;
	}
	
	/**
	 *This method returns the total surface area of the Sphere with the given formula 4*pi*rad^2
	 */
	public double getTotalSurfaceArea()
	{
		return 4*pi*rad*rad;
	}
	
	/**
	 * This method returns the volume of the sphere using the given formula of (1/3)*pi*rad^3
	 */
	public double getVolume()
	{
		return 1.33*pi*rad*rad*rad;
	}
	
	/**
	 * returns the name of the shape when called
	 */
	public static String getShape()
	{
		return "Sphere";
	}

  
}
