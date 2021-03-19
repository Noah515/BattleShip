package battleshipcode;

public class Board 
{
	public static Tiles[][] board = new Tiles [8][8];
	
	public static void setTile()
	{
		for (int x = 0; x < 8; x++)
		{
			for (int y = 0; y < 8; y++)
			{
				board[x][y].x = x;
				board[x][y].y = y;
				
			}
		}
	}
	
	public static void setShip(int x, int y)
	{
		board[x][y].hasShip = true;
	}

	public static void printEnemyBoard() 
	{
		for (int x = 0; x < 8; x++)
		{
			System.out.print("|");
			for (int y = 0; y < 8; y++)
			{
				System.out.print(board[x][y].hitTracker ? (board[x][y].hasShip ? "X" : "O") : " " + "|");
			}
			System.out.println();
		}
	}
	public static void printBoardSetup() 
	{
		for (int x = 0; x < 8; x++)
		{
			System.out.print("|");
			for (int y = 0; y < 8; y++)
			{
				System.out.print((board[x][y].hasShip ? "X" : "O") + "|");
			}
			System.out.println();
		}
	}
}




