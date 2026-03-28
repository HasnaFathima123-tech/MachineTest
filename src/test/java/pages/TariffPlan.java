package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TariffPlan {
	WebDriver driver;
	WebDriverWait wait;
	public TariffPlan(WebDriver driver) {
		this.driver=driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
}
	public void clk(String custmid ) throws InterruptedException {

		WebElement tariffplan=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add Tariff Plan to Customer")));
		tariffplan.click();
		WebElement cid=driver.findElement(By.xpath("//input[@id='customer_id']"));
		cid.sendKeys(custmid);
}
	public void tariffplnbtn() {
		
		
		WebElement planbtn=driver.findElement(By.xpath("//input[@name='submit']"));
		planbtn.click();
	    WebElement successElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3")));  // change based on page
	    Assert.assertTrue(successElement.isDisplayed(), "Action failed!");
			}

	public void approveplan() {
		WebElement  apprvbtn=driver.findElement(By.xpath("//input[@value='Add Tariff Plan to Customer']"));
		apprvbtn.click();
		WebElement home=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button']")));
		home.click();
	}
}
