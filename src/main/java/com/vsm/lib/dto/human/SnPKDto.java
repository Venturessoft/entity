package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SnPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private BigDecimal snCia;
	private BigDecimal snConcepto;
	private BigDecimal snNumEmp;
	private BigDecimal snNumRef;
}