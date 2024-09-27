/**
 * This Class is made to determine the total surface area and volume when given a radius and height in the main class. 
 * Authored by: Isabelle Inocencio
 */

public class Cylinder {

	//Data Attributes 
	private final double pi=3.14;
	private double rad;
	private double height;
	
	
	
	//Constructor 
	/**
	 * This constructor assigns rad to equal the variable r and height to equal the variable  h
	 */
	public Cylinder (double r, double h) 
	{
		rad=r;
		height=h;
	}
	
	
	
	//Functionality 
	/**
	 *This method returns the radius of the cylinder when called
	 */
	public double getRadius()
	{
		return rad;
	}
	
	/**
	 * Set radius
	 */
	public void setRad(double rad) {
		this.rad = rad;
	}

	/**
	 *set height 
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * This method returns the height of the cylinder
	 */
	public double getHeight()
	{
		return height;
	}
	
	/**
	 *this method returns the total surface area of the cylinder
	 */
	public double getTotalSurfaceArea()
	{
		return 2*pi*rad*(rad+height);
	}
	
	/**
	 *This method returns the volume of the cylinder
	 */
	public double getVolume()
	{
		return pi*rad*rad*height;
	}
	
	/**
	 * returns the name of the shape when called
	 */
	public static String getShape()
	{
		return "Cylinder";
	}
	
	
	
	
}
