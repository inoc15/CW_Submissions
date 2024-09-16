/*
 * This is our non void method practice in which all our SOPs will be in the main method 
 */


public class HW_NonVoidMethodPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(stateName());
		System.out.println(stateHairStyle());
		System.out.println(stateFavoriteFood());
		double r=8.0;
		double pi=3.14159;
		System.out.println("The radius of a circle is "+r+" the diameter is "+calcDiameter(r)+" it's circumference is "+calcCircumference(r,pi)+" and area is "+calcArea(r,pi));
		int a=3;
		int b=4;
		System.out.println("The two ints are "+a+" & "+b);
		System.out.print("The sum is "+calcSum(a, b)+" and the difference is "+calcDiff(a,b)+". The product is "+calcPro(a,b)+" while the quotient is "+calcQuo(a,b)+" and the modulus is "+calcRem(a,b));
	
	}

	
	
	public static String stateName()
	{
		return "My name is Isabelle Inocencio";
	}
	
	public static String stateEyeColor()
	{
		return "My eye color is Dark Brown. ";
	}
	
	public static String stateHairStyle()
	{
		return "My hairstyle is straight. ";
	}
	
	public static String stateBestFriend()
	{
		return "My bestfriends are Jae and Mattish. ";
	}
	
	public static String stateFavoriteFood()
	{
		return "My favorite food is pasta. ";
	}

	
	
	//Task 2: Create a method printCircleStats() that is passed a double (meant to represent a circle's radius) and 
	//calculates then prints out the radius, diameter, circumference, and area of the circle. Call the method to make sure it works. 
		 
	public static double calcDiameter(double r)
	{
		return r+r;
	}
	
	public static double calcCircumference(double r, double pi)
	{
		return 2*pi*r;
	}

	public static double calcArea(double r, double pi)
	{
		return pi*r*r;
		
	}
	
	
	
	//Task 3: Create a method printMathStuffs() that is passed two ints and prints their sum, difference, product, quotient, and the remainder 
		//(using modulus) of the first number modulus the second number. Call it to make sure it works.
	
	public static int calcSum(int a, int b)
	{
		return a+b;
	}
	public static int calcDiff(int a, int b)
	{
		return a-b;
	}
	public static int calcPro(int a, int b)
	{
		return a*b;
	}
	public static int calcQuo(int a, int b)
	{
		return a/b;
	}
	public static int calcRem(int a, int b)
	{
		return a%b;
	}
	
}


