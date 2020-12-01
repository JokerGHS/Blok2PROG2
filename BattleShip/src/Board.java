
public class Board {

	private int col = 10;
	private int row = 8;
	char[][] board;
	
	public Board() {
		board = new char[col][row];
	}
	
	public void draw(){
		
		for(int c = 0; c < col; c++) {
			
			for(int r = 0; r < row; r++) {
				System.out.println("["+ board[col][row] + "]");
			}
			System.out.println("\n");
		}
	}
	
	public void shoot(int row, int col) {
		board[col][row] = 'x';
	}
	
}
