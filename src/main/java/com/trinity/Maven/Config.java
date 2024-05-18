package com.trinity.Maven;

import java.io.IOException;

import com.trinity.Maven.utilities.PropUtil;
import com.trinity.Maven.Config;

public class Config {


public String getBrowserName()   {
	return readProperty("browser_name");
}

public String getAppUrl() {
return readProperty("app_url");
}

public String getUsername() {
   return readProperty("username");
}
public String readProperty(String proprerty) {
	String baseDir = System.getProperty("user.dir");
      PropUtil prop = new PropUtil(baseDir+"/src/main/resources/Config.properties");
      String value = null;

       try {
	      value =prop.getValue(proprerty);
      } catch (IOException e) {
        	e.printStackTrace();
    }
return value;

}
}

