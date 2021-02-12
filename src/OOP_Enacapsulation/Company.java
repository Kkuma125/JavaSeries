package OOP_Enacapsulation;

public class Company {
	public String name;
	public int EmpCount;
	private int sharePrice;
		
	
	public String getCEOName() {
		return"Tom";
			
	}
	private int totalSharePrice(){
		return 1000;		
		
	}
			
	public static void main(String[] args) {
		
		Company Co= new Company();
		
		Co.name="IBM";
		Co.EmpCount=5000;
		Co.sharePrice=4000;
		Co.getCEOName();
		Co.totalSharePrice();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
