package battleshipcode;

public class Board 
{
	public Tiles[][] board = new Tiles [8][8];
	
	public void setTile()
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
	
	public void setShip(int x, int y)
	{
		board[x][y].hasShip = true;
	}

	public void printEnemyBoard() 
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
	public void printBoardSetup() 
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




