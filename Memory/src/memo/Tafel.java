package memo;

public class Tafel {

	private int size;
	char[][] board;
	
	public Tafel(int size) {
		this.size = size;
		board = new char[size][size];
		drawBoard();
	}
	
	
	public void drawBoard(){
		for(int i = 0; i < size; i++) {
			for(int v = 0; v < size; v++) {
				System.out.println("+---+");
				System.out.println("| "+ board[i][v] + " |");
				System.out.println("+---+");
			}
		}
	}
}
