package com.trinity.Maven;

import java.io.IOException;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.trinity.Maven.Base.TestBase;
import com.trinity.Maven.pages.HomePage;
import com.trinity.Maven.utilities.PropUtil;

public class TestCases extends TestBase {
	@Test
	public void verifyIfLastNameFieldRequiredOrNot() {

FluentWait<WebDriver> wait = new FluentWait<WebDriver> (keyword.driver);
wait.withTimeout(Duration.ofSeconds(15));
wait.pollingEvery(Duration.ofMillis(500));
wait.withMessage("Element was not found");
wait.ignoring(NoSuchElementException.class);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Register')]")));

keyword.driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();

String expectedErrorMsg ="Last name is required.";

keyword.driver.findElement(By.xpath("//input[@id=\"customer.firstName\"]")).sendKeys("Janhavi");
keyword.driver.findElement(By.xpath("//input[@id=\"customer.address.street\"]")).sendKeys("Baner");
keyword.driver.findElement(By.xpath("//input[@id=\"customer.address.city\"]")).sendKeys("Pune");
keyword.driver.findElement(By.xpath("//input[@id=\"customer.address.state\"]")).sendKeys("Maharastra");
keyword.driver.findElement(By.xpath("//input[@id=\"customer.address.zipCode\"]")).sendKeys("413512");
keyword.driver.findElement(By.xpath("//input[@id=\"customer.phoneNumber\"]")).sendKeys("8605820957");
keyword.driver.findElement(By.xpath("//input[@id=\"customer.ssn\"]")).sendKeys("551248hgfd45po");
keyword.driver.findElement(By.xpath("//input[@id=\"customer.username\"]")).sendKeys("TestUser");
keyword.driver.findElement(By.xpath("//input[@id=\"customer.password\"]")).sendKeys("test@123");
keyword.driver.findElement(By.xpath("//input[@id=\"repeatedPassword\"]")).sendKeys("test@123");

keyword.driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();
String errMSG =keyword. driver.findElement(By.xpath("//span[@id=\"customer.lastName.errors\"]")).getText();

Assert.assertEquals(errMSG, expectedErrorMsg);

	}
	@Test
public void verifyIfLastNameFieldRequired() throws IOException{
	
		
		String expectedErrorMsg ="Last name is required.";

		Config conf = new Config();
		
		
		String dir =System.getProperty("user.dir");
		
		 String filePath = dir+"/src/test/resources/Locators.properties";
		 
			PropUtil prop = new PropUtil(filePath);
          
			String reglink = prop.getValue("REGISTRILINK");
            keyword.click(reglink);
		
		//keyword.click(prop.getValue(filePath, "REGISTRILINK"));
		keyword.click(prop.getValue("REGISTRILINK"));
	
		keyword.enterText(Locator.FIRSTNAME, "Janhavi");
		keyword.enterText(Locator.ADDRESS, "Baner");
		keyword.enterText(Locator.CITY, "pune");
		keyword.enterText(Locator.STATE, "Maharastra");
		keyword.enterText(Locator.ZIPCODE, "413512");
		keyword.enterText(Locator.PHONENUMBER, "8605820957");
		keyword.enterText(Locator.SSN, "1254lkjhg78shd");
		keyword.enterText(Locator.USERNAME, "TestUser");
		keyword.enterText(Locator.PASSWORD, "test@123");
		keyword.enterText(Locator.REPETEDPASSOWORD, "test@123");
        keyword.click(Locator.REGISTRIBTN);
		
		//keyword.getText(Locator.LASTNAMEERROR);
		
		String errorMsg =keyword.getText(Locator.LASTNAMEERROR);
		
		Assert.assertEquals(errorMsg, expectedErrorMsg);
	}
	@Test
	public void verifyIfLastNameFieldRequiredUsingPOM() {
		
		String expectedErrorMsg ="Last name is required.";

		HomePage home = new HomePage();
		home.clickOnRegisterLink();
        home.enteFirstName("Janhavi");
        home.enterAddressStreet("Baner");
        home.enterAddressCity("pune");
        home.enterAddressState("maharastra");
        home.enterPhoneNumber("8605820957");
        home.enterZipcode("413512");
        home.enterSsn("457jhfdf45fdde");
        home.enterUserName("TestUsre");
        home.enterPassword("test@123");
        home.enterPassword("test@123");
        home.registerBTN();
        
      String errMSG = home.getLastNameErrorMsg();
      Assert.assertEquals(errMSG, expectedErrorMsg);
        
	}
	@Test
public	void virefySSNErrorMsgWhenUserFlidRequiredUsingPOM() {
		String expectedErrorMsg ="Social Security Number is required.\r\n";
		
		HomePage home = new HomePage();
		home.clickOnRegisterLink();
       
		home.enteFirstName("Janhavi");
		home.enterLastName("Patil");
        home.enterAddressStreet("Baner");
        home.enterAddressCity("pune");
        home.enterAddressState("maharastra");
        home.enterZipcode("413512");
        home.enterPhoneNumber("8605820957");
        home.enterUserName("TestUsre");
        home.enterPassword("test@123");
        home.enterPassword("test@123");
        home.registerBTN();
        
      String errMSG = home.getLastNameErrorMsg();
      Assert.assertEquals(errMSG, expectedErrorMsg);

		
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
