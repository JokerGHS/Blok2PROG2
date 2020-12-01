package SimpleTwo;

import java.util.ArrayList;

public class LifeGuardStation {

	private String name;
	
	ArrayList<LifeGuard> guard = new ArrayList<LifeGuard>();
	
	
	public void addGuard(LifeGuard lF) {
		guard.add(lF);
	}
	
	
}
