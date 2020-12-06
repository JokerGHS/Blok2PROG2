package Basis;

public class Main {

	public static void main(String[] args) {

		AppMenu menu = new AppMenu();
		
		menu.addApp(new PhoneApp("SnapChat", 9, 1.0));
		menu.addApp(new PhoneApp("Insta", 9, 1.0));
		menu.addApp(new PhoneApp("SnapChat", 10, 2.0));
		menu.printAppMenu();
	}

}
