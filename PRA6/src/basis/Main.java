package basis;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TrafficTicketSystem tts = new TrafficTicketSystem();
		tts.addTicket("HN-44-FF", "Door rood gereden");
		tts.addTicket("HN-44-FF", "32 KM per uur te hard in de bebouwde kom");
		tts.addTicket("TV-32-GG","Door rood gereden");
		tts.showTicket("HN-44-FF");
		tts.showTicket("TS-42-GH");
		tts.showAllTickets();
	}

}
