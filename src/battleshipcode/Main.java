package battleshipcode;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner( System.in );
		
		System.out.println("Player 1 please input your name: ");
		String p1Name = input.next();
		System.out.println("Hello " + p1Name);
		
		System.out.println("Player 2 please input your name: "); 
		String p2Name = input.next();
		System.out.println("Hello " + p2Name);

		Player player1 = new Player(p1Name);
		player1.boardSetup();
		
		Player player2 = new Player(p2Name);      
		player2.boardSetup();
		
		

	}

}
