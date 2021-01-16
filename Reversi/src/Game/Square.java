package Game;

public class Square {
	
	// . means empty
	// x means black
	// o means white
	
	private char status = '.';
	
	Square(){
		setStatus('.');
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

}
