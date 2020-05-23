package practicepackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptUtil {
	public static void flash(WebDriver driver,WebElement element) throws InterruptedException {
		String bgcolour= element.getCssValue("backgroundColor");
		for(int i=0;i<500;i++) {
			changecolour("#000000",driver,element);
			changecolour(bgcolour,driver,element);

		}

	}

	public static void changecolour(String color,WebDriver driver,WebElement element) throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e)
		{

		}
	}

	public void borderround(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='5px solid red';",element);

	}


	public void clickbtn(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);

	}

	public String gettitle(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title=js.executeScript("return document.title;").toString();
		return title;	
	}
	public void generatealert(WebDriver driver,String message) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('"+message+"')");

	}

	public void scrolldowntargetelement(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);

	}


	public void scrolldown(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}


	public void refresh(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go()");

	}


	@Test
	public void javascrpittest() throws InterruptedException, IOException {
		System.setProperty( "webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement createpage=driver.findElement(By.xpath("//a[@class='_8esh']"));
		//flash(driver,regis);
		//borderround(driver,regis);		
		//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File trg=new File("C:\\logo\\screenshot.JPG");
		//FileUtils.copyFile(src, trg);		
		//clickbtn(driver,regis);
		//generatealert(driver,"Registration link is clicked");
		//driver.switchTo().alert().accept();
		//String title=gettitle(driver);
		//System.out.println(title);

		//scrolldowntargetelement(driver,createpage);
		scrolldown(driver);
		//refresh(driver);


	}
}
