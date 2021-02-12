package OOP_Enacapsulation;

public class WebDriverTool {
	
	public void launchBrowser(String browser) {
		
		if(browser.equals("chrome")) {
			
			launchChrome();			
			
		}
		
		else if(browser.equals("firefox")) {
			
			launchFirefox();					
		}
		else {
			
			System.out.println("please pass the correct browser");
			
			
		}
		
		
	}
	
	private void launchChrome() {
		
		System.out.println("checking OS Version");
		System.out.println("checking chrome Version");
		System.out.println("launch Chrome");
				
	}
		
	private void launchFirefox() {
		
		System.out.println("checking OS Version");
		System.out.println("checking firefox Version");
		System.out.println("launch firefox");
		
	
	}	
		
		

}
