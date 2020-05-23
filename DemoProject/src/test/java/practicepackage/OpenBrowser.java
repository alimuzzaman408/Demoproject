package practicepackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
	@Test
	public void open() {		
		System.setProperty("webdriver.chrome.driver", ".//Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();		
		
	}
	
	

}
