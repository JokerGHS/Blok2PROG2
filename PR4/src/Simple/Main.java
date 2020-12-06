package Simple;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int[] numberCollection = {1, 3, 4, 1, 5, 2, 3, 6, 6, 6, 4, 1, 2, 6, 2, 3, 1, 2, 1, 5, 5, 1, 1, 5, 4};
		ArrayList<FoundIntNumber> numberOccurrences = new ArrayList<FoundIntNumber>();
		
		for(int i = 0; i < numberCollection.length; i++) {
			
			int currentNumber = numberCollection[i];
			
			boolean found = false;
			
			for(FoundIntNumber fin : numberOccurrences){
				if (fin.getValue() == currentNumber)
				{
					fin.increaseNrCounted();
					found = true;
				}
			}
			if (found == false)
			{	// If not found: Add to ArrayList:
				numberOccurrences.add(new FoundIntNumber(currentNumber));
			}
		}
		
		numberOccurrences.sort(new FrequentieComperater());		
		
		System.out.println("The most frequent element is " + 
			numberOccurrences.get(0).getValue() + ". It occurs " +  
					numberOccurrences.get(0).getNrCounted() + " times.");
	}
}
