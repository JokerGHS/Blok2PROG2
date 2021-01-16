package basis;

import java.util.HashMap;

public class TrafficTicketSystemSupme {

	HashMap<String, Car> carTickets;
	
	public TrafficTicketSystemSupme() {
		carTickets = new HashMap<String, Car>();
	}
	
	
	public void addCar(String numberPlate, Car car){
		carTickets.put(numberPlate, car);
	}

	//Alle bekeuringen op de meegegeven nummerplaat worden betaald. 
	//Verwijder de nummerplaat uit het systeem.
	public void payTicket (String numberPlate) {
		carTickets.get(numberPlate).payTickets();
	}
	
	//Druk in de console alle kentekens met hun bekeuringen af.
	public void showAllTickets(String numberPlate){
		
		if(carTickets.get(numberPlate).hasOpenTickets()) {
			carTickets.get(numberPlate).printAllOfTickets();
		}
		
	}
}
