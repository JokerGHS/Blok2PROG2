package slides5;
import java.util.ArrayList;

public class FishTank
{
	private ArrayList<Fish> fishTank;

	public FishTank() {
		fishTank = new ArrayList<Fish>();
	}

	public void addFishy() {
		fishTank = new ArrayList<Fish>();
		fishTank.add(new Fish("Bluppy"));
		fishTank.add(new Fish("Wanda"));
	}

	public void letFishiesSwim() {
		for (Fish f : fishTank) {
			f.swimAround();
		}
	}
}
















