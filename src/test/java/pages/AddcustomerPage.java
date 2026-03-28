package pages;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddcustomerPage {

WebDriver driver;
WebDriverWait wait;
public AddcustomerPage(WebDriver driver) {
	this.driver=driver;
	wait=new WebDriverWait(driver,Duration.ofSeconds(60));
	
}
public void addcustomer(String frstname,String lstname,String email,String txtarea,String number) throws InterruptedException {

	WebElement addcustmr=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add Customer")));
	addcustmr.click();

	
	WebElement fname=driver.findElement(By.xpath("//input[@id='fname']"));
	fname.sendKeys(frstname);
	WebElement lname=driver.findElement(By.xpath("//input[@name='lname']"));
	lname.sendKeys(lstname);
	WebElement mail=driver.findElement(By.xpath("//input[@id='email']"));
	mail.sendKeys(email);
	WebElement text=driver.findElement(By.xpath("//textarea[@id='message']"));
	text.sendKeys(txtarea);
	WebElement num=driver.findElement(By.xpath("//input[@id='telephoneno']"));
	num.sendKeys(number);
}

public void subtbtn() {
	
	
	WebElement btn=driver.findElement(By.xpath("//input[@name='submit']"));
	btn.click();
	WebElement successMsg = wait.until(ExpectedConditions.visibilityOfElementLocated( By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr[2]/td[1]")));
    Assert.assertTrue(successMsg.isDisplayed(), "Customer ID not generated!");
		}


public void home() {
	WebElement homectm=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button']")));
	homectm.click();
}
}
