package practicepackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGconcept {
/*
 set suite //Before suite
 open browser //Before Test
lunch browser  //Before Class

login APP  //before method
Title test  //Test
Logout app  //After Method

login APP  //before method
login test  //Test
Logout app  //After Method

close browser //After class
delete cokkie  //After Test
 */
	@BeforeSuite//1
	public void setsuite() {
		System.out.println("set suite");		
	}		
	@BeforeTest//2
	public void setbeforetest() {	
		System.out.println("open browser");			
	}	
	@BeforeClass//3
	public void setClass() {	
		System.out.println("lunch browser");
	}
	@BeforeMethod//4//7
	public void setmethod() {
		System.out.println("login APP");
	}	
	@Test//5
	public void loginTest() {	
		System.out.println("Title test");
	}
	
	@Test//8
	public void titleTest() {	
		System.out.println("login test");
	}
	@AfterMethod//6//9
	public void setaftermethod() {
		System.out.println("Logout app");		
	}		
	@AfterClass//10
	public void setafterclass() {
		System.out.println("close browser");	
	}
	@AfterTest//11
	public void setaftertest() {
		System.out.println("delete cokkie");
	}
	@AfterSuite
	public void After_suite() {
		System.out.println("set suite");		
	}
}
