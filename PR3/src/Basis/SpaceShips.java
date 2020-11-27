package Basis;

public class SpaceShips {

	private String name;
	private String distanciation;
	
	public SpaceShips(String name, String distanciation){
		this.name = name;
		this.distanciation = distanciation;
	}
	
	public String toString() {
		String info = "Name: " + name + "/n" + "Distanciation: " + distanciation;
		
		return info;
	}
}
