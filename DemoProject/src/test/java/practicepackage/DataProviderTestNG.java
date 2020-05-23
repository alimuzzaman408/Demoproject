package practicepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderTestNG {
	
	
	
	@Test
	@Parameters({"url","username","password"})
	
	public void dataprovidetest(String url ,String username,String password) {
		
		System.setProperty( "webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
