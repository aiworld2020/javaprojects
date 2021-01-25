 

import java.lang.Math;
import java.util.ArrayList;

/**
 * This class is a utility class for the Isolation Game.
 * This class also contains the strategy of the computer.
 * It provides the moves for the computer and provides methods for validating the player moves.
 * @author A. Agrawal
 * @version 1.0
 */
public class GameStrategy {
	
	private static String BLOCKED = "X";
	private static int[] myMoves_X = new int[25];
	private static int[] myMoves_Y = new int[25];
	
	
	//Board size, size of xCoords, player position x, player position y, 
	//obstacles position x array, obstacles position y array.
	/**
	 * Checks whether the user/computer is a valid move or not.
	 * Checks for north, south, east, west, northwest, northeast, southwest, and southeast.
	 * @param current_x The current x-coordinate of the player
	 * @param current_y The current y-coordinate of the player
	 * @param x The x-coordinate of where the player wants to go.
	 * @param y The y-coordinate of where the player wants to go.
	 * @param obstacles The location of obstacles located on the board.
	 * @return True or False if the move is valid(true) or not(false).
	 */
	public static boolean isValidMove(int current_x, int current_y, int x, int y, String[][] obstacles)
	{
		int r_dist = Math.abs(current_x - x);
		int c_dist = Math.abs(current_y - y);
		
		if (current_x == -1) 
		{
			return true;
		}
		
		
		//trying to move north
		if((x < current_x) && (y == current_y))
		{
			for (int i = 1; i <= r_dist; i++)
			{
				if(obstacles[current_x - i][current_y] != null && obstacles[current_x - i][current_y].equals(BLOCKED))
				{
					return false;
				}
			}
			return true; 
		}
		
		//trying to move South
		else if((x > current_x) && (y == current_y))
		{
			for (int i = 1; i <= r_dist; i++)
			{
				if(obstacles[current_x + i][current_y] != null && obstacles[current_x + i][current_y].equals(BLOCKED))
					{
						return false;
					}
				}
			return true; 
		}	
		
		//trying to move West
		else if((x == current_x) && (y < current_y))
		{
			for (int i = 1; i <= c_dist; i++)
			{
				if(obstacles[x][current_y - i] != null && obstacles[x][current_y - i].equals(BLOCKED))
					{
						return false;
					}
				}
			return true; 
		}	
		
		//trying to move East
		else if((x == current_x) && (y > current_y))
		{
			for (int i = 1; i <= c_dist; i++)
			{
				if(obstacles[x][current_y + i] != null && obstacles[x][current_y + i].equals(BLOCKED))
					{
						return false;
					}
				}
			return true; 
		}
		
		else if (r_dist == c_dist)
		{
			//trying to move North West
			if (x < current_x && y < current_y) 
			{
				for (int i = 1; i <= c_dist; i++) 
				{
					if(obstacles[current_x - i][current_y - i] != null && obstacles[current_x - i][current_y - i].equals(BLOCKED))
						return false;
				}
				return true; 
			} 
			
			//trying to move North East
			else if (x < current_x && y > current_y) 
			{
				for (int i = 1; i <= c_dist; i++) 
				{
					if(obstacles[current_x - i][current_y + i] != null && obstacles[current_x - i][current_y + i].equals(BLOCKED))
						return false;
				}
				return true; 
			} 
			
			//trying to move South East
			else if (x > current_x && y > current_y) 
			{
				for (int i = 1; i <= c_dist; i++) 
				{
					if(obstacles[current_x + i][current_y + i] != null && obstacles[current_x + i][current_y + i].equals(BLOCKED))
						return false;
				}
				return true; 
			} 
			
			

			//trying to move South West
			else if (x > current_x && y < current_y) 
			{
				for (int i = 1; i <= c_dist; i++) 
				{
					if(obstacles[current_x + i][current_y - i] != null && obstacles[current_x + i][current_y - i].equals(BLOCKED))
						return false;
				}
				return true; 
			} 
			
		}
		return false;
	}
	
	/**
	 * Gets the best move for Player 1(computer).
	 * The computer tries to stay in center of the board, but moves outside if it has to.
	 * @param current_x The current x-coordinate of where P1 is located
	 * @param current_y The current y-coordinate of where P1 is located
	 * @param obstacles The location of obstacles located on the board.
	 * @return An array of the x and y coordinates of where P1 should go, or returns null.
	 */
	public static int[] getMove(int current_x, int current_y, String[][] obstacles) {
		initializeMyMoves();	
		int count = 0;
		int[] move = new int[2];
		boolean hasMoves = false;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				if(!(obstacles[i][j] != null && obstacles[i][j].contentEquals(BLOCKED))){
					if(isValidMove(current_x, current_y, i, j, obstacles))
					{
						myMoves_X[count] = i;
						myMoves_Y[count++] = j;
						hasMoves = true;
					}
				}
				
				
			}

		}
				
		//This gives slightly better move than random
		if(hasMoves)
		{
			ArrayList<Integer> primaryMoves = new ArrayList<Integer>();
			ArrayList<Integer> secondaryMoves = new ArrayList<Integer>();
			int smartMove = -1;
			int temp = -1;
			for (int i = 0; i < count; i++)
			{
				if(myMoves_X[i] == 0 || myMoves_Y[i] == 0 || myMoves_X[i] == 4 || myMoves_Y[i] == 4)
				{
					secondaryMoves.add(Integer.valueOf(i));
				}
				else
				{
					primaryMoves.add(Integer.valueOf(i));
				}
			
			}
			if (!primaryMoves.isEmpty())
			{
			    
				smartMove = (int)(Math.random() * primaryMoves.size());
				temp = primaryMoves.get(smartMove);
				
			}
			else if(!secondaryMoves.isEmpty())
			{
				smartMove = (int)(Math.random() * secondaryMoves.size());
				temp = secondaryMoves.get(smartMove);
			}
			if (temp != -1)
			{
				move[0] = myMoves_X[temp];
				move[1] = myMoves_Y[temp];
				return move;
			}
		}
		return null;
	}
		
	/**	
	 * A method which initializes all the possible moves on game board to -1.
	 * It does this because -1, -1 isn't a position on the board.
	 */
	private static void initializeMyMoves() {
		
		for (int i = 0; i < 25; i++)
		{
			myMoves_X[i] = -1 ;
			myMoves_Y[i] = -1 ;
			
		}
		
	}
	
	/**
	 * Checks whether P2(the user) has at least 1 valid move or not.
	 * @param p2_x The current x-coordinate of where P2 is located
	 * @param p2_y The current y-coordinate of where P2 is located
	 * @param obstacles The location of obstacles located on the board.
	 * @return true or false if P2 does or doesn't have a valid move.
	 */
	public static boolean hasValidMoves(int p2_x, int p2_y, String[][] obstacles) {
		boolean hasMoves = false;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				if(!(obstacles[i][j] != null && obstacles[i][j].contentEquals(BLOCKED))){
					if(isValidMove(p2_x, p2_y, i, j, obstacles))
					{
						hasMoves = true;
						break;
					}
				}
				
				
			}
		}
		
		return hasMoves;
	}	
}