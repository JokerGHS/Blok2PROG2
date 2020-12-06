package Basis;

public class PhoneApp {

	private String name; 
	private int memorySize;
	private double version;
	
	public PhoneApp(String name, int memorySize, double version) {
		this.name = name;
		this.memorySize = memorySize;
		this.version = version;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getMemorySize() {
		return this.memorySize;
	}
	
	public void updateApp(double newVersion){
		this.version = newVersion;
	}
	public double getVersion() {
		return version;
	}
}
