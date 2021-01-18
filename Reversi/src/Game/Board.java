package Game;

import java.util.HashMap;

public class Board {
	//content
	final int verticalCheck=8;
	final int horizontalCheck=1;
	final int diagonalRightCheck=7;
	final int diagonalLeftCheck=9;
	final int size = 64;
	private HashMap<String, Square> board;
	private String[] cell = new String[size];
	
	
	
	
	public Board(){
		board = new HashMap<String, Square>();
		int i = 0;
		
		//Using char as an counter so i can use it as an key
		//when it is combined with the int counter
		
		for(char x='a'; x < 'i'; x++){
			for(int y=1; y<9; y++) {
			//the combination of the first and second counter becomes the key
				if(i < size) {
					cell[i] = x + String.valueOf(y);
				}
				board.put(cell[i], new Square('.'));
				i++;
			}
		}
		
	}
	
	////////////////////////////////////////////
	///////////getters///////////////////
	//////////////////////////////////////////
	public String[] getCell() {
		return cell;
	}
	
	public HashMap<String, Square> getBoard(){
		return board;
	}
	

	public void print() {
		int index = 0 ;
		
		System.out.println("+--------------+");
		System.out.println("|   abcdefgh   |");
		//With this for loop i am printing the board 
		for(int x = 1; x < 9; x++) {
			System.out.print("| "+ x + " ");
			for(int y=1; y < 9; y++) {
				System.out.print(board.get(cell[index]).getStatus());				
				
				if(y == 8) {
					System.out.print(" "+ x + " |");
					System.out.println();
				}
				index++;
			}
		}
		System.out.println("|   abcdefgh   |");
		System.out.println("+--------------+");
	}
	
	public int move(String coord, Player player) {
		//checking if coord of the player is correct 
		if(isCoordValid(coord, player) > 0) {
			
			int index = isCoordValid(coord, player);
			int steps;
			
			if(checkUp(index, player) != -1) {
				steps= checkUp(index, player);
				
				for(int i=0;steps != i; steps--) {
					
					board.replace(cell[index], new Square(player.getStone()));
					index=-verticalCheck;
					
				}
				return 1;
			}
			
			if(checkDown(index, player) != -1) {
				steps= checkDown(index, player);
				
				for(int i=0;steps != i; steps--) {
					
					board.replace(cell[index], new Square(player.getStone()));
					index=+verticalCheck;
		
				}
				return 1;
			}
			
			if(checkRight(index, player) != -1) {
				steps = checkRight(index,player);
				
				for(int i=0;steps != i; steps--) {
					
					board.replace(cell[index], new Square(player.getStone()));
					index=+horizontalCheck;
		
				}
				return 1;
			}
			
			if(checkLeft(index, player) != -1) {
				steps = checkLeft(index, player);
				
				for(int i=0;steps != i; steps--) {
					
					board.replace(cell[index], new Square(player.getStone()));
					index=-horizontalCheck;
					
				}
				return 1;
			}
			
			if(checkNorthEast(index,player) != -1) {
				steps = checkNorthEast(index,player);
				
				for(int i=0;steps != i; steps--) {
					
					board.replace(cell[index], new Square(player.getStone()));
					index=-diagonalRightCheck;
					
				}
				return 1;
			}
			if(checkNorthWest(index,player) != -1) {
				steps = checkNorthWest(index,player);
				
				for(int i=0;steps != i; steps--) {
					
					board.replace(cell[index], new Square(player.getStone()));
					index=-diagonalRightCheck;
					
				}
				return 1;
			}
			
			if(checkSouthEast(index,player) != -1) {
				steps = checkSouthEast(index,player);
				for(int i=0;steps != i; steps--) {
					
					board.replace(cell[index], new Square(player.getStone()));
					index=-diagonalLeftCheck;
					
				}
				return 1;
			}
			
			if(checkSouthWest(index,player) != -1) {
				steps = checkSouthWest(index,player);
				
				for(int i=0;steps != i; steps--) {
					board.replace(cell[index], new Square(player.getStone()));
					index=+diagonalLeftCheck;
					
				}
				return 1;
			}
			//not valid  move 
			return 0;
		}
		
		//the player thinks he doesnt have a valid move
		if(isCoordValid(coord,player) == 0) {
			return 2;
		}
		
		
		return -1;
	}
	
	
	
	////////////////////////////////////////////
	///////////Check Methods///////////////////
	//////////////////////////////////////////
	
	
	private int isCoordValid(String coord, Player player) {
		int index=0;
		while(index <= cell.length) {
			if(cell[index] == coord) {
				//check if the coordination of move is not the same of stone as the player who is doing the move or if the coordination is not empty
				if(board.get(cell[index]).getStatus() == player.getStone() || board.get(cell[index]).getStatus() != '.') {
					break;
				}
				return index;
			}
			if(coord.equals("pass")) {
				return 0;
			}
			index++;
		}
		return -1;
	}
	
	//Check if the going up is possible 
	private int checkUp(int index, Player player) {
		
		int nextUp = index-verticalCheck;
		int counter = 0;
		
		while(nextUp > 0) {
			if(board.get(cell[nextUp]).getStatus() == '.') {
				return -1;
			}
			if(board.get(cell[nextUp]).getStatus() == player.getStone() && (index-verticalCheck) == nextUp) {
				return -1;
			}
			if( (nextUp-verticalCheck) < 0) {
				return -1;
			}
			if(board.get(cell[nextUp]).getStatus() != player.getStone()) {
				counter++;
				if(board.get(cell[(nextUp-verticalCheck)]).getStatus() == player.getStone()){
					break;
				}
			}
			nextUp=-verticalCheck;
			
		}
		
		return counter;
	}
	
	//Check if the going down is possible 
	private int checkDown(int index,Player player) {
		int nextDown = index+verticalCheck;
		int counter = 0;
		
		while(nextDown > 63) {
			if(board.get(cell[nextDown]).getStatus() == '.') {
				return -1;
			}
			if(board.get(cell[nextDown]).getStatus() == player.getStone() && (index+verticalCheck) == nextDown) {
				return -1;
			}
			if( (nextDown+verticalCheck) < 63) {
				return -1;
			}
			if(board.get(cell[nextDown]).getStatus() != player.getStone()) {
				counter++;
				if(board.get(cell[(nextDown+verticalCheck)]).getStatus() == player.getStone()){
					break;
				}
			}
			nextDown=+verticalCheck;
			
		}
		
		return counter;
	}
	//checks which row we are
	private char checkRow(int i) {
		char currentRow = cell[i].charAt(1);	
		return currentRow;
	}
	
	//checks if right is possible
	private int checkRight(int index,Player player) {
		int nextRight = index+horizontalCheck;
		char Row = checkRow(index);
		int counter = 0;
		
		while(Row == checkRow(nextRight)) {
			if(board.get(cell[nextRight]).getStatus() == '.') {
				return -1;
			}
			if(board.get(cell[nextRight]).getStatus() == player.getStone() && (index+horizontalCheck) == nextRight) {
				return -1;
			}
			if(Row != checkRow(nextRight)) {
				return -1;
			}
			if(board.get(cell[nextRight]).getStatus() != player.getStone()) {
				counter++;
				if(board.get(cell[(nextRight+horizontalCheck)]).getStatus() == player.getStone()){
					break;
				}
			}
			nextRight=+horizontalCheck;
			
		}

		return counter;
	}
	private int checkLeft(int index,Player player) {
		int nextLeft = index-horizontalCheck;
		char Row = checkRow(index);
		int counter = 0;
		
		while(Row == checkRow(nextLeft)) {
			if(board.get(cell[nextLeft]).getStatus() == '.') {
				return -1;
			}
			if(board.get(cell[nextLeft]).getStatus() == player.getStone() && (index-horizontalCheck) == nextLeft) {
				return -1;
			}
			if(Row != checkRow(nextLeft)) {
				return -1;
			}
			if(board.get(cell[nextLeft]).getStatus() != player.getStone()) {
				counter++;
				if(board.get(cell[(nextLeft-horizontalCheck)]).getStatus() == player.getStone()) {
					break;
				}
			}
			nextLeft=-horizontalCheck;
			
		}
		return counter;
	}
	private char checkCol(int i) {
		char currentCol = cell[i].charAt(0);
		return currentCol;
	}
	
	private int checkNorthEast(int index,Player player) {
		int nextNE = index-diagonalRightCheck;
		char row = checkRow(nextNE);
		char col = checkCol(nextNE);
		int counter = 0;
		
		while(row != '0' || col != 'h') {
			if(board.get(cell[nextNE]).getStatus() == '.') {
				return -1;
			}
			if(board.get(cell[nextNE]).getStatus() == player.getStone() && (index-diagonalRightCheck) == nextNE) {
				return -1;
			}
			if(row == '0' || col == 'h') {
				return -1;
			}
			if(board.get(cell[nextNE]).getStatus() != player.getStone()) {
				counter++;
				if(board.get(cell[(nextNE-diagonalRightCheck)]).getStatus() == player.getStone()) {
					break;
				}
			}
			nextNE=-diagonalRightCheck;
			
		}
		return counter;
	}
	private int checkSouthWest(int index,Player player) {
		int nextSW = index+diagonalRightCheck;
		char row = checkRow(nextSW);
		char col = checkCol(nextSW);
		int counter = 0;
		
		while(row != '7' || col != 'a') {
			if(board.get(cell[nextSW]).getStatus() == '.') {
				return -1;
			}
			if(board.get(cell[nextSW]).getStatus() == player.getStone() && (index+diagonalRightCheck) == nextSW) {
				return -1;
			}
			if(row == '7' || col == 'a') {
				return -1;
			}
			if(board.get(cell[nextSW]).getStatus() != player.getStone()) {
				counter++;
				if(board.get(cell[(nextSW+diagonalRightCheck)]).getStatus() == player.getStone()) {
					break;
				}
			}
			nextSW=+diagonalRightCheck;
			
		}
		return counter; 
	}
	private int checkNorthWest(int index,Player player) {
		int nextNW= index-diagonalLeftCheck;
		char row = checkRow(nextNW);
		char col = checkCol(nextNW);
		int counter = 0;
		
		while(row != '0' || col != 'a') {
			if(board.get(cell[nextNW]).getStatus() == '.') {
				return -1;
			}
			if(board.get(cell[nextNW]).getStatus() == player.getStone() && (index-diagonalLeftCheck) == nextNW) {
				return -1;
			}
			if(row == '0' || col == 'a') {
				return -1;
			}
			if(board.get(cell[nextNW]).getStatus() != player.getStone()) {
				counter++;
				if(board.get(cell[(nextNW-diagonalLeftCheck)]).getStatus() == player.getStone()) {
					break;
				}
			}
			nextNW=-diagonalLeftCheck;
			
		}
		return counter; 
	}
	private int checkSouthEast(int index,Player player) {
		int nextSE= index+diagonalLeftCheck;
		char row = checkRow(nextSE);
		char col = checkCol(nextSE);
		int counter = 0;
		
		while(row != '7' || col != 'h') {
			if(board.get(cell[nextSE]).getStatus() == '.') {
				return -1;
			}
			if(board.get(cell[nextSE]).getStatus() == player.getStone() && (index+diagonalLeftCheck) == nextSE) {
				return -1;
			}
			if(row == '7' || col == 'h') {
				return -1;
			}
			if(board.get(cell[nextSE]).getStatus() != player.getStone()) {
				counter++;
				if(board.get(cell[(nextSE+diagonalLeftCheck)]).getStatus() == player.getStone()) {
					break;
				}
			}
			nextSE=+diagonalLeftCheck;
			
		}
		return counter; 
	}
	
}
