
public class Planet {

	private String name;
	private float weight;
	private float distanceFromSun;
	private boolean liveable;
	private int amountsOfMoons;
	
	public Planet (String name, float weight, float distanceFromSun) {
		this.name = name;
		this.weight = weight;
		this.distanceFromSun = distanceFromSun;
	}

	public int getAmountsOfMoons() {
		return amountsOfMoons;
	}

	public void setAmountsOfMoons(int amountsOfMoons) {
		this.amountsOfMoons = amountsOfMoons;
	}

	public boolean isLiveable() {
		return liveable;
	}

	public void setLiveable(boolean liveable) {
		this.liveable = liveable;
	}
	
	
}
