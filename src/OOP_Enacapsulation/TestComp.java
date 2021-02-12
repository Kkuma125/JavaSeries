package OOP_Enacapsulation;

public class TestComp {

	public static void main(String[] args) {
		
		Company c1= new Company();
		
		c1.name="F1";
		c1.EmpCount=100;
		c1.getCEOName();
		
		Employee e1= new Employee();
		e1.setSalary(1000);
		System.out.println(e1.getSalary());
		e1.setAddress("Dubai");
		System.out.println(e1.getAddress());
		
		
			
		
	}

}
