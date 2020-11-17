import java.util.Scanner;


public class Game {

	private Player[] players;
	private Board board;
	Scanner read = new  Scanner(System.in);
	
	public Game () {
		
		board = new Board();
		
	}
	
	//Data
	public void start(int aantal) {
		
		//Setting up the players 
		players = new Player[aantal];
		for(int i = 0; i < aantal; i++) {
			players[i] = new Player();
		}
		
		
	}
	
	
	
	//View
	public void drawSetup() {
	
		System.out.println("Welkom bij 4 op een rij!");
		for(int i = 0; i < players.length; i++) {
			System.out.println("Player " + i+1 + " : fill in your name:");
			String readName = read.nextLine();
			players[i].setName(readName);
		}
		
	}
	
	
}
