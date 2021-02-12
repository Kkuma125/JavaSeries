package OOP_Enacapsulation;

public class UserTest {

	public static void main(String[] args) {

		Users user=new Users();
	  
		user.name="Tom";
		System.out.println(user.name);
		
		Users u1= new Users("Jerry",25,1000);
		System.out.println(u1.name+" "+u1.age+" "+u1.id);
		
		u1.setName("Tom");
		u1.setAge(25);
		u1.setId(11);
		System.out.println(u1.getName()+" "+u1.getId()+" "+u1.getAge());
		System.out.println(u1.name+" "+u1.age+""+u1.id);
		
		
		
	}

}
