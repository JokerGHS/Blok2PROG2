package Basis;

import java.util.ArrayList;

public class AppMenu {

	ArrayList<PhoneApp> appAList = new ArrayList<PhoneApp>();
	
	public void addApp(PhoneApp app) {
		boolean foundApp = false;
		
		for(PhoneApp currentApp : appAList) {
			
			if(currentApp.getName().equals(app.getName())) {
				
				foundApp = true;
				
				if(currentApp.getVersion() < app.getVersion()) {
					removeApp(currentApp);
					appAList.add(app);
					System.out.println("The app is be installed!");
				}			
				
				else {
					System.out.println("Current app has the newest version!");
				}
				break;
			}
		}
		if(!foundApp) {
			appAList.add(app);
		}
	}
	
	public void removeApp(PhoneApp app) {
		appAList.remove(appAList.indexOf(app));
	}
	
	public void printAppMenu(){
		for(PhoneApp app: appAList) {
			System.out.println("-----------------------------------------");
			System.out.println("App name : " + app.getName());
			System.out.println("App Memory Size : " + app.getMemorySize());
			System.out.println("-----------------------------------------");
		}
	}
}
