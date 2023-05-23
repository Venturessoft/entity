package com.vsm.lib.dto.seldb; 
 
import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface IPcUserDefDto {
	long getUserSkey();
	String getActiveInd();
	LocalDateTime getConnectDate();
	LocalDateTime getCreateDate();
	String getCreateUserId();
	String getEmailAddress();
	LocalDateTime getExpiredDate();
	String getExterno();
	String getFaxNbr();
	String getFirstName();
	String getHomePhone();
	String getLastName();
	BigDecimal getLocationSkey();
	LocalDateTime getMaintDate();
	String getMaintUserId();
	String getMi();
	String getPassword();
	String getPassword2();
	String getPassword3();
	String getPassword4();
	String getPassword5();
	String getPassword6();
	String getPassword7();
	String getResetPass();
	String getSccDb();
	String getSpecialAtrib();
	String getSsn();
	String getTipoUser();
	String getUserId();
	String getWorkExt();
	String getWorkPhone();
}