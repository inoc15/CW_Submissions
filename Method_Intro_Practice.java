/*
 * This is our Methods Intro Practice assignment where we will practice using methods and voids
 */
public class HW_MethodsIntroPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	
	stateName();
	stateHairStyle();
	stateFavoriteFood();

	printCircleStats(5.0);

	printMathStuffs(3,4);
	
	}
	//Task 1: Create a void method called stateName() that prints out your name. 
	//Repeat this task for stateEyeColor(), stateHairStyle(), stateBestFriend(), and stateFavoriteFood(). 
	//Then, call stateName(), stateHairStyle, and stateFavoriteFood().
			public static void stateName()
			{
				System.out.print("My name is Isabelle. ");
			}
			
			public static void stateEyeColor()
			{
				System.out.print("My eye color is Dark Brown. ");
			}
			
			public static void stateHairStyle()
			{
				System.out.print("My hairstyle is straight. ");
			}
			
			public static void stateBestFriend()
			{
				System.out.print("My bestfriends are Jae and Mattish. ");
			}
			
			public static void stateFavoriteFood()
			{
				System.out.println("My favorite food is pasta. ");
			}
	
	//Task 2: Create a method printCircleStats() that is passed a double (meant to represent a circle's radius) and 
	//calculates then prints out the radius, diameter, circumference, and area of the circle. Call the method to make sure it works. 
	 
			public static void printCircleStats(double r)
			{
				final double pi=3.14159;
				double d=r+r;
				double cir=2*pi*r;
				double are=pi*r*r;
				System.out.println("The radius of a circle is "+r+" the diameter is "+d+" it's circumference is "+cir+" and area is "+are);
			}

	//Task 3: Create a method printMathStuffs() that is passed two ints and prints their sum, difference, product, quotient, and the remainder 
	//(using modulus) of the first number modulus the second number. Call it to make sure it works.
			public static void printMathStuffs(int x, int y)
			{
				int sum=x+y;
				int dif=x-y;
				int pro=x*y;
				int quo=x/y;
				int mod=x%y;
				System.out.println("The two ints are "+x+" & "+y);
				System.out.print("The sum is "+sum+" and the difference is "+dif+". The product is "+pro+" while the quotient is "+quo+" and the modulus is "+mod);
			}
			
			
			
			
			
}
