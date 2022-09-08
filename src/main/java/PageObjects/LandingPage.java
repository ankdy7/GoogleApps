package PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseTest;

public class LandingPage extends BaseTest {

	List<WebElement> appNames;

	@FindBy(xpath = "//a[@aria-label='Google apps']")
	WebElement nineDots;

	public LandingPage() {
		PageFactory.initElements(driver, this);
	}

	public void checkToolList() {
		nineDots.click();
		driver.switchTo().frame("app");
		appNames = driver.findElements(By.xpath("//span[@class='Rq5Gcb']"));
		for (int i = 1; i < appNames.size(); i++) {
			System.out.println(appNames.get(i).getText());
		}

	}

	public void openMeet() throws AWTException, InterruptedException {
		appNames.get(7).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@role='presentation']"))));
		
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
	}

}
