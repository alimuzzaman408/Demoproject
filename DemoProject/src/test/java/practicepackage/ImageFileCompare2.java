package practicepackage;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class ImageFileCompare2 {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		BufferedImage expectedimage=ImageIO.read(new File("C:\\logo\\HRmlogo1.JPG"));

		WebElement logoimage=driver.findElement(By.xpath("//div[@id='divLogo']//img"));

		Screenshot logoimagescreen=new AShot().takeScreenshot(driver,logoimage);
		BufferedImage actualimage=logoimagescreen.getImage();
		ImageDiffer imagediffer=new ImageDiffer();
		ImageDiff difimage=imagediffer.makeDiff(expectedimage, actualimage);
		if(difimage.hasDiff()==true) {

			System.out.println("Image are not same");

		}else {

			System.out.println("Image are same");



		}






	}

}
