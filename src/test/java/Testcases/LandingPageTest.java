package Testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseTest;
import PageObjects.LandingPage;

public class LandingPageTest extends BaseTest{

	LandingPage landingpage;
	public LandingPageTest(){
		super();
	}
	
	@BeforeTest
	void startUp() {
		setup();
		landingpage = new LandingPage();
	}
	
	@AfterTest
	void tearDown() {
		driver.quit();
	}
	
	@Test(priority=0)
	void checkToolListTest() {
		landingpage.checkToolList();
	}
	
	@Test(priority=1)
	void openAppsTest() throws AWTException, InterruptedException {
		landingpage.openMeet();
	}
}
