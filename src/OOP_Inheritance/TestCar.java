package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
			BMW b= new BMW();
			
			b.start();//overridden
			b.stop();//inherited
			b.refuel();//inherited
			b.autoParking();//child class
			b.wheels();
			System.out.println(b.engine);
			b.musicSystem();
			b.musicSystem("Hindi");
			b.musicSystem("London", 94.3);
			
			Car c= new Car();
			c.start();
			c.stop();
			c.refuel();
			c.wheels();
			System.out.println(c.engine);

			//Top Casting:
			Car c1=new BMW();//child class object cab be referred by parent class reference variable.
			c1.start();
			c1.stop();
			c1.refuel();
			
			//Down Casting is not allowed in Java.
			//BMW b1= (BMW) new Car();//ClassCastException will be thrown at Run time
			//Reference type check parent can not inherit from child ref
			
		
		
	}

}
