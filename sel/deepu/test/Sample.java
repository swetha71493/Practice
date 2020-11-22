package sel.deepu.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample {

	private static final TimeUnit SECONDS = null;
	private static final Class NoSuchElementExcption = null;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Dev\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		By username = By.name("userName");
		By password = By.name("password");
		By submit = By.xpath("//input[@value='Login']");
		driver.findElement(username).sendKeys("mercury");
		driver.findElement(password).sendKeys("mercury");
		driver.findElement(submit).click();
		Thread.sleep(5000);
		Select passngers = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		List<WebElement> list = new ArrayList<WebElement>();
		list = passngers.getOptions();
		for (WebElement val : list) {
			String dropValues = val.getText();
			System.out.println("Dropdown values are " + dropValues);
		}
		passngers.selectByIndex(2);
		Select fromPort = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		fromPort.selectByValue("Frankfurt");

		Select fromMonth = new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
		fromMonth.selectByVisibleText("July");
		Select fromDay = new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
		fromDay.selectByVisibleText("14");

		Select toPort = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		toPort.selectByValue("New York");

		Select toMonth = new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
		toMonth.selectByVisibleText("July");
		Select toDay = new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
		toDay.selectByVisibleText("27");

		By preferences = By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input");
		driver.findElement(preferences).click();
		By nextBut = By.name("findFlights");
		driver.findElement(nextBut).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait we = new WebDriverWait(driver, 60);
		we.until(ExpectedConditions.titleContains("Select a Flight:"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Wait f = new FluentWait(driver).withTimeout(30, SECONDS).pollingEvery(5, SECONDS)
				.ignoring(NoSuchElementException.class);
		driver.switchTo().alert().accept();
		Robot robot = new Robot();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wwe=new WebDriverWait(driver,30);
		wwe.until(ExpectedConditions.presenceOfElementLocated(nextBut));
		Wait ns=new FluentWait(driver).withTimeout(20,SECONDS).pollingEvery(4,SECONDS).ignoring(NoSuchElementExcption);
		
		

	}

}
