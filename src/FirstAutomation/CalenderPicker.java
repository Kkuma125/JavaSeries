package FirstAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CalenderPicker {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		driver.get("https://demoqa.com/date-picker");
		
		String date ="31-December-2020";
		
		String dateArr[] =date.split("-");
		
		String day =dateArr[0];
		String month = dateArr[1];
		String year	=dateArr[2];
		
			

		driver.findElement(By.id("datePickerMonthYearInput")).click();
		Thread.sleep(3000);
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")));
		
		select.selectByVisibleText(month);
		 
	
	
	
	}

}
