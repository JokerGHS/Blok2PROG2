package Game;

public class Square {
	
	// . means empty
	// x means black
	// o means white
	
	private char status = '?';
	
	public Square(char s){
		setStatus(s);
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

}
