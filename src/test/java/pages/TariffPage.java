package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TariffPage {
	WebDriver driver;
	WebDriverWait wait;
	public TariffPage(WebDriver driver) {
		this.driver=driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
}
	public void clk(String rental,String localmin,String interlmnt,String smspck,String lclchrg,String intrchrg,String schrg) throws InterruptedException {
//		WebElement menubtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/nav")));
//		menubtn.click();
		WebElement addtariff=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add Tariff Plan")));
		addtariff.click();
	    WebElement rntl=driver.findElement(By.xpath("//input[@id='rental1']"));
		rntl.sendKeys(rental);
		 WebElement lclmin=driver.findElement(By.xpath("//input[@name='local_minutes']"));
		lclmin.sendKeys(localmin);
		WebElement intrelmnt=driver.findElement(By.xpath("//input[@name='inter_minutes']"));
		intrelmnt.sendKeys(interlmnt);
		WebElement sms=driver.findElement(By.xpath("//input[@name='sms_pack']"));
		sms.sendKeys(smspck);
		WebElement chrg=driver.findElement(By.xpath("//input[@name='minutes_charges']"));
		chrg.sendKeys(lclchrg);
		WebElement interchrg=driver.findElement(By.xpath("//input[@name='inter_charges']"));
		interchrg.sendKeys(intrchrg);
		WebElement smschrg=driver.findElement(By.xpath("//input[@name='sms_charges']"));
		smschrg.sendKeys(schrg);
}
	public void tariffbtn() {
		
		
		WebElement btn=driver.findElement(By.xpath("//input[@name='submit']"));
		btn.click();
		WebElement hometrf=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button']")));
		hometrf.click();
}
}