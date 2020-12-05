package Simple;

import java.util.Comparator;

public class FrequentieComperater implements Comparator<FoundIntNumber>  {

	@Override
	public int compare(FoundIntNumber arg0, FoundIntNumber arg1) {
		// TODO Auto-generated method stub
		if(arg0.getNrCounted() < arg1.getNrCounted())
			return 1;
		else if(arg0.getNrCounted() == arg1.getNrCounted())
			return 0;
		else
			return -1;
	}

}
