package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MhDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private MhPKDto id;
	private String mhDescr;
	private String mhSts;
	private BigDecimal mhTotFactor;
	private BigDecimal mhTotImpte;
	private BigDecimal mhTotMov;
	private BigDecimal mhTotVt;
}