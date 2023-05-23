package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MrDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private MrPKDto id;
	private String mrCond1;
	private String mrCond10;
	private String mrCond2;
	private String mrCond3;
	private String mrCond4;
	private String mrCond5;
	private String mrCond6;
	private String mrCond7;
	private String mrCond8;
	private String mrCond9;
	private BigDecimal mrCveCal;
	private BigDecimal mrCveHor;
	private BigDecimal mrCveTurno;
	private String mrDescDom;
	private String mrDescJue;
	private String mrDescLun;
	private String mrDescMar;
	private String mrDescMie;
	private String mrDescSab;
	private String mrDescVie;
	private LocalDateTime mrFechaMov;
	private long mrGafete;
	private String mrSts;
	private String mrUserId;
}