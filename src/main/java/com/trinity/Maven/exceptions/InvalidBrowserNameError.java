package com.trinity.Maven.exceptions;

import com.trinity.Maven.utilities.PropUtil;

public class InvalidBrowserNameError extends Error {
	 private String msg;
	 public InvalidBrowserNameError(String browserName) {;
      msg = "Invakid browser name:"+ browserName;
      PropUtil prop = new PropUtil();
}
	 @Override
	public String toString() {
		 return msg;
	}
}
