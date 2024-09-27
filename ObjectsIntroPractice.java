/**
 * This class is used as the "operation center" of my Circle assignment. It includes the code needed to print out the radius, circumference, and area of certain circle
 * Authored by Isabelle Inocencio
 */

public class ShapesMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//CUBE: Will state the name of the shape	
		String shapeOne=Circle.getShape();
		System.out.println(shapeOne);
		//Declares the radius of three different circles
		Circle cirOne=new Circle(2.0);
		Circle cirTwo=new Circle(3.0);
		Circle cirThree=new Circle(4.0);
		
		//Circle One: will print out the radius, circumference, and area of Circle One
		System.out.println("The radius of the circle is "+cirOne.getRadius()+" and it's Circumference is "+cirOne.getCirc()+" and it's Area is "+(int)cirOne.getArea());
		
		//Circle Two: will print out the radius, circumference, and area of Circle Two
		System.out.println("The radius of the circle is "+cirTwo.getRadius()+" and it's Circumference is "+cirTwo.getCirc()+" and it's Area is "+(int)cirTwo.getArea());
		
		//Circle Three: will print out the radius, circumference, and area of Circle Three
		System.out.println("The radius of the circle is "+cirThree.getRadius()+" and it's Circumference is "+cirThree.getCirc()+" and it's Area is "+(int)cirThree.getArea());
		
	}

}
