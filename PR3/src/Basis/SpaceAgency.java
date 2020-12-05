package Basis;

import java.util.ArrayList;

public class SpaceAgency {

	private String name; 
	ArrayList<SpaceShips> ships = new ArrayList<SpaceShips>();
	
	public SpaceAgency(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addShip(SpaceShips s) {
		ships.add(s);
	}
	
	public void showInfo () {
		for(SpaceShips s : ships) {
			System.out.println(s.getInfo());
		}
		System.out.println(ships.size());
	}

}
