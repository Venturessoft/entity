package com.vsm.lib.utilitys;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fecha { 
	enum Format{FORMAT1("yyyy-MM-dd"),FORMAT2("yyyy-dd-MM"),FORMAT3("dd-MM-yyyy"),FORMAT4("MM-dd-yyyy");	 
	private String format;	 
	    Format(String envFormat) {
	    	this.format = envFormat;
	    }	 
	    public String getFormat() {
	        return format;
	    }
	}	
	public Fecha() {}
	
	public LocalDateTime parse (String date) {
		date = date.replace("/", "-");		
		for(Format format : Format.values()) {
			try { 
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format.getFormat()); 
				LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
				return dateTime;
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return LocalDateTime.now();
	}
	
	public boolean isDateValid(String cadena){
		String regex = "^([0-2][0-9]|3[0-1])(\\/)(0[1-9]|1[0-2])\\2(\\d{4})$";
		Pattern p = Pattern.compile(regex);		 
		if (cadena == null) { 
			return false;
        }		 
		Matcher m = p.matcher(cadena);
		return m.matches();
	}
}