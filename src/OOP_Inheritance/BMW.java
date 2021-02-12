package OOP_Inheritance;

public class BMW extends Car {
	@Override
	public void start() {
		
		System.out.println("BMW Start");
	}
	
	public void autoParking() {
		
		System.out.println("Auto Parking");

	}
	public void musicSystem() {
		System.out.println("Music System");

		
	}
	
	public void musicSystem(String CD) {
		
		System.out.println("Music System with "+CD);

	}
	
	public void musicSystem(String Radio,double radioFrequency) {
		
		System.out.println("Music System "+Radio +radioFrequency);

	}
	
	
	
	
	
}
