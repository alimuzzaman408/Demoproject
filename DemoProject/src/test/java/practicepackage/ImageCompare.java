package practicepackage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
public class ImageCompare {


	public static void main(String[] args) throws IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement logoimage=driver.findElement(By.xpath("//div[@id='divLogo']//img"));

		Screenshot logoimagescreen=new AShot().takeScreenshot(driver,logoimage);
		ImageIO.write(logoimagescreen.getImage(),"png",new File("C:\\logo\\orangeHRmlogo.png"));

		File f=new File("C:\\logo\\orangeHRmlogo.png");
		if(f.exists()){
			
			System.out.println("Image file captured");
			
			
			
		}else {
			
			System.out.println("Image file not captured");
			
		}




		driver.quit();

	}

}
