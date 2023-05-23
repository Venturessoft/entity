package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsImpxconDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuEmplsImpxconPKDto id;
	private BigDecimal concepto;
	private BigDecimal importe;
	private String moneda;
	private String status;
}