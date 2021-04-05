package battleshipcode;

import java.util.Scanner;

public class Player 
{
	public static Board playerBoard = new Board();
	public static Board enemyBoard = new Board();
	public static String name;
	public static Ship carrier = new Ship("carrier", 5);
	public static Ship battleship = new Ship("battleship", 4);
	public static Ship cruiser = new Ship("cruiser", 3);
	public static Ship submarine = new Ship("sumbarine", 3);
	public static Ship destroyer = new Ship("destroyer", 2);
	public static Scanner input = new Scanner( System.in );
	
	public Player(String name) 
	{
		this.name = name;
	}

	public static void shipPlacement(Ship ship)
	{	
		boolean validInput = false;
		while (validInput == false)
		{
			playerBoard.printBoardSetup();
			System.out.println("You have chose to place your "  + ship.name + " Type the coordinates of where you would like to place the front of your ship. Please input your X");
			ship.coordinatesx = input.nextInt();
			//Setting X coord
			System.out.println("Please input your Y");
			ship.coordinatesy = input.nextInt();
			//Setting Y coord
			System.out.println("Please type 1 for Vertical or 2 for Horizontal");
			int orientation = input.nextInt();
			if (orientation == '1')
			//Setting orientation
			{
				ship.isVertical = true;
			}
			else if (orientation == '2')
			{
				ship.isVertical = false;
			}
			//Changing to isVertical to true or false based on input
			//TODO: Still need valid input checking
		
			if (orientation == 1)
			{
				if (ship.coordinatesy + ship.size > 8 || ship.coordinatesy < 0)
				{
					System.out.println("Please input a number that fits in the 8 by 8 grid");
				}
				else
				{
					validInput = true;
				}
					
			}
			else if (orientation == 2)
			{
				if (ship.coordinatesx < 0 || ship.coordinatesx + ship.size > 8)
				{
					System.out.println("Please input a number that fits in the 8 by 8 grid");
				}
				else
				{
					validInput = true;
				}
					
			}
			
		}
			//Checking if the ship fits on the board
		for(int i = 0; i < ship.size; i++)
		{
			if(ship.isVertical)
			{
				playerBoard.setShip(ship.coordinatesx, ship.coordinatesy + i);
			}
			else
			{
				playerBoard.setShip(ship.coordinatesx + i, ship.coordinatesy);
				
			}
			//If the ship fits on the board this will change orientation
		}
		
		
	}

	
	public static void boardSetup()
	{
		while(!carrier.isPlaced && !battleship.isPlaced && !cruiser.isPlaced && !submarine.isPlaced && !destroyer.isPlaced)
		{ 
			System.out.println("Which ship would you like to place first the (1) carrier,  (2) battleship, (3) cruiser, (4) submarine, or (5) destroyer?");
			Scanner input = new Scanner( System.in );
			int shipNum = input.nextInt();
			boolean validInput = false;
			switch(shipNum)
			//asking what ship to place
			{
				case 1:
					shipPlacement(carrier);
					break;
			
				case 2:
					shipPlacement(battleship);
					break;
				
				case 3:
					shipPlacement(cruiser);
					break;
				
				case 4:
					shipPlacement(submarine);
					break;
					
				case 5:
					shipPlacement(destroyer);
					break;
			//calling shipPlacement function for each ship to place the ship on board
				
				
			}
		}
	}
	




}


