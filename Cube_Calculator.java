/*
 * this code creates a cube calculator to find the surface area and volume of a cube with an inputed side length.
Authored by Isabelle Inocencio
 */

public class Intro_Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Declare a side length as an integer
		double s=3;
//Calculate Surface Area
		double a=6*s*s;
//Calculate Volume
		double v=s*s*s;
//Print out side length in a sentence as a double
		System.out.print("The side length of a cube is ");
		System.out.println((int)s);
//Print out surface area in a sentence as a double
		System.out.print("Its surface area is ");
		System.out.println((int)a);
//Print out Volume in a sentence as a double
		System.out.print("Its volume is ");
		System.out.print((int)v);
		
	}

}
