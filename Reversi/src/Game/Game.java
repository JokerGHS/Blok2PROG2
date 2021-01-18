package Game;

import java.util.Scanner;

public class Game {
	
	//Content
	final int numOfPlayers = 2;
	private Player[] players;
	Scanner in = new Scanner(System.in); 	
	
	public Game() {
		players = new Player[2];
	}
	
	
	//Start of the game
	public void play() {
		
		System.out.println("Ready to play some Reversi");
		
		//ask for player 0 naam
		for(int i=0; i<2; i++) {
			
			System.out.println("Let's register the players.");
			System.out.println("Player number " + (i+1) + "Username: ");
			
			String name = in.nextLine();
			
			players[i].setName(name);
			
			if(i==0) {
				players[i].setStone('x');
			}
			else {
				players[i].setStone('o');
			}
		}
	}


	
	
	//returns a choosen player 0 zwart and 1 white
	public Player getPlayer(int index) {
		Player p = players[index];
		return p;
	}




}
