package com.vsm.lib.utilitys;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
	public Utils() {}
	
	public boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
	
	public boolean isEmailValid(String email) {
	   Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	   Matcher mather = pattern.matcher(email);
	   if (mather.find() == true) { 
		   return true;
	   } else {
		   return false;
	   }
	}
}