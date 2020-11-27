import java.util.ArrayList;

public class MainPlanet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Planet> planets = new ArrayList<Planet>();
		
		Planet earth = new Planet("Earth",100.9f,880);
		earth.setAmountsOfMoons(9);
		earth.setLiveable(true);
		
		planets.add(earth);
	
		
	}

}
