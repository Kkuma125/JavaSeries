package FirstAutomation;

import javax.swing.event.SwingPropertyChangeSupport;


public class JavaSessions {

	public static void main(String[] args) {

	int i=0;
	while(i<=10) {
		
		System.out.println(i);
		i=i+1;
	}	
		
	for(i=1;i<=11;i++) {
		
		System.out.println(i);
		
	}
		
	for(double d1=1.0;d1<=10;d1++){
		
		System.out.println(d1);
		
	boolean flag=false;
		
	while(flag=true) {
		System.out.println("Hi");
		
		
		int marks[]=new int[5];
		
		marks[0]=100;
		marks[1]=200;
		marks[2]=300;
		marks[3]=400;
		marks[4]=500;
		
		for(int a=0;a<5;a++) {
			System.out.println(marks[a]);
		}	
			
			
		String browser="Opera";
		
		if(browser.equals("chrome")) {
			System.out.println("Launch Chrome Browser");
			
		}
		else if(browser.equals("firefox")) {
			System.out.println("Launch Chrome firefox");
		}	
		
		else if(browser.equals("Opera")) {
			System.out.println("Launch Chrome Opera");
			
			
		}
		else {
			
			System.out.println("Pass the Correct Browser");
			
		}
			
		
			
		switch (browser){
		case "firefox":
			
			System.out.println("Launch firefox");
			break;
		
			
		case "chrome":
			
			System.out.println("Launch chrome");
				
			break;
		
		
		default:
			
			System.out.println("Please Pass Correct Browser "+browser);
			break;
			
		
		}
		
		
	}
	
	}
	
	}
}
	
	

		
		




