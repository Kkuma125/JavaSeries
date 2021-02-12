package FirstAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestionDropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		driver.switchTo().frame("iframe");
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='close']"))).click();
		
				
		
		WebElement From=driver.findElement(By.xpath("//input[@placeholder='From']"));
		From.sendKeys("Hyderabad");
		Thread.sleep(2000);	
		From.sendKeys(Keys.ARROW_DOWN);
		From.sendKeys(Keys.ENTER);
		WebElement To =driver.findElement(By.xpath("//input[@placeholder='To']"));
		From.sendKeys("Dubai");
		Thread.sleep(2000);	
		From.sendKeys(Keys.ARROW_DOWN);
		From.sendKeys(Keys.ENTER);
					
		}
		
	
}