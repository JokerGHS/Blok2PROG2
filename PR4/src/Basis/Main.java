package Basis;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int[] numberCollection = {1, 3, 4, 1, 5, 2, 3, 6, 6, 6, 4, 1, 2, 6, 2, 3, 1, 2, 1, 5, 5, 1, 1, 5, 4};
		ArrayList<FoundIntNumber> numberOccurrences = new ArrayList<FoundIntNumber>();
		
		for(int i : numberCollection) {
			if(!numberOccurrences.contains(i)) {
				FoundIntNumber Int = new FoundIntNumber(i);
			} 
		}
	}

}
