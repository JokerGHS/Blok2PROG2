package Game;

import java.util.HashMap;

public class Board {

	HashMap<String, Square> board;
	String cels[][];

	Board(){
		board = new HashMap<String, Square>();
		cels = new String[][];
	}
}
