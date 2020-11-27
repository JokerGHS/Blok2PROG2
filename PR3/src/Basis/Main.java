package Basis;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpaceAgency spaceX = new SpaceAgency("SpaceX");
		
		SpaceShips bird = new SpaceShips("The bird", "Mars");
		SpaceShips bob = new SpaceShips("Bob", "Moon");
		SpaceShips disc = new SpaceShips("The Disc", "Pluto");
		
		spaceX.addShip(bird);
		spaceX.addShip(bob);
		spaceX.addShip(disc);
		
		spaceX.showInfo();
	}

}
