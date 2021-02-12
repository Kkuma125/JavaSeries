package FirstAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		
		String month="February 2021";
		
		String Day = "15";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.makemytrip.com/flights/");
		
		//JavascriptExecutor js=  ((JavascriptExecutor) driver);
		
		//js.executeScript("window.scrollBy(0,250)");
		
		driver.findElement(By.xpath("//input[@type='text'][contains(@data-cy,'fromCity')]")).sendKeys("Hyderabad");
		
		Select select= new Select(driver.findElement(By.xpath("//input[@type='text'][contains(@data-cy,'fromCity')]")));
		
		select.selectByValue("Hyderabad");

		
		Select select1 = new Select(driver.findElement(By.xpath("//input[@type='text'][contains(@data-cy,'toCity')]")));
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
		Thread.sleep(3000);
		
		String flag= "False";
		
		while(flag=="False"){
			
			
			if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Feb 10 2021')]")).size()>0){
				
			driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Feb 10 2021')]")).click();	
			flag="True";
			 
			}
			else {
				
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[contains(@aria-label,'Next Month')]")).click();
			
			System.out.println("Test Case is Passed");
			
			
			
			}
			
		} 
	}
	
}


	