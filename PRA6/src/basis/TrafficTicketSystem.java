package basis;

import java.util.HashMap;

public class TrafficTicketSystem {

	 HashMap<String, String> carTickets;
	
	public TrafficTicketSystem() {
		carTickets = new HashMap<String, String>();
	}
	
	public void addTicket (String numberPlate, String description){
		 if(carTickets.containsKey(numberPlate)) {
			 String updating = carTickets.get(numberPlate) + " , " + description;
			 carTickets.put(numberPlate, updating);
		 }
		 
		 if(!carTickets.containsKey(numberPlate)) {
			 carTickets.put(numberPlate, description);
		 }
	
	}
	
	public void showTicket (String numberPlate) {
		if(carTickets.containsKey(numberPlate)){
			System.out.println("Ticket Beschrijving: " + carTickets.get(numberPlate));
		}
		if(!carTickets.containsKey(numberPlate)) {
			System.out.println("Deze auto heeft geen bekeuring.");
		}
	}
	//Alle bekeuringen op de meegegeven nummerplaat worden betaald. 
	//Verwijder de nummerplaat uit het systeem.
	public void payTicket (String numberPlate) {
		carTickets.remove(numberPlate);
	}
	//Druk in de console alle kentekens met hun bekeuringen af.
	public void showAllTickets(){
		 for(String name: carTickets.keySet()) {
			 String key = name.toString();
			 String value = carTickets.get(key);
			 System.out.println("Plate Number :" + key);
			 System.out.println("Ticket Describition :" + value);
			 System.out.println("-------------------");
		 }
	}
	
}
