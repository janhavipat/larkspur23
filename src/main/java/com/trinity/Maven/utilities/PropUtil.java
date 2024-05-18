package com.trinity.Maven.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * This class can be use to read properties files. It contains utility method to read any properties file in different way.
 * @author 91860
 */
public class PropUtil {
	private String filePath;
	/**
	 * This method can be used to get value of a specified key
	 * @param filepath from which you want 
	 * @param key for which unit value
	 * @return{@code String } representation of value
	 * 
	 */
	public PropUtil(String locatorFile) {
		filePath = locatorFile;
			}
	
	public PropUtil() {
	}
	
	
	public String getValue(String filepath,String key) {
		FileInputStream fis = null;

		try {
			 fis = new  FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String value =prop.getProperty(key);
		return value;
	}
	/**
	 * This method can be used along with {@code properties (String filepath)}
	 * this methods can read file which is initialized during object creation.
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public  String getValue(String key) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
	}


