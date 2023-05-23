package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PcUserDefDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long userSkey;
	private String activeInd;
	private LocalDateTime connectDate;
	private LocalDateTime createDate;
	private String createUserId;
	private String emailAddress;
	private LocalDateTime expiredDate;
	private String externo;
	private String faxNbr;
	private String firstName;
	private String homePhone;
	private String lastName;
	private BigDecimal locationSkey;
	private LocalDateTime maintDate;
	private String maintUserId;
	private String mi;
	private String password;
	private String password2;
	private String password3;
	private String password4;
	private String password5;
	private String password6;
	private String password7;
	private String resetPass;
	private String sccDb;
	private String specialAtrib;
	private String ssn;
	private String tipoUser;
	private String userId;
	private String workExt;
	private String workPhone;
}