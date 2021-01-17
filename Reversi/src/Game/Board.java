package Game;

import java.util.HashMap;

public class Board {
	//content
	private HashMap<String, Square> board;
	
	
	public Board(){
		board = new HashMap<String, Square>();
		//Using char as an counter so i can use it as an key
		//when it is combined with the int counter
		for(char x='a'; x < 'i'; x++){
			
			for(int y=0; y<8; y++) {
			//the combination of the first and second counter becomes the key
			String cell= x + String.valueOf(y);
			board.put(cell, new Square());
			}
		}
	
	}
	
	public void print() {
		
	}
	
}
