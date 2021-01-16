package basis;

import java.util.ArrayList;

public class Car {

	private String ownerName;
	private String carType;
	private String color;
	private ArrayList<String> tickets;
	
	public Car(String ownerName, String carType, String color){
		this.ownerName = ownerName;
		this.carType = carType;
		this.color = color;
		tickets = new ArrayList<String>();
	}
	
	public void printCarInfo() {
		System.out.println("Owner Name: " + ownerName);
		System.out.println("CarType: " + carType + " Color: " + color);
		if(!tickets.isEmpty()){
			printAllOfTickets();
		}	
	}
	
	public boolean hasOpenTickets() {
		if(!tickets.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public void addTicket(String ticket) {
		tickets.add(ticket);
	}
	
	public void payTickets() {
		tickets.clear();
	}
	
	public void printAllOfTickets() {
		for(String ticket: tickets) {
			int i = 1;
			System.out.println("Ticket #" + i + ticket);
			i++;
		}
	}
}
