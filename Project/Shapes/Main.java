/**
 * This class is used as the "operation center" of my shapes project. It includes the code needed to print out the volumes and total surface areas of a cube, cone, cylinder, sphere, and hemisphere.
 * Authored by Isabelle Inocencio
 */
public class Main 
{

	public static void main(String[] args) 
	{
		//keyword "new" separates the things you make to things in the system 
				//Circle cirOne=new Circle(4.0);
				//Circle cirTwo=new Circle(8.0);
				//Circle cirThree=new Circle(-2.0);
		

		//CUBE: Will state the name of the shape
		String shapeOne=Cube.getShape();
		System.out.println(shapeOne);
		
		//CUBE: sets the data type, names the data type, calls the constructor in a certain method, and states the parameters
		Cube cubOne=new Cube(2.0);
		
		//CUBE: Will state the total surface area and volume of the shape stated above
		System.out.println("The side length of the cube is "+(int)cubOne.getSideLength());
		System.out.println("The total surface area is "+(int)cubOne.getTotalSurfaceArea()+ " and the volume is "+(int)cubOne.getVolume());

		
		//CONE: Will state the name of the shape
		System.out.println();
		String shapeTwo=Cone.getShape();
		System.out.println(shapeTwo);
		
		//CONE: sets the data type, names the data type, calls the constructor in a certain method, and states the parameters
		Cone conOne=new Cone(4.0, 6.0, 9.0);
		
		//CONE: Will state the total surface area and volume of the shape stated above
		System.out.println("The radius is "+(int)conOne.getRadius()+", the height is "+(int)conOne.getHeight()+", and the slant height is "+(int)conOne.getSlant());
		System.out.println("The total surface area is "+(int)conOne.getTotalSurfaceArea()+", and the volume is "+(int)conOne.getVolume());
		
		
		//CYLINDER: Will state the name of the shape
		System.out.println();
		String shapeThree=Cylinder.getShape();
		System.out.println(shapeThree);
		
		//CYLINDER: sets the data type, names the data type, calls the constructor in a certain method, and states the parameters
		Cylinder cylOne=new Cylinder(4.0, 7.0);
		
		//CYLINDER: Will state the total surface area and volume of the shape stated above
		System.out.println("The radius for the cylinder is "+(int)cylOne.getRadius()+", and the height is "+(int)cylOne.getHeight());
		System.out.println("The total surface area is "+(int)cylOne.getTotalSurfaceArea()+", and the volume is "+(int)cylOne.getVolume());
		
		
		//SPHERE: Will state the name of the shape
		System.out.println();
		String shapeFour=Sphere.getShape();
		System.out.println(shapeFour);
		
		//SPHERE: sets the data type, names the data type, calls the constructor in a certain method, and states the parameters
		Sphere sphOne=new Sphere(5.0);
		
		//SPHERE: Will state the total surface area and volume of the shape stated above
		System.out.println("The radius of the sphere is "+(int)sphOne.getRadius());
		System.out.println("The total surface area is "+(int)sphOne.getTotalSurfaceArea()+", and the volume is "+(int)sphOne.getVolume());
			

		//HEMISPHERE: Will state the name of the shape
		System.out.println();
		String shapeFive=Hemisphere.getShape();
		System.out.println(shapeFive);

		//HEMISPHERE: sets the data type, names the data type, calls the constructor in a certain method, and states the parameters
		Hemisphere hemOne=new Hemisphere(2.0);
		
		//HEMISPHERE:  Will state the total surface area and volume of the shape stated above
		System.out.println("The radius of the sphere is "+(int)hemOne.getRadius());
		System.out.println("The total surface area is "+(int)hemOne.getTotalSurfaceArea()+", and the volume is "+(int)hemOne.getVolume());

		//The simpler way to state everything about a given cube 
		System.out.println();
		System.out.print(cubOne.toString());
	
	}

}
