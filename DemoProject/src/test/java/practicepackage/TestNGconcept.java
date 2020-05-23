package practicepackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGconcept {
	
	
	@BeforeSuite
	public void setsuite() {
		System.out.println("set suite");
			
		
	}
		
	@BeforeTest
	public void setbeforetest() {
		
	System.out.println("open browser");	
		
	}
		
	
	@BeforeClass
	public void setClass() {
		
		System.out.println("lunch browser");
	
	}
	@BeforeMethod
	public void setmethod() {
		System.out.println("login app");
	}
	
	
	
	 
	
	@Test
	public void loginTest() {
		
		System.out.println("login test");
	}
	
	@AfterMethod
	public void setaftermethod() {
	System.out.println("Logout app");	
		
	}	
		
	@AfterClass
	public void setafterclass() {
		
		System.out.println("close browser");
		
		
		
	}
	@AfterTest
	public void setaftertest() {
		System.out.println("delete cokkie");
	}
	@Test
	public void titleTest() {
		
		System.out.println("Title test");
	}
	

}
