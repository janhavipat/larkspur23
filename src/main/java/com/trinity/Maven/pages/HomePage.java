package com.trinity.Maven.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trinity.Maven.Base.TestBase;

public class HomePage {
	//private static final WebElement Zipcode = null;

	//public static final String enterAddressState = null;

	@FindBy(xpath="//a[contains(text(),'Register')]")
       public WebElement register;
	
	@FindBy(xpath="//input[@id='customer.firstName']")
     public WebElement firstName;
	
    @FindBy(xpath="//input[@id='customer.lastName']")
    public WebElement lastName;
	

			
    @FindBy(xpath="//input[@id='customer.address.street']")
     public WebElement street;
    
   @FindBy(xpath="//input[@id='customer.address.city']")
   public WebElement city;

   @FindBy(xpath="	//input[@id='customer.address.state']")
   public WebElement state;
 
	@FindBy(xpath="//input[@id='customer.address.zipCode']")
	public WebElement zipcode;

	@FindBy(xpath="	//input[@id='customer.phoneNumber']")
     public WebElement phoneNumber;
	
	@FindBy(xpath="	//input[@id='customer.ssn']")
	public WebElement ssn;

	@FindBy(xpath="	//input[@id='customer.username']")
    public WebElement username;
					
	@FindBy(xpath="//input[@id='customer.password']")
    public WebElement password;

	@FindBy(xpath="//input[@id='repeatedPassword']")
    public WebElement repeatedpassword;
				
    @FindBy(xpath="//input[@value='Register']")
    public WebElement registerBTN;

    @FindBy(xpath="//span[@id='customer.lastName.errors']")
    public WebElement lastNameError;

  
    public HomePage() {
		// TODO Auto-generated constructor stub
    	PageFactory.initElements(TestBase.keyword.driver, HomePage.this);
    	}
		 
   public void clickOnRegisterLink() {
     register.click();
}
    public void enteFirstName(String text) {
    	firstName.sendKeys(text);
	}
	public void enterLastName(String text) {
		lastName.sendKeys(text);
		
	}


    
        
    public void enterAddressStreet(String text) {
    street.sendKeys(text);
	}
    
    public void enterAddressCity(String text) {
        city.sendKeys(text);
	}
    
    public void enterAddressState(String text) {
      state.sendKeys(text);
	}
    public void enterZipcode(String text) {
        zipcode.sendKeys(text);
  	}
    public void enterPhoneNumber(String text) {
        phoneNumber.sendKeys(text);
  	}
    public void enterSsn(String text) {
        ssn.sendKeys(text);
  	}
    public void enterUserName(String text) {
        username.sendKeys(text);
  	}
    public void enterPassword(String text) {
        password.sendKeys(text);
  	}
    public void enterRepetedpassword(String text) {
       repeatedpassword.sendKeys(text);
  	}

	public void registerBTN() {
	registerBTN.click();		
	}

	public String getLastNameErrorMsg() {
		return lastNameError.getText();
}

}
    




    
    
    
 