package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HdDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HdPKDto id;
	private String hdMes01;
	private String hdMes02;
	private String hdMes03;
	private String hdMes04;
	private String hdMes05;
	private String hdMes06;
	private String hdMes07;
	private String hdMes08;
	private String hdMes09;
	private String hdMes10;
	private String hdMes11;
	private String hdMes12;
}