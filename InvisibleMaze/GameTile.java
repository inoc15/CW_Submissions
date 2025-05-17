/*
 * This is my game tile class which uses setters on each object to determine which tiles are wals and which tiles are not walls
 * Authored by: Isabelle Inocencio
 */
public class InvisibleMazeGameTile 
{
	
	//Data attributes
	private boolean hasPlayer = false;
	private boolean isRevealed = false;
	private boolean isWall = false;
	
	//Constructor
	/*
	 * this constructor assigns false to all the variables
	 */
	public InvisibleMazeGameTile (boolean hpla, boolean irev, boolean iwal)
	{
		hasPlayer=hpla;
		isRevealed=irev;
		isWall=iwal;
	}
	
	//Functionality
	/*
	 * returns whether the player is on that tile
	 */
	public boolean getHasPlayer()
	{
		return hasPlayer;
	}
	
	/*
	 * return true or false for whether tile is revealed to player
	 */
	public boolean getIsRevealed()
	{
		return isRevealed;
	}
	
	/*
	 * return true or false for whether the wall is or is not there
	 */
	public boolean getIsWall()
	{
		return isWall;
	}
	
	/*
	 * set hasPlayer
	 */
	public void setHasPlayer(boolean hpla)
	{
		this.hasPlayer = hpla;
	}
	
	/*
	 * set isRevealed
	 */
	public void setIsRevealed(boolean irev)
	{
		this.isRevealed = irev;
	}
	
	/*
	 * set isWall
	 */
	public void setIsWall(boolean iwal)
	{
		this.isWall = iwal;
	}
	
	/*
	 * This turns everything about the circle object into a string so its easier to call
	 */
	public String toString()
	{
		if (hasPlayer==true)
		{
			//returns P1 to signify player 1 on the tile
			return " @ ";
		}
		if (isRevealed==false)
		{
			//returns ~ to show a tile that has yet to be revealed
			return " ~ ";
		}
		else if (isRevealed==true)
		{
			if (isWall==true)
			{
				//returns X to show a wall
				return " X ";
			}
			else
			{
				//returns O to show an open space
				return " O ";
			}
		}
		return null;
	}
	
	
}
