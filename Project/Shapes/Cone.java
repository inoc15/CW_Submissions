/**
 * This Class is made to determine the total surface area and volume when given radius, height, and slant in the main class. 
 * Authored by: Isabelle Inocencio
 */

public class Cone 
{

	//Data Attributes 
	private final double pi=3.14;
	private double rad;
	private double height;
	private double third=0.3333;
	private double slant;
	
	
	
	//Constructor
	/**
	 * This constructor assigns rad to equal the variable r, height to equal the variable h, and slant to equal the variable s
	 */
	public Cone (double r, double h, double s)
	{
		rad=r;
		height=h;
		slant=s;
	}
	
	
	
	//Functionality 
	/**
	 * This method returns the radius of the cone
	 */
	public double getRadius()
	{
		return rad;
	}
	
	/**
	 * This method returns the height of the cone
	 */
	public double getHeight()
	{
		return height;
	}
	
	/**
	 * This method returns the slant height of a cone
	 */
	public double getSlant()
	{
		return slant;
	}
	
	/**
	 * This method returns the Total surface area of the cone with the given formula of pi*radius*(slant+radius)
	 */
	public double getTotalSurfaceArea()
	{
		return pi*rad*(slant+rad);
	}
	
	/**
	 *This method returns the Volume of the cone with the given formula of (1/3)*pi*radius^2*height
	 */
	public double getVolume()
	{
		return third*pi*rad*rad*height;
	}
	
	/**
	 * returns the name of the shape when called
	 */
	public static String getShape()
	{
		return "Cone";
	}
	
	
	
}
