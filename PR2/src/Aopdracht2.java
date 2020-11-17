
public class Aopdracht2 {

	public static void main(String[] args) {
		// PR2A opdracht 2
		
		String[] studenten;
		studenten = new String[10];
		
		studenten[0] = "Jacco";
		studenten[1] = "Timo";
		studenten[2] = "Thijs";
		studenten[3] = "Somu";
		studenten[4] = "Viktor";
		studenten[5] = "Niko";
		studenten[6] = "Thomas";
		studenten[7] = "Saron";
		studenten[8] = "Rachid";
		studenten[9] = "Rick";
		
		//Enhanced for loop
		for(String name : studenten) {
			System.out.println(name);
		}
	}
}
