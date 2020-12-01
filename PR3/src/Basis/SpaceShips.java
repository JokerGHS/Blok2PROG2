package Basis;

public class SpaceShips {

	private String name;
	private String distanciation;
	
	public SpaceShips(String name, String distanciation){
		this.name = name;
		this.distanciation = distanciation;
	}
	
//	public void printInfo() {
//		System.out.println("Name: " + name);
//		System.out.println("Distanciation: " + distanciation);
//	}
//	
	public String getInfo() {
		String info = "Name: " + name + "\n" + "Distanciation: " + distanciation + "\n";
		
		return info;
	}
}
