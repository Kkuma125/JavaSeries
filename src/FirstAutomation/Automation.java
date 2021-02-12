package FirstAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Automation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java");
		
		Thread.sleep(2000);
		
		List<WebElement> list =driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		
		 System.out.println("Total Number Of List in search box:====>"+list.size());
		 
		 
			 for(int i=0; i<list.size();i++){
				 
				 System.out.println(list.get(i).getText());
				 Thread.sleep(3000);
			 
				 if(list.get(i).getText().contains("java download")){
					 
					 
					list.get(i).click();
					 
				 break;
				 
				 
				 }	
				 
		 	}
		
	}	
	 
	}
	
				 
	 
		
	
