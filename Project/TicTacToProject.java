/*
 * This is my interactive Tic-Tac-To Project  for two person play
 * Authored by: Isabelle Inocencio
 */
import java.util.Scanner;

public class TicTacTo_Project 
{
	//Scanner as attribute 
	static Scanner myReader = new Scanner (System.in);
	//check for win
	static boolean playerWin = false;
	
	static String[][] gameGrid = new String [3][3];
	
	static String one = "1";
	static String two  = "2";
	static String three = "3";
	static String four = "4";
	static String five = "5";
	static String six = "6";
	static String seven = "7";
	static String eight = "8";
	static String nine = "9";
	
	static boolean on = false;
	static boolean tw = false;
	static boolean th = false;
	static boolean fo = false; 
	static boolean fi = false; 
	static boolean si = false; 
	static boolean se = false; 
	static boolean ei = false; 
	static boolean ni = false;
	
	static String X = "\\u001B[31m";
	static String O = "\\u001B[34m";
	
	static int counter1=0;
	static int counter2=0;
	
	public static void main(String[] args) 
	{
		
		System.out.print("Welcome to Tic-Tac-To!\nTo play, simply enter in the number of the quadrant you would like to place either your X or O in...\n\n  "
				+ "1  |  2  |  3  \n-----------------\n  "
				+ "4  |  5  |  6  \n-----------------\n  "
				+ "7  |  8  |  9  \n\n");
		
		
		
		while (playerWin==false)
		{
			if(playerWin==false)
			{
				player1Decision(gameGrid); 
				System.out.print("\n  "
					+ one + "  |  " + two + "  |  " + three + "\n-----------------\n  "
					+ four + "  |  " + five + "  |  " + six + "\n-----------------\n  "
					+ seven + "  |  " + eight + "  |  " + nine +"  \n\n");
				counter1++;
			}
			
			if (counter1>=3)
			{
				checkIfWin(gameGrid);
			}
			
			if(playerWin==false)
			{
				player2Decision(gameGrid);
				System.out.print("\n  "
					+ one + "  |  " + two + "  |  " + three + "\n-----------------\n  "
					+ four + "  |  " + five + "  |  " + six + "\n-----------------\n  "
					+ seven + "  |  " + eight + "  |  " + nine +"  \n\n");
				counter2++;
			}
			if (counter2>=3)
			{
				checkIfWin(gameGrid);
			}
		}

	}

	public static String player1Decision(String[][] gameGrid)
	{
		System.out.print("Player 1, place your X...\n");
		String userInput=new String(myReader.next());
		
		String x = "X";
		
		if (userInput.equals("1") && on==false)
		{
			on = true;
			gameGrid[0][0]=x;
			return one=gameGrid[0][0];
		}
		else if (userInput.equals("2") && tw==false)
		{
			tw = true;
			gameGrid[0][1]=x;
			return two=gameGrid[0][1];
		}
		else if (userInput.equals("3") && th==false) 
		{
			th = true;
			gameGrid[0][2]=x;
			return three=gameGrid[0][2];
		}
		else if (userInput.equals("4") && fo == false)
		{
			fo = true;
			gameGrid[1][0]=x;
			return four=gameGrid[1][0];
		}
		else if (userInput.equals("5") && fi == false)
		{
			fi = true;
			gameGrid[1][1]=x;
			return five=gameGrid[1][1];
		}
		else if (userInput.equals("6") && si == false)
		{
			si = true;
			gameGrid[1][2]=x;
			return six=gameGrid[1][2];
		}
		else if (userInput.equals("7") && se == false)
		{
			se = true;
			gameGrid[2][0]=x;
			return seven=gameGrid[2][0];
		}
		else if (userInput.equals("8") && ei == false)
		{
			ei = true;
			gameGrid[2][1]=x;
			return eight=gameGrid[2][1];
		}
		else if (userInput.equals("9") && ni == false)
		{
			ni = true;
			gameGrid[2][2]=x;
			return nine=gameGrid[2][2];
		}
		else
		{
			return "Invalid Input, Player 1 forfeits their turn";
		}
	}
	
	
	public static String player2Decision(String[][] gameGrid)
	{
		System.out.print("Player 2, place your O...\n");
		String userInput=new String(myReader.next());
		
		String o = "O";
		
		if (userInput.equals("1") && on == false)
		{
			on = true; 
			gameGrid[0][0]=o;
			return one=gameGrid[0][0];
		}
		else if (userInput.equals("2") && tw == false)
		{
			tw = true; 
			gameGrid[0][1]=o;
			return two=gameGrid[0][1];
		}
		else if (userInput.equals("3") && th == false) 
		{
			th = true;
			gameGrid[0][2]=o;
			return three=gameGrid[0][2];
		}
		else if (userInput.equals("4") && fo == false)
		{
			fo = true;
			gameGrid[1][0]=o;
			return four=gameGrid[1][0];
		}
		else if (userInput.equals("5") && fi == false)
		{
			fi = true;
			gameGrid[1][1]=o;
			return five=gameGrid[1][1];
		}
		else if (userInput.equals("6") && si == false)
		{
			si = true;
			gameGrid[1][2]=o;
			return six=gameGrid[1][2];
		}
		else if (userInput.equals("7") && se == false)
		{
			se = true;
			gameGrid[2][0]=o;
			return seven=gameGrid[2][0];
		}
		else if (userInput.equals("8") && ei == false)
		{
			ei = true;
			gameGrid[2][1]=o;
			return eight=gameGrid[2][1];
		}
		else if (userInput.equals("9") && ni == false)
		{
			ni = true;
			gameGrid[2][2]=o;
			return nine=gameGrid[2][2];
		}
		else
		{
			return "Invalid Input, Player 1 forfeits their turn";
		}
	}
	
	
	public static void checkIfWin(String[][] grid)
	{
		if (grid[0][0] == grid[0][1] && grid[0][1] == grid[0][2])
		{
			System.out.print("wow you win!");
			playerWin = true;;
		}
		else if (grid[1][0] == grid[1][1] && grid[1][1] == grid[1][2])
		{
			System.out.print("wow you win!");
			playerWin=true;
		}
		else if (grid[2][0] == grid[2][1] && grid[2][1] == grid[2][2])
		{
			System.out.print("wow you win!");
			playerWin=true;
		}
		else if (grid[0][0] == grid[1][0] && grid[1][0] == grid[2][0])
		{
			System.out.print("wow you win!");
			playerWin=true;
		}
		else if (grid[0][1] == grid[1][1] && grid[1][1] == grid[2][1])
		{
			System.out.print("wow you win!");
			playerWin=true;
		}
		else if (grid[0][2] == grid[1][2] && grid[1][2] == grid[2][2])
		{
			System.out.print("wow you win!");
			playerWin=true;
		}
		else if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2])
		{
			System.out.print("wow you win!");
			playerWin=true;
		}
		else if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0])
		{
			System.out.print("wow you win!");
			playerWin=true;
		}
		else
		{
			System.out.print("Draw");
		}
		
		
		
		
	}
	
	
	
}
