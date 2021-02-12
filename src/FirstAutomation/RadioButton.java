package FirstAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RadioButton {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions Options =new ChromeOptions();
		Options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver =new ChromeDriver();	
		driver.manage().window().maximize();	
		driver.manage().deleteAllCookies();
		driver.manage().getCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);		
		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");		
		WebElement Scroll=driver.findElement(By.xpath("//button[@class='btn-primary full--btn']"));
		Actions action =new Actions(driver);
		action.moveToElement(Scroll);		
		WebElement radio1=driver.findElement(By.name("book-flight-radio"));
		System.out.println("Radio Button Not Selected "+radio1.isSelected());
		WebElement radio2=driver.findElement(By.id("redeemFlights"));
		Thread.sleep(2000);
		radio2.click(); 
		System.out.println("Radio Button is Selected "+radio2.isSelected());
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
