*
 * This is the Monty hall game created October 23, 2024 
 *(int)(Math.random()*range)+min;
 * authored by Isabelle Inocencio
 */
import java.util.Scanner;

public class MontyHallGame 
{
	//scanner as data attribute
	static Scanner myReader = new Scanner (System.in);
	
	//declare data attribute correctDoor equal to method pickRandomDoor
	int correctDoor=pickRandomDoor();
	//declare data attribute playerDoor equal to method pickPlayerDoor
	int playerDoor=pickPlayerDoor();
	//declare data attribute correctDoor equal to method pickRandomDoor
	int revealDoor= wrongDoor(correctDoor, playerDoor);
	
	public static void main(String[] args) 
	{
		//declares ints set to methods
		int correctDoor=pickRandomDoor();
		int playerDoor=pickPlayerDoor();
		int revealDoor= wrongDoor(correctDoor, playerDoor);
		
		//Prints out statements for player
		System.out.println("The door you have selected is "+playerDoor);
		System.out.println("");
		System.out.println("The incorrect door is revealed as door number "+revealDoor);
		System.out.println("");
		switchOrStayDoor(revealDoor, playerDoor, correctDoor);

		//closes scanner
		myReader.close();
		
		
	}

	

	/*
	 * returns the a random door number
	 */
	private static int pickRandomDoor() 
	{
		return (int)(Math.random()*3)+1;
		
	}

	
	
	/*
	 * Returns the player's selected door
	 */
	private static int pickPlayerDoor() 
	{
		System.out.println("Please choose a number between 1-3; (one, two, or three);");
		
		String userInput=new String(myReader.next());
	
		
		if (userInput.equals("one")|| userInput.equals("1"))
		{
			return 1;
		}
		else if (userInput.equals("two")|| userInput.equals("2"))
		{
			return 2;
		}
		else if (userInput.equals("three")|| userInput.equals("3"))
		{
			return 3;
		}
		else 
		{
			System.out.println("run code again");
			return -1;
		}
		
	}
		
	
	
	/*
	 * returns the reveal door
	 */
	private static int wrongDoor(int cor, int pla)
	{
		
		int wrongA;
		int wrongB;
		int unselectedA;
		int unselectedB;
		
		int revealDoor = pickRandomDoor();
			
			if (cor==1)
			{
				wrongA=2;
				wrongB=3;
			}
			else if (cor==2)
			{
				wrongA=1;
				wrongB=3;
			}
			else if (cor==3)
			{
				wrongA=1;
				wrongB=2;
			}
			else 
			{
				return -1;
			}
			
			
			if (pla==1)
			{
				unselectedA=2;
				unselectedB=3;
			}
			else if (pla==2)
			{
				unselectedA=1;
				unselectedB=3;
			}
			else if (pla==3)
			{
				unselectedA=1;
				unselectedB=2;
			}
			else
			{
				return -1;
			}
			
			if (pla!=cor)
			{
				
				if(wrongA==unselectedA)
				{
					revealDoor=wrongA;
				}
				else if(wrongA==unselectedB)
				{
					revealDoor=wrongA;
				}
				else if(wrongB==unselectedA)
				{
					revealDoor=wrongB;
				}
				else if(wrongB==unselectedB)
				{
					revealDoor=wrongB;
				}
				else
				{
					return -1;
				}
			}
			else 
			{
				
				int randomDoor= (int)(Math.random()*2)+1;
				if (randomDoor==1)
				{
					revealDoor=wrongA;
				}
				else if (randomDoor==2)
				{
					revealDoor=wrongB;
				}
				else
				{
					return -1;
				}
			}
			
			
			return revealDoor;
		}
		
	
	
	/*
	 * returns the switch door and prints out either a victory statement or game over statement
	 */
	public static void switchOrStayDoor(int revealDoor, int playerDoor, int correctDoor)
	{
		System.out.println("Would you like to switch doors?switch/stay");
		String userInput=new String(myReader.next());
		
		if (userInput.equals("switch"))
		{
			if (playerDoor==1 && revealDoor==2)
			{
				System.out.println("Your door is now door 3.");
				playerDoor=3;
			}
			else if (playerDoor==1 && revealDoor==3)
			{
				System.out.println("Your door is now door 2.");
				playerDoor=2;
			}
			else if (playerDoor==2 && revealDoor==1)
			{
				System.out.println("Your door is now door 3.");
				playerDoor=3;
			}
			else if (playerDoor==2 && revealDoor==3)
			{
				System.out.println("Your door is now door 1.");
				playerDoor=1;
			}
			else if (playerDoor==3 && revealDoor==1)
			{
				System.out.println("Your door is now door 2.");
				playerDoor=2;
			}
			else if (playerDoor==3 && revealDoor==2)
			{
				System.out.println("Your door is now door 1");
				playerDoor=1;
			}
			else 
			{
				System.out.print("");
			}
		}
		else 
		{
			System.out.println("You have chosen to keep the same door. Don't regret it.");
			System.out.println(" | ");
			System.out.println(" | ");
			System.out.println(" v ");
			System.out.println(" | ");
			System.out.println(" | ");
			System.out.println(" | ");
			System.out.println(" v ");
			System.out.println(" | ");
			System.out.println(" | ");
			System.out.println(" | ");
			System.out.println(" | ");
			System.out.println(" v ");
			System.out.println(" | ");
			System.out.println(" | ");
			System.out.println(" | ");
			System.out.println(" | ");
			System.out.println(" | ");
			System.out.println(" v ");
			
		}
		
		if (playerDoor==correctDoor)
		{
			System.out.print("Huzzah thou hath done it! You have chosen the correct door!");
		}
		else 
		{
			System.out.println("Ahh Blimey you are incorrect ):");
			System.out.print("The correct door is actually door "+correctDoor);
		}
	}
	

	
}
