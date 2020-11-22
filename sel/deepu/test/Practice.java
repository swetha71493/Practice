package sel.deepu.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Dev\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		By nameField = By.xpath("//*[@id='yDmH0d']");
		By nextField = By.xpath("//*[@id='identifierNext']/content");
		// driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("swetha1254.it@gmail.com");
		Thread.sleep(5000);
		// driver.findElement(nameField).click();
		driver.findElement(By.xpath("//*[@id='yDmH0d']")).sendKeys("swetha1254.it");
		driver.findElement(nextField).click();
		// Thread.sleep(5000);
		// driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Swetha1254");
		// driver.quit();
	}
}
