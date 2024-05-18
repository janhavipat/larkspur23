package com.trinity.Maven.Base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import com.trinity.Maven.Config;
import com.trinity.Maven.Keyword;

public class TestBase {
	public final static Keyword keyword = new Keyword();

	@BeforeMethod
	public void setup() {
	Config config = new Config();
	keyword.openBrowser(config.getBrowserName());
	
	keyword.launchUrl(config.getAppUrl());
		
	}
@AfterClass
public void tearDown() throws Exception {
	keyword.quiteBrowser();
}
}
