package com.trinity.Maven;

import org.openqa.selenium.By;

public interface Locator {
String REGISTRILINK ="//a[contains(text(),'Register')]";
String FIRSTNAME ="//input[@id='customer.firstName']";
String ADDRESS="//input[@id='customer.address.street']";
String CITY="//input[@id='customer.address.city']";
String STATE="//input[@id='customer.address.state']";
String ZIPCODE=	"//input[@id='customer.address.zipCode']";
String PHONENUMBER="//input[@id='customer.phoneNumber']";
String SSN="//input[@id='customer.ssn']";
String USERNAME="//input[@id='customer.username']";
String PASSWORD="//input[@id='customer.password']";
String REPETEDPASSOWORD="//input[@id='repeatedPassword']";
String REGISTRIBTN="//input[@value='Register']";
String LASTNAMEERROR ="//span[@id='customer.lastName.errors']";


}
