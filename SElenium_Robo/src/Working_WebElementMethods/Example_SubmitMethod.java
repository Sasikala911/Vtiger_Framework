package Working_WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_SubmitMethod {
	public static void main(String[] args) throws InterruptedException {
	     WebDriver driver =new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.google.com/");
	     Thread.sleep(2000);
	     driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[@class='lJ9FBc']//input[@value='Google Search']")).submit();
	     Thread.sleep(2000);
	     driver.close();
	     
	     
	     
}
}