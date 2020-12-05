package Basis;

import java.util.ArrayList;

public class AppMenu {

	ArrayList<PhoneApp> appAList = new ArrayList<PhoneApp>();
	
	public void addApp(PhoneApp app) {
		appAList.add(app);
	}
	
	public void removeApp(PhoneApp app) {
		appAList.remove(appAList.indexOf(app));
	}
	
	public void printAppMenu(){
		for(PhoneApp app: appAList) {
			System.out.println("App name : " + app.getName());
			System.out.println("App Memory Size : " + app.getMemorySize());
		}
	}
}
