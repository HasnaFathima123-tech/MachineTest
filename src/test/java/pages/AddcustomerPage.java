package pages;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddcustomerPage {

WebDriver driver;
WebDriverWait wait;
public AddcustomerPage(WebDriver driver) {
	this.driver=driver;
	wait=new WebDriverWait(driver,Duration.ofSeconds(60));
	
}
public void login(String frstname,String lstname,String email,String txtarea,String number) throws InterruptedException {
//	WebElement menubtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/nav")));
//	menubtn.click();
	WebElement addcustmr=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add Customer")));
	addcustmr.click();
//	WebElement clkdone=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='done']")));
//	clkdone.click();
	
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
//	WebElement homectm=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Home")));
//	homectm.click();
}
public void home() {
	WebElement homectm=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button']")));
	homectm.click();
}
}
