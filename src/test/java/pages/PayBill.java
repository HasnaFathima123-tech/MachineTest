package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PayBill {
	WebDriver driver;
	WebDriverWait wait;
	public PayBill(WebDriver driver) {
		this.driver=driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
}
	public void bill(String cstmid ) throws InterruptedException {

		WebElement paybill=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Pay Billing")));
		paybill.click();
		WebElement cid=driver.findElement(By.xpath("//input[@name='customer_id']"));
		cid.sendKeys(cstmid);
}
	public void paybill() {
		WebElement  paybtn=driver.findElement(By.xpath("//input[@name='submit']"));
		paybtn.click();
		
	    }
}

